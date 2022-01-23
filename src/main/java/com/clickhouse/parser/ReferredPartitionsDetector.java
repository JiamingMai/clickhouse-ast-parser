package com.clickhouse.parser;

import com.clickhouse.parser.ast.*;
import com.clickhouse.parser.ast.expr.*;
import com.google.common.collect.Sets;
import com.clickhouse.util.DateUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
@Data
public class ReferredPartitionsDetector extends AstVisitor {

    private List<SelectUnionQuery> selectUnionQueryList = new ArrayList<>();

    private List<String> tables = new ArrayList<>();
    private List<String> tablePartitions = new ArrayList<>();

    private Map<SelectStatement, List<String>> tablesInSelectStatements = new HashMap<>();

    private volatile SelectStatement currentSelectStatement;

    private List<FilterCondition> filterConditions = new ArrayList<>();

    private final String POSITIVE_INF = "positive_inf";
    private final String NEGATIVE_INF = "negative_inf";
    private final String MAX_LOWER_BOUND = "2018-01-01";
    private final Long MAX_LOWER_BOUND_TIMESTAMP = 1514736000000L;

    private String todayDate;
    private String targetIp;
    private MetadataService metadataService;
    private final Map<String, String> tablePartitionColNameMap = new HashMap<>();

    public ReferredPartitionsDetector(String todayDate, String targetIp, MetadataService metadataService) {
        this.todayDate = todayDate;
        this.targetIp = targetIp;
        this.metadataService = metadataService;
    }

    public List<String> searchTables(INode node) {
        if (tables.size() > 0) {
            return tables;
        }
        visit(node);
        return tables;
    }

    public List<String> searchTablePartitions(INode node) {
        try {
            if (tablePartitions.size() > 0) {
                return tablePartitions;
            }
            visit(node);
            for (FilterCondition filterCondition : filterConditions) {
                String tableFullName = filterCondition.getDatabase() + "." + filterCondition.getTable();
                Set<String> elements = new HashSet<>();
                filterCondition.getSpecElementsList().forEach(set -> elements.addAll(set.getElements()));
                for (String partitionValue : elements) {
                    try {
                        long partitionValueTimestamp = DateUtil.parseDate(partitionValue).getTime();
                        if (partitionValueTimestamp > MAX_LOWER_BOUND_TIMESTAMP) {
                            tablePartitions.add(tableFullName + "." + partitionValue);
                        }
                    } catch (Exception e) {
                        log.error("", e);
                    }
                }
            }
            return tablePartitions;
        } catch (Exception e) {
            log.error("", e);
            return Collections.emptyList();
        }
    }

    public List<SelectUnionQuery> searchSelectUnionQueryStatements(INode node) {
        visit(node);
        return selectUnionQueryList;
    }

    @Override
    public Object visitSelectUnionQuery(SelectUnionQuery selectUnionQuery) {
        if (null != selectUnionQuery) {
            selectUnionQueryList.add(selectUnionQuery);
        }
        for (SelectStatement selectStatement : selectUnionQuery.getStatements()) {
            currentSelectStatement = selectStatement;
            visitSelectStatement(selectStatement);
        }
        return null;
    }

    @Override
    public Object visitSubqueryColumnExpr(ColumnExpr expr) {
        if (expr instanceof SubqueryColumnExpr) {
            SubqueryColumnExpr subqueryColumnExpr = (SubqueryColumnExpr) expr;
            SelectUnionQuery selectUnionQuery = subqueryColumnExpr.getQuery();
            selectUnionQueryList.add(selectUnionQuery);
        }
        return super.visitSubqueryColumnExpr(expr);
    }

    @Override
    public Object visitTableIdentifier(TableIdentifier tableIdentifier) {
        tables.add(tableIdentifier.getQualifiedName());
        if (!tablesInSelectStatements.containsKey(currentSelectStatement)) {
            List<String> tablesInStmt = new ArrayList<>();
            tablesInSelectStatements.put(currentSelectStatement, tablesInStmt);
        }
        List<String> tablesInStmt = tablesInSelectStatements.get(currentSelectStatement);
        tablesInStmt.add(tableIdentifier.getQualifiedName());
        return super.visitTableIdentifier(tableIdentifier);
    }

    @Override
    public Object visitFunctionColumnExpr(ColumnExpr expr) {
        if (expr instanceof FunctionColumnExpr) {
            FunctionColumnExpr columnExpr = (FunctionColumnExpr) expr;
            FilterCondition filterCondition = doWithLogicalOperator(columnExpr);
            if (null != filterCondition) {
                filterConditions.add(filterCondition);
            }
        }
        return null;
    }

    public FilterCondition doWithLogicalOperator(FunctionColumnExpr funcColumnExpr) {
        if (!isAndOperator(funcColumnExpr) && !isOrOperator(funcColumnExpr)) {
            if (!isComparisonOperator(funcColumnExpr.getName())) {
                return null;
            }
            FilterCondition filterCondition = doWithComparisonOperator(funcColumnExpr);
            return filterCondition;
        }
        String operator = extractOperator(funcColumnExpr);

        List<ColumnExpr> args = funcColumnExpr.getArgs();
        ColumnExpr left = args.get(0);
        ColumnExpr right = args.get(1);
        FilterCondition leftCondition = null;
        FilterCondition rightCondition = null;
        if (left instanceof FunctionColumnExpr) {
            FunctionColumnExpr leftNode = (FunctionColumnExpr) left;
            leftCondition = doWithLogicalOperator(leftNode);
        }
        if (right instanceof FunctionColumnExpr) {
            FunctionColumnExpr rightNode = (FunctionColumnExpr) right;
            rightCondition = doWithLogicalOperator(rightNode);
        }
        FilterCondition mergedCondition = mergeConditions(operator, leftCondition, rightCondition);
        return mergedCondition;
    }

    /**
     * For example, we rewrite today() - ftime <= 5 to ftime >= today() - 5
     */
    private FunctionColumnExpr rewriteCompareExpression(FunctionColumnExpr compareFuncColExpr) {
        FunctionColumnExpr leftExpr = (FunctionColumnExpr) compareFuncColExpr.getArgs().get(0);
        List<ColumnExpr> leftArgs = leftExpr.getArgs();
        String partitionColPosition = isPartitionColumnCondition(leftArgs.get(0)) ? "left" : "right";

        // Do we need to change reverse operator?
        if (partitionColPosition.equals("right") && leftExpr.getName().getName().equals("minus")) {
            List<ColumnExpr> colExprArgs = compareFuncColExpr.getArgs();
            colExprArgs.remove(0);
            ColumnExpr rightExpr = colExprArgs.remove(0);

            // build left term
            colExprArgs.add(leftArgs.get(1));

            // build right term
            List<ColumnExpr> newExprArgs =  new ArrayList<>();
            newExprArgs.add(leftArgs.get(0));
            newExprArgs.add(rightExpr);
            colExprArgs.add(ColumnExpr.createFunction(new Identifier("minus"), null, newExprArgs));

            // reverse compare operator
            List<ColumnExpr> params = compareFuncColExpr.getParams();
            List<ColumnExpr> args = compareFuncColExpr.getArgs();
            switch (compareFuncColExpr.getName().getName()) {
                case "greaterOrEquals":
                    compareFuncColExpr = ColumnExpr.createFunction(new Identifier("lessOrEquals"), params, args);
                case "greater":
                    compareFuncColExpr = ColumnExpr.createFunction(new Identifier("less"), params, args);
                case "lessOrEquals":
                    compareFuncColExpr = ColumnExpr.createFunction(new Identifier("greaterOrEquals"), params, args);
                case "less":
                    compareFuncColExpr = ColumnExpr.createFunction(new Identifier("greater"), params, args);
                    break;
                case "notEquals":
                case "equals":
                case "in":
                    break;
            }
        } else if (partitionColPosition.equals("right") && leftExpr.getName().getName().equals("add")) {
            List<ColumnExpr> colExprArgs = compareFuncColExpr.getArgs();
            colExprArgs.remove(0);
            ColumnExpr rightExpr = colExprArgs.remove(0);

            // build left term
            colExprArgs.add(leftArgs.get(1));

            // build right term
            List<ColumnExpr> newExprArgs =  new ArrayList<>();
            newExprArgs.add(rightExpr);
            newExprArgs.add(leftArgs.get(0));
            colExprArgs.add(ColumnExpr.createFunction(new Identifier("minus"), null, newExprArgs));
        } else if (partitionColPosition.equals("left") && leftExpr.getName().getName().equals("minus")) {
            List<ColumnExpr> colExprArgs = compareFuncColExpr.getArgs();
            colExprArgs.remove(0);
            ColumnExpr rightExpr = colExprArgs.remove(0);

            // build left term
            colExprArgs.add(leftArgs.get(0));

            // build right term
            List<ColumnExpr> newExprArgs =  new ArrayList<>();
            newExprArgs.add(rightExpr);
            newExprArgs.add(leftArgs.get(0));
            colExprArgs.add(ColumnExpr.createFunction(new Identifier("add"), null, newExprArgs));
        } else if (partitionColPosition.equals("left") && leftExpr.getName().getName().equals("add")) {
            List<ColumnExpr> colExprArgs = compareFuncColExpr.getArgs();
            colExprArgs.remove(0);
            ColumnExpr rightExpr = colExprArgs.remove(0);

            // build left term
            colExprArgs.add(leftArgs.get(0));

            // build right term
            List<ColumnExpr> newExprArgs =  new ArrayList<>();
            newExprArgs.add(rightExpr);
            newExprArgs.add(leftArgs.get(0));
            colExprArgs.add(ColumnExpr.createFunction(new Identifier("minus"), null, newExprArgs));
        }

        return compareFuncColExpr;
    }

    private FilterCondition doWithComparisonOperator(FunctionColumnExpr funcColExpr) {
        Identifier identifier = funcColExpr.getName();
        if (null == identifier) {
            return null;
        }
        if (!isComparisonOperator(identifier)) {
            return null;
        }
        List<ColumnExpr> args = funcColExpr.getArgs();
        if (!isPartitionColumnCondition(args.get(0))) {
            return null;
        }

        if (args.get(0) instanceof FunctionColumnExpr) {
            // rewrite the AST
            FunctionColumnExpr rewrittenFuncColExpr = rewriteCompareExpression(funcColExpr);
            return doWithComparisonOperator(rewrittenFuncColExpr);
        } else {
            IdentifierColumnExpr identifierColumnExpr = (IdentifierColumnExpr) args.get(0);
            ColumnIdentifier columnIdentifier = identifierColumnExpr.getIdentifier();
            String columnName = columnIdentifier.getName();
            String database = columnIdentifier.getTable().getDatabase().getName();
            String table = columnIdentifier.getTable().getName();

            String value = extractFilterConditionValue(args.get(1));
            if (null == value) {
                return null;
            }

            FilterCondition filterCondition = new FilterCondition(database, table, columnName);
            switch (identifier.getName()) {
                case "greaterOrEquals":
                    filterCondition.addFilterRange(value, POSITIVE_INF);
                    break;
                case "greater":
                    filterCondition.addFilterRange(nextDay(value), POSITIVE_INF);
                    break;
                case "lessOrEquals":
                    filterCondition.addFilterRange(NEGATIVE_INF, value);
                    break;
                case "less":
                    filterCondition.addFilterRange(NEGATIVE_INF, lastDay(value));
                    break;
                case "notEquals":
                    filterCondition.addFilterRange(NEGATIVE_INF, lastDay(value));
                    filterCondition.addFilterRange(nextDay(value), POSITIVE_INF);
                    break;
                case "equals":
                    filterCondition.addFilterRange(value, value);
                    break;
                case "in":
                    FilterSpecElements filterSpecElements = new FilterSpecElements();
                    Set<String> argSet = new HashSet<>();
                    for (ColumnExpr arg : args) {
                        String argVal = extractFilterConditionValue(arg);
                        argSet.add(argVal);
                    }
                    filterSpecElements.setElements(argSet);
                    filterCondition.addFilterRange(filterSpecElements);
                    break;
                default:
            }
            return filterCondition;
        }
    }

    private boolean isComparisonOperator(Identifier identifier) {
        if (null == identifier) {
            return false;
        }
        String operatorName = identifier.getName();
        if (null == operatorName) {
            return false;
        }
        switch (operatorName) {
            case "greaterOrEquals":
            case "greater":
            case "lessOrEquals":
            case "less":
            case "notEquals":
            case "equals":
            case "in":
                return true;
            default:
        }
        return false;
    }

    private String extractFilterConditionValue(ColumnExpr valueColumnExpr) {
        String value = null;
        if (valueColumnExpr instanceof FunctionColumnExpr) {
            FunctionColumnExpr funcColExpr = (FunctionColumnExpr) valueColumnExpr;
            Identifier identifier = funcColExpr.getName();
            String functionName = identifier.getName();
            switch (functionName) {
                case "toDateTime": {
                    List<ColumnExpr> args = funcColExpr.getArgs();
                    ColumnExpr arg = args.get(0);
                    if (arg instanceof LiteralColumnExpr) {
                        LiteralColumnExpr literalColumnExpr = (LiteralColumnExpr) arg;
                        value = literalColumnExpr.getLiteral().asStringWithoutQuote();
                    } else if (args instanceof FunctionColumnExpr) {
                        value = translateDateFunction((FunctionColumnExpr) args);
                    }

                    try {
                        long longVal = Long.parseLong(value);
                        value = DateUtil.formatDate(new Date(Long.parseLong(value + "000")));
                    } catch (Exception e) {
                        log.error("", e);
                    }
                }
                break;
                case "toDate":
                    List<ColumnExpr> args = funcColExpr.getArgs();
                    ColumnExpr arg = args.get(0);
                    if (arg instanceof LiteralColumnExpr) {
                        LiteralColumnExpr literalColumnExpr = (LiteralColumnExpr) arg;
                        value = literalColumnExpr.getLiteral().asStringWithoutQuote();
                    } else if (args instanceof FunctionColumnExpr) {
                        value = translateDateFunction((FunctionColumnExpr) args);
                    }
                    break;
                case "addDays":
                    List<ColumnExpr> addDaysArgs = funcColExpr.getArgs();
                    ColumnExpr firstArg = addDaysArgs.get(0);
                    String baseDate = "";
                    if (firstArg instanceof LiteralColumnExpr) {
                        LiteralColumnExpr columnExpr1 = (LiteralColumnExpr) firstArg;
                        baseDate = columnExpr1.getLiteral().asStringWithoutQuote();
                    } else if (firstArg instanceof FunctionColumnExpr) {
                        baseDate = translateDateFunction((FunctionColumnExpr) firstArg);
                    }
                    // get the offset value
                    ColumnExpr secondArg = addDaysArgs.get(1);
                    LiteralColumnExpr columnExpr2 = (LiteralColumnExpr) secondArg;
                    int offset = Integer.valueOf(columnExpr2.getLiteral().toString());
                    value = addDays(baseDate, offset);
                    break;
                case "today":
                case "yesterday":
                    value = translateDateFunction(funcColExpr);
                    break;
                case "minus":
                    List<ColumnExpr> minusDaysArgs = funcColExpr.getArgs();
                    ColumnExpr firstMinusArg = minusDaysArgs.get(0);
                    String baseMinusDate = "";
                    if (firstMinusArg instanceof LiteralColumnExpr) {
                        LiteralColumnExpr columnExpr1 = (LiteralColumnExpr) firstMinusArg;
                        baseMinusDate = columnExpr1.getLiteral().asStringWithoutQuote();
                    } else if (firstMinusArg instanceof FunctionColumnExpr) {
                        baseMinusDate = translateDateFunction((FunctionColumnExpr) firstMinusArg);
                    }
                    // get the offset value
                    ColumnExpr secondMinusArg = minusDaysArgs.get(1);
                    LiteralColumnExpr minusColumnExpr2 = (LiteralColumnExpr) secondMinusArg;
                    int minusOffset = Integer.valueOf(minusColumnExpr2.getLiteral().toString());
                    value = addDays(baseMinusDate, -minusOffset);
                    break;
                case "add":
                    List<ColumnExpr> addOpDaysArgs = funcColExpr.getArgs();
                    ColumnExpr firstAddArg = addOpDaysArgs.get(0);
                    String baseAddDate = "";
                    if (firstAddArg instanceof LiteralColumnExpr) {
                        LiteralColumnExpr columnExpr1 = (LiteralColumnExpr) firstAddArg;
                        baseAddDate = columnExpr1.getLiteral().asStringWithoutQuote();
                    } else if (firstAddArg instanceof FunctionColumnExpr) {
                        baseAddDate = translateDateFunction((FunctionColumnExpr) firstAddArg);
                    }
                    // get the offset value
                    ColumnExpr secondAddArg = addOpDaysArgs.get(1);
                    LiteralColumnExpr addColumnExpr2 = (LiteralColumnExpr) secondAddArg;
                    int addOffset = Integer.valueOf(addColumnExpr2.getLiteral().toString());
                    value = addDays(baseAddDate, addOffset);
                    break;
                default:
            }
        } else if (valueColumnExpr instanceof LiteralColumnExpr) {
            LiteralColumnExpr literalColumnExpr = (LiteralColumnExpr) valueColumnExpr;
            value = literalColumnExpr.getLiteral().asStringWithoutQuote();
        }
        return value;
    }

    private String translateDateFunction(FunctionColumnExpr functionColumnExpr) {
        String functionName = functionColumnExpr.getName().getName();
        switch (functionName) {
            case "today":
                return todayDate;
            case "yesterday":
                return lastDay(todayDate);
            case "toDate":
                List<ColumnExpr> args = functionColumnExpr.getArgs();
                ColumnExpr arg = args.get(0);
                LiteralColumnExpr literalColumnExpr = (LiteralColumnExpr) arg;
                return literalColumnExpr.getLiteral().asStringWithoutQuote();
            case "now":
                return DateUtil.formatDate(new Date());
            default:
        }
        return null;
    }

    private boolean isPartitionColumnCondition(ColumnExpr column) {
        if (null == column) {
            return false;
        }
        if (column instanceof FunctionColumnExpr) {
            FunctionColumnExpr funcColExpr = (FunctionColumnExpr) column;
            String functionName = funcColExpr.getName().getName();
            if (!functionName.equals("minus") && !functionName.equals("add")) {
                return false;
            } else {
                List<ColumnExpr> colExprArgs = funcColExpr.getArgs();
                boolean hasPartitionCol = false;
                for (ColumnExpr arg : colExprArgs) {
                    if (isPartitionColumnCondition(arg)) {
                        hasPartitionCol = true;
                        break;
                    }
                }
                return hasPartitionCol;
            }
        }
        if (!(column instanceof IdentifierColumnExpr)) {
            return false;
        }

        IdentifierColumnExpr identifierColumnExpr = (IdentifierColumnExpr) column;
        ColumnIdentifier columnIdentifier = identifierColumnExpr.getIdentifier();
        String columnName = columnIdentifier.getName();
        TableIdentifier tableIdentifier = columnIdentifier.getTable();
        if (null == tableIdentifier) {
            return false;
        }
        Identifier dbIdentifier = tableIdentifier.getDatabase();
        if (null == dbIdentifier) {
            return false;
        }
        String databaseName = dbIdentifier.getName();
        String tableName = tableIdentifier.getName();
        // TODO: get partition column name according table name here
        String partitionColumnName = getPartitionColumnName(databaseName, tableName, targetIp);

        if (null == columnName || !columnName.equals(partitionColumnName)) {
            return false;
        }
        return true;
    }

    private String getPartitionColumnName(String databaseName, String tableName, String targetIp) {
        String tableFullName = databaseName + "." + tableName;
        if (tablePartitionColNameMap.containsKey(tableFullName)) {
            return tablePartitionColNameMap.get(tableFullName);
        }
        String partitionColumnName = metadataService.getPartitionColName(tableFullName);
        if (null != partitionColumnName && !partitionColumnName.isEmpty()) {
            tablePartitionColNameMap.put(tableFullName, partitionColumnName);
        }
        return partitionColumnName;
    }

    private FilterCondition mergeConditions(String logicalOperator, FilterCondition firstCondition, FilterCondition secondCondition) {
        if (null == firstCondition) {
            return secondCondition;
        }
        if (null == secondCondition) {
            return firstCondition;
        }
        FilterCondition filterCondition = new FilterCondition(
                firstCondition.getDatabase(),
                firstCondition.getTable(),
                firstCondition.getColumnName());
        FilterSpecElements mergedResult;
        switch (logicalOperator.toLowerCase()) {
            case "and":
                mergedResult = intersectFilterRanges(firstCondition.getSpecElementsList(), secondCondition.getSpecElementsList());
                filterCondition.addFilterRange(mergedResult);
                return filterCondition;
            case "or":
                mergedResult = unionFilterRanges(firstCondition.getSpecElementsList(), secondCondition.getSpecElementsList());
                filterCondition.addFilterRange(mergedResult);
                return filterCondition;
            default:
        }
        return filterCondition;
    }

    private FilterSpecElements mergeFilterRange(String logicalOperator, FilterSpecElements range1, FilterSpecElements range2) {
        switch (logicalOperator) {
            case "and":
                return intersectFilterRanges(range1, range2);
            case "or":
                return unionFilterRanges(range1, range2);
            default:
        }
        return null;
    }

    private FilterSpecElements intersectFilterRanges(List<FilterSpecElements> ranges1, List<FilterSpecElements> ranges2) {
        FilterSpecElements range1 = unionFilterRanges(ranges1);
        FilterSpecElements range2 = unionFilterRanges(ranges2);
        return intersectFilterRanges(range1, range2);
    }

    /**
     * A ∩ (B ∪ C) => (A ∩ B) ∪ (A ∩ C)
     *
     * @param range1
     * @param ranges
     * @return
     */
    private FilterSpecElements intersectFilterRanges(FilterSpecElements range1, List<FilterSpecElements> ranges) {
        FilterSpecElements range2 = unionFilterRanges(ranges);
        return intersectFilterRanges(range1, range2);
    }

    private FilterSpecElements intersectFilterRanges(FilterSpecElements range1, FilterSpecElements range2) {
        Set<String> mergedRange = Sets.intersection(range1.getElements(), range2.getElements());
        FilterSpecElements intersectionResult = new FilterSpecElements(mergedRange);
        return intersectionResult;
    }

    private FilterSpecElements unionFilterRanges(List<FilterSpecElements> ranges1, List<FilterSpecElements> ranges2) {
        FilterSpecElements range1 = unionFilterRanges(ranges1);
        FilterSpecElements range2 = unionFilterRanges(ranges2);
        return unionFilterRanges(range1, range2);
    }

    private FilterSpecElements unionFilterRanges(List<FilterSpecElements> ranges) {
        if (null == ranges || ranges.isEmpty()) {
            return new FilterSpecElements();
        }
        FilterSpecElements mergedRange = ranges.get(0);
        for (int i = 1; i < ranges.size(); i++) {
            FilterSpecElements range2 = ranges.get(i);
            mergedRange = unionFilterRanges(mergedRange, range2);
        }
        return mergedRange;
    }

    /**
     * A U (B ∪ C) => A U B ∪ C
     *
     * @param range1
     * @param ranges
     * @return
     */
    private FilterSpecElements unionFilterRanges(FilterSpecElements range1, List<FilterSpecElements> ranges) {
        Set<String> mergedRange = range1.getElements();
        for (FilterSpecElements range : ranges) {
            mergedRange = Sets.union(mergedRange, range.getElements());
        }
        FilterSpecElements unionResult = new FilterSpecElements(mergedRange);
        return unionResult;
    }

    private FilterSpecElements unionFilterRanges(FilterSpecElements range1, FilterSpecElements range2) {
        Set<String> mergedRange = Sets.union(range1.getElements(), range2.getElements());
        FilterSpecElements unionResult = new FilterSpecElements(mergedRange);
        return unionResult;
    }

    private String extractOperator(FunctionColumnExpr funcColExpr) {
        Identifier identifier = funcColExpr.getName();
        if (null != identifier) {
            String name = identifier.getName();
            return name;
        } else {
            return null;
        }
    }

    private boolean isAndOperator(FunctionColumnExpr funcColExpr) {
        Identifier identifier = funcColExpr.getName();
        if (null != identifier) {
            String name = identifier.getName();
            if (null != name && name.toLowerCase().equals("and")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean isOrOperator(FunctionColumnExpr funcColExpr) {
        Identifier identifier = funcColExpr.getName();
        if (null != identifier) {
            String name = identifier.getName();
            if (null != name && name.toLowerCase().equals("or")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private String lastDay(String dateStr) {
        return addDays(dateStr, -1);
    }

    private String nextDay(String dateStr) {
        return addDays(dateStr, 1);
    }

    private String addDays(String dateStr, int offset) {
        try {
            Date date = DateUtil.parseDate(dateStr);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(Calendar.DATE, offset);
            String lastDayStr = DateUtil.formatDate(calendar.getTime());
            return lastDayStr;
        } catch (Exception e) {
            log.error("", e);
        }
        return null;
    }

}
