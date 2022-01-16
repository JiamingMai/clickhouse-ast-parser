package com.clickhouse.visitor;

import com.clickhouse.parser.ast.*;
import com.clickhouse.parser.ast.expr.*;
import com.clickhouse.parser.AstVisitor;

import java.util.List;

public class BaseSqlBuilder extends AstVisitor<String> {

    private String joinerSymbol = ".";

    public BaseSqlBuilder() {
    }

    public BaseSqlBuilder(String joinerSymbol) {
        this.joinerSymbol = joinerSymbol;
    }

    public String build(SelectUnionQuery ast) {
        String sql = visit(ast);
        return sql;
    }

    @Override
    public String visitSelectUnionQuery(SelectUnionQuery selectUnionQuery) {
        StringBuffer sqlBuffer = new StringBuffer();
        List<SelectStatement> selectStatements = selectUnionQuery.getStatements();
        for (int i = 0; i < selectStatements.size(); i++) {
            if (i != 0) {
                sqlBuffer.append(" UNION ALL ");
            }
            SelectStatement selectStatement = selectStatements.get(i);
            String selectStat = visitSelectStatement(selectStatement);
            sqlBuffer.append(selectStat);
        }
        String format = selectUnionQuery.getFormat();
        if (null != format && !format.isEmpty()) {
            sqlBuffer.append(" FORMAT " + format);
        }
        return sqlBuffer.toString();
    }

    @Override
    public String visitSelectStatement(SelectStatement selectStatement) {
        String withStat = "";
        String columnExprStat = "";
        String fromStat = "";
        String arrayJoinStat = "";
        String prewhereStat = "";
        String whereStat = "";
        String groupByStat = "";
        String havingStat = "";
        String orderByStat = "";
        String limitByStat = "";
        String limitStat = "";
        String settingStat = "";
        String cubeStat = "";
        if (null != selectStatement.getWithClause()) {
            withStat = visitWithClause(selectStatement.getWithClause());
        }
        if (null != selectStatement.getExprs()) {
            columnExprStat = visitSelectColumnExprList(selectStatement.getExprs());
        }
        if (null != selectStatement.getFromClause()) {
            fromStat = visitFromClause(selectStatement.getFromClause());
        }
        if (null != selectStatement.getArrayJoinClause()) {
            arrayJoinStat = visitArrayJoinClause(selectStatement.getArrayJoinClause());
        }
        if (null != selectStatement.getPrewhereClause()) {
            prewhereStat = visitPrewhereClause(selectStatement.getPrewhereClause());
        }
        if (null != selectStatement.getWhereClause()) {
            whereStat = visitWhereClause(selectStatement.getWhereClause());
        }
        if (null != selectStatement.getGroupByClause()) {
            groupByStat = visitGroupByClause(selectStatement.getGroupByClause());
        }
        if (null != selectStatement.getHavingClause()) {
            havingStat = visitHavingClause(selectStatement.getHavingClause());
        }
        if (null != selectStatement.getOrderByClause()) {
            orderByStat = visitOrderByClause(selectStatement.getOrderByClause());
        }
        if (null != selectStatement.getLimitByClause()) {
            limitByStat = visitLimitByClause(selectStatement.getLimitByClause());
        }
        if (null != selectStatement.getLimitClause()) {
            limitStat = visitLimitClause(selectStatement.getLimitClause());
        }
        switch (selectStatement.getModifierType()) {
            case CUBE:
                cubeStat = "WITH CUBE ";
                break;
            case ROLLUP:
                cubeStat = "WITH ROLLUP ";
                break;
            case NONE:
            default:
        }

        if (null != selectStatement.getSettingsClause()) {
            settingStat = visitSettingsClause(selectStatement.getSettingsClause());
        }
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(null != withStat ? withStat : "")
                .append(null != columnExprStat ? columnExprStat : "")
                .append(null != fromStat ? fromStat : "")
                .append(null != arrayJoinStat ? arrayJoinStat : "")
                .append(null != prewhereStat ? prewhereStat : "")
                .append(null != whereStat ? whereStat : "")
                .append(null != groupByStat ? groupByStat : "")
                .append(null != cubeStat ? cubeStat : "")
                .append(null != havingStat ? havingStat : "")
                .append(null != orderByStat ? orderByStat : "")
                .append(null != limitByStat ? limitByStat : "")
                .append(null != limitStat ? limitStat : "")
                .append(null != settingStat ? settingStat : "");
        return sqlBuffer.toString();
    }

    @Override
    public String visitWithClause(WithClause withClause) {
        return visitColumnExprList(withClause.getWithExpr());
    }

    @Override
    public String visitFromClause(FromClause fromClause) {
        return visitJoinExpr(fromClause.getExpr());
    }

    public String visitJoinOperator(JoinExpr.JoinOpType joinOpType, JoinExpr.JoinOpMode joinOpMode) {
        switch (joinOpType) {
            case LEFT:
                return "LEFT JOIN ";
            case RIGHT:
                return "RIGHT JOIN ";
            case INNER:
                return "INNER JOIN ";
            default:
                return "JOIN ";
        }
    }

    @Override
    public String visitJoinExpr(JoinExpr joinExpr) {
        StringBuffer buffer = new StringBuffer();
        if (null != joinExpr.getTableExpr()) {
            String expr = visitTableExpr(joinExpr.getTableExpr());
            if (joinExpr.getExprType().equals(JoinExpr.ExprType.TABLE)) {
                buffer.append("FROM ");
            }
            buffer.append(expr);
        }
        if (null != joinExpr.getSampleClause()) {
            String expr = visitSampleClause(joinExpr.getSampleClause());
            buffer.append(expr);
        }
        if (null != joinExpr.getLeftExpr()) {
            String expr = visitJoinExpr(joinExpr.getLeftExpr());
            buffer.append(expr);
        }
        if (null != joinExpr.getRightExpr()) {
            String expr = visitJoinExpr(joinExpr.getRightExpr());
            if (expr.startsWith("FROM ")) {
                expr = expr.substring("FROM ".length());
            }
            switch (joinExpr.getExprType()) {
                case TABLE:
                    buffer.append("FROM ");
                    break;
                case JOIN_OP:
                    buffer.append(visitJoinOperator(joinExpr.getOpType(), joinExpr.getOpMode()));
                    break;
                default:
            }
            buffer.append(expr);
        }
        if (null != joinExpr.getJoinConstraintClause()) {
            String expr = visitJoinConstraintClause(joinExpr.getJoinConstraintClause());
            if (null != expr && !expr.isEmpty()) {
                buffer.append("ON ");
            }
            buffer.append(expr);
        }
        buffer.append(" ");
        return buffer.toString();
    }

    @Override
    public String visitTableExpr(TableExpr tableExpr) {
        StringBuffer buffer = new StringBuffer();
        if (null != tableExpr.getExpr()) {
            String expr = visitTableExpr(tableExpr.getExpr());
            if (null != expr && !expr.isEmpty()) {
                buffer.append(expr + " ");
            }
        }
        if (null != tableExpr.getAlias()) {
            String alias = visitIdentifier(tableExpr.getAlias());
            if (null != alias && !alias.isEmpty()) {
                buffer.append(alias + " ");
            }
        }
        if (null != tableExpr.getFunction()) {
            return visitTableFunctionExpr(tableExpr.getFunction());
        }
        if (null != tableExpr.getIdentifier()) {
            return visitTableIdentifier(tableExpr.getIdentifier());
        }
        if (null != tableExpr.getSubQuery()) {
            String expr = visitSelectUnionQuery(tableExpr.getSubQuery());
            if (null != expr && !expr.isEmpty()) {
                return "(" + expr + ") ";
            }
        }
        return buffer.toString();
    }

    @Override
    public String visitIdentifier(Identifier identifier) {
        return identifier.getQualifiedName();
    }

    @Override
    public String visitTableFunctionExpr(TableFunctionExpr function) {
        StringBuffer buffer = new StringBuffer();
        if (null != function.getName()) {
            String funcName = visitIdentifier(function.getName());
            buffer.append(funcName + "(");
        }
        if (null != function.getArgs()) {
            String argExpr = visitTableArgExprList(function.getArgs());
            buffer.append(argExpr);
            buffer.append(") ");
        }
        return buffer.toString();
    }

    @Override
    public String visitTableArgExprList(List<TableArgExpr> args) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < args.size(); i++) {
            TableArgExpr argExpr = args.get(i);
            String argument = visitTableArgExpr(argExpr);
            buffer.append(argument);
            if (i != args.size() - 1) {
                buffer.append(",");
            }
        }
        return buffer.toString();
    }

    @Override
    public String visitTableArgExpr(TableArgExpr arg) {
        // TODO:
        if (null != arg.getLiteral()) {
            visitLiteral(arg.getLiteral());
        }
        if (null != arg.getFunctionExpr()) {
            visitTableFunctionExpr(arg.getFunctionExpr());
        }
        if (null != arg.getIdentifier()) {
            visitTableIdentifier(arg.getIdentifier());
        }
        return null;
    }

    @Override
    public String visitLiteral(Literal literal) {
        if (literal instanceof NumberLiteral) {
            return visitNumberLiteral((NumberLiteral) literal);
        }
        if (literal instanceof StringLiteral) {
            return visitStringLiteral((StringLiteral) literal);
        }
        return null;
    }

    @Override
    public String visitTableIdentifier(TableIdentifier tableIdentifier) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(tableIdentifier.getQualifiedName(joinerSymbol));
        return buffer.toString();
    }

    @Override
    public String visitSampleClause(SampleClause sampleClause) {
        // TODO: need to combine two sub clauses
        if (null != sampleClause.getRatio()) {
            return visitRatioExpr(sampleClause.getRatio());
        }
        if (null != sampleClause.getOffset()) {
            return visitRatioExpr(sampleClause.getOffset());
        }
        return null;
    }

    @Override
    public String visitRatioExpr(RatioExpr ratioExpr) {
        // TODO: need to review this implementation
        if (null != ratioExpr.getNumerator()) {
            return visitNumberLiteral(ratioExpr.getNumerator());
        }
        if (null != ratioExpr.getDenominator()) {
            return visitNumberLiteral(ratioExpr.getDenominator());
        }
        return null;
    }

    @Override
    public String visitNumberLiteral(NumberLiteral numberLiteral) {
        return numberLiteral.toString();
    }

    @Override
    public String visitJoinConstraintClause(JoinConstraintClause joinConstraintClause) {
        if (null != joinConstraintClause.getExprs()) {
            return visitColumnExprList(joinConstraintClause.getExprs());
        }
        return null;
    }

    @Override
    public String visitArrayJoinClause(ArrayJoinClause arrayJoinClause) {
        if (null != arrayJoinClause.getExprs()) {
            return visitColumnExprList(arrayJoinClause.getExprs());
        }
        return null;
    }

    @Override
    public String visitPrewhereClause(PrewhereClause prewhereClause) {
        if (null != prewhereClause.getPrewhereExpr()) {
            return visitColumnExpr(prewhereClause.getPrewhereExpr());
        }
        return null;
    }

    @Override
    public String visitWhereClause(WhereClause whereClause) {
        if (null != whereClause.getWhereExpr()) {
            String columnExpr = visitColumnExpr(whereClause.getWhereExpr());
            if (null != columnExpr && !columnExpr.isEmpty()) {
                StringBuffer buffer = new StringBuffer("WHERE " + columnExpr);
                return buffer.toString();
            }
        }
        return null;
    }

    @Override
    public String visitGroupByClause(GroupByClause groupByClause) {
        if (null != groupByClause.getGroupByExprs()) {
            String expr = visitColumnExprList(groupByClause.getGroupByExprs());
            if (null != expr && !expr.isEmpty()) {
                StringBuffer buffer = new StringBuffer("GROUP BY ");
                expr = expr.replace("{,}", ",");
                buffer.append(expr + " ");
                return buffer.toString();
            }
        }
        return null;
    }

    @Override
    public String visitHavingClause(HavingClause havingClause) {
        if (null != havingClause.getHavingExpr()) {
            String expr = visitColumnExpr(havingClause.getHavingExpr());
            if (null != expr && !expr.isEmpty()) {
                StringBuffer buffer = new StringBuffer("HAVING ");
                expr = expr.replace("{,}", ",");
                buffer.append(expr + " ");
                return buffer.toString();
            }
        }
        return null;
    }

    @Override
    public String visitOrderByClause(OrderByClause orderByClause) {
        if (null != orderByClause.getOrderExprs()) {
            StringBuffer buffer = new StringBuffer("ORDER BY ");
            for (int i = 0; i < orderByClause.getOrderExprs().size(); i++) {
                OrderExpr orderExpr = orderByClause.getOrderExprs().get(i);
                String field = visitOrderExpr(orderExpr);
                buffer.append(field + " ");
                buffer.append(orderExpr.isAsc() ? "ASC " : "DESC ");
                if (i != orderByClause.getOrderExprs().size() - 1) {
                    buffer.append(",");
                }
            }
            return buffer.toString();
        }
        return null;
    }

    @Override
    public String visitOrderExpr(OrderExpr orderExpr) {
        if (null != orderExpr.getExpr()) {
            return visitColumnExpr(orderExpr.getExpr());
        }
        if (null != orderExpr.getCollate()) {
            return visitStringLiteral(orderExpr.getCollate());
        }
        return null;
    }

    @Override
    public String visitStringLiteral(StringLiteral stringLiteral) {
        return stringLiteral.asString();
    }

    @Override
    public String visitLimitByClause(LimitByClause limitByClause) {
        if (null != limitByClause.getLimit()) {
            return visitLimitExpr(limitByClause.getLimit());
        }
        if (null != limitByClause.getExprs()) {
            return visitColumnExprList(limitByClause.getExprs());
        }
        return null;
    }

    @Override
    public String visitLimitExpr(LimitExpr limitExpr) {
        // TODO:
        if (null != limitExpr.getLimit()) {
            return visitColumnExpr(limitExpr.getLimit());
        }
        if (null != limitExpr.getOffset()) {
            return visitColumnExpr(limitExpr.getOffset());
        }
        return null;
    }

    @Override
    public String visitLimitClause(LimitClause limitClause) {
        LimitExpr limitExpr = limitClause.getLimitExpr();
        ColumnExpr limit = limitExpr.getLimit();
        ColumnExpr offset = limitExpr.getOffset();
        StringBuffer limitStatement = new StringBuffer();
        if (null != limit && limit instanceof LiteralColumnExpr) {
            LiteralColumnExpr literalColumnExpr = (LiteralColumnExpr) limit;
            Literal literal = literalColumnExpr.getLiteral();
            if (null != literal && literal instanceof NumberLiteral) {
                NumberLiteral numberLiteral = (NumberLiteral) literal;
                limitStatement.append("LIMIT " + numberLiteral.toString() + " ");
            }
        }
        return limitStatement.toString();
    }

    @Override
    public String visitSettingsClause(SettingsClause settingsClause) {
        // TODO:
        if (null != settingsClause.getSettingExprs()) {
            StringBuffer buffer = new StringBuffer("SETTINGS ");
            for (SettingExpr settingExpr : settingsClause.getSettingExprs()) {
                String expr = visitSettingExpr(settingExpr);
                buffer.append(expr);
            }
        }
        return null;
    }

    @Override
    public String visitSettingExpr(SettingExpr settingExpr) {
        if (null != settingExpr.getName()) {
            visitIdentifier(settingExpr.getName());
        }
        if (null != settingExpr.getValue()) {
            visitLiteral(settingExpr.getValue());
        }
        return null;
    }

    @Override
    public String visitSelectColumnExprList(List<ColumnExpr> exprs) {
        StringBuffer columnExprs = new StringBuffer();
        for (int i = 0; i < exprs.size(); i++) {
            if (i == 0) {
                columnExprs.append("SELECT ");
            } else {
                columnExprs.append(",");
            }
            ColumnExpr expr = exprs.get(i);
            String columnExpr = visitColumnExpr(expr);
            columnExprs.append(columnExpr);
        }
        columnExprs.append(" ");
        return columnExprs.toString();
    }

    @Override
    public String visitColumnExprList(List<ColumnExpr> exprs) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < exprs.size(); i++) {
            ColumnExpr expr = exprs.get(i);
            String columnExpr = visitColumnExpr(expr);
            buffer.append(columnExpr);
            if (i != exprs.size() - 1) {
                buffer.append("{,}");
            }
        }
        return buffer.toString();
    }

    @Override
    public String visitAsteriskColumnExpr(AsteriskColumnExpr expr) {
        return "*";
    }

    @Override
    public String visitColumnExpr(ColumnExpr expr) {
        if (expr instanceof AsteriskColumnExpr) {
            return visitAsteriskColumnExpr((AsteriskColumnExpr) expr);
        }
        if (expr instanceof AliasColumnExpr) {
            return visitAliasColumnExpr((AliasColumnExpr) expr);
        }
        if (expr instanceof FunctionColumnExpr) {
            return visitFunctionColumnExpr(expr);
        }
        if (expr instanceof SubqueryColumnExpr) {
            return visitSubqueryColumnExpr(expr);
        }
        if (expr instanceof IdentifierColumnExpr) {
            return visitIdentifierColumnExpr(expr);
        }
        if (expr instanceof LiteralColumnExpr) {
            return visitLiteralColumnExpr(expr);
        }
        return null;
    }

    @Override
    public String visitLiteralColumnExpr(ColumnExpr expr) {
        if (null != expr && expr instanceof LiteralColumnExpr) {
            LiteralColumnExpr literalColumnExpr = (LiteralColumnExpr) expr;
            return visit(literalColumnExpr.getLiteral());
        }
        return null;
    }

    @Override
    public String visitIdentifierColumnExpr(ColumnExpr expr) {
        if (null != expr && expr instanceof IdentifierColumnExpr) {
            IdentifierColumnExpr identifierColumnExpr = (IdentifierColumnExpr) expr;
            return visitIdentifier(identifierColumnExpr.getIdentifier());
        }
        return null;
    }

    @Override
    public String visitAliasColumnExpr(AliasColumnExpr expr) {
        StringBuffer buffer = new StringBuffer();
        if (null != expr.getExpr()) {
            String columnExpr = visitColumnExpr(expr.getExpr());
            buffer.append(columnExpr);
        }
        if (null != expr.getAlias()) {
            String alias = visitIdentifier(expr.getAlias());
            if (null != alias) {
                buffer.append(" AS " + alias);
            }
        }
        return buffer.toString();
    }

    public String visitMinusFunctionColumnExpr(FunctionColumnExpr expr) {
        try {
            List<ColumnExpr> columnExprs = expr.getArgs();
            String column = visit(columnExprs.get(0));
            ColumnExpr argsExpr = columnExprs.get(1);
            String literal = visit(argsExpr);
            return "(" + column + ") - (" + literal + ")";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String visitPlusFunctionColumnExpr(FunctionColumnExpr expr) {
        try {
            List<ColumnExpr> columnExprs = expr.getArgs();
            String column = visit(columnExprs.get(0));
            ColumnExpr argsExpr = columnExprs.get(1);
            String literal = visit(argsExpr);
            return "(" + column + ") + (" + literal + ")";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String visitInFunctionColumnExpr(FunctionColumnExpr expr) {
        try {
            List<ColumnExpr> columnExprs = expr.getArgs();
            String column = visit(columnExprs.get(0));
            ColumnExpr argsExpr = columnExprs.get(1);
            if (argsExpr instanceof FunctionColumnExpr) {
                FunctionColumnExpr tupleFunctionExpr = (FunctionColumnExpr) argsExpr;
                // extract the tuple
                List<ColumnExpr> tupleFunctionExprArgs = tupleFunctionExpr.getArgs();
                StringBuffer inStatementBuffer = new StringBuffer();
                inStatementBuffer.append("(" + column + ") IN " + "(");
                for (int i = 0; i < tupleFunctionExprArgs.size(); i++) {
                    ColumnExpr arg = tupleFunctionExprArgs.get(i);
                    String value = visit(arg);
                    inStatementBuffer.append(value);
                    if (i != tupleFunctionExprArgs.size() - 1) {
                        inStatementBuffer.append(",");
                    }
                }
                inStatementBuffer.append(") ");
                return inStatementBuffer.toString();
            } else if (argsExpr instanceof LiteralColumnExpr) {
                String literal = visit(argsExpr);
                return "(" + column + ") = (" + literal + ")";
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String visitLikeFunctionColumnExpr(FunctionColumnExpr expr) {
        try {
            List<ColumnExpr> columnExprs = expr.getArgs();
            String column = visit(columnExprs.get(0));
            ColumnExpr argsExpr = columnExprs.get(1);
            if (argsExpr instanceof LiteralColumnExpr) {
                String literal = visit(argsExpr);
                return "(" + column + ") LIKE (" + literal + ")";
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String visitFunctionColumnExpr(ColumnExpr expr) {
        // TODO:
        if (null != expr && expr instanceof FunctionColumnExpr) {
            boolean isCompareOperator = false;
            boolean isLogicalOperator = false;
            boolean isArithmeticOperator = false;
            String funcName = null;
            FunctionColumnExpr functionColumnExpr = (FunctionColumnExpr) expr;
            StringBuffer buffer = new StringBuffer();
            if (null != functionColumnExpr.getName()) {
                funcName = visitIdentifier(functionColumnExpr.getName());
                switch (funcName) {
                    case "equals":
                        buffer.append("({VAR}) = ({VALUE}) ");
                        isCompareOperator = true;
                        break;
                    case "notEquals":
                        buffer.append("({VAR}) != ({VALUE}) ");
                        isCompareOperator = true;
                        break;
                    case "lessOrEquals":
                        buffer.append("({VAR}) <= ({VALUE}) ");
                        isCompareOperator = true;
                        break;
                    case "greaterOrEquals":
                        buffer.append("({VAR}) >= ({VALUE}) ");
                        isCompareOperator = true;
                        break;
                    case "less":
                        buffer.append("({VAR}) < ({VALUE}) ");
                        isCompareOperator = true;
                        break;
                    case "greater":
                        buffer.append("({VAR}) > ({VALUE}) ");
                        isCompareOperator = true;
                        break;
                    case "and":
                        buffer.append("({EXPR1} AND {EXPR2}) ");
                        isLogicalOperator = true;
                        break;
                    case "or":
                        buffer.append("({EXPR1} OR {EXPR2}) ");
                        isLogicalOperator = true;
                        break;
                    case "countDistinct":
                        buffer.append("COUNT(DISTINCT({VALUE}))");
                        break;
                    case "divide":
                        buffer.append("({EXPR1}) / ({EXPR2}) ");
                        isArithmeticOperator = true;
                        break;
                    case "multiply":
                        buffer.append("({EXPR1}) * ({EXPR2}) ");
                        isArithmeticOperator = true;
                        break;
                    case "in":
                        return visitInFunctionColumnExpr(functionColumnExpr);
                    case "like":
                        return visitLikeFunctionColumnExpr(functionColumnExpr);
                    case "minus":
                        return visitMinusFunctionColumnExpr(functionColumnExpr);
                    case "plus":
                        return visitPlusFunctionColumnExpr(functionColumnExpr);
                    default:
                        if (null != functionColumnExpr.getArgs()) {
                            buffer.append(funcName + "({VALUE})");
                        } else {
                            buffer.append(funcName + "()");
                        }
                }
            }

            if (null != functionColumnExpr.getParams()) {
                String params = visitColumnExprList(functionColumnExpr.getParams());
                buffer.append(params);
            }

            if (null != functionColumnExpr.getArgs()) {
                String args = visitColumnExprList(functionColumnExpr.getArgs());
                String[] fields = args.split("\\{,\\}");
                if (isCompareOperator && null != fields && fields.length == 2) {
                    String var = fields[0];
                    String value = fields[1];
                    String tmp = buffer.toString().replace("{VAR}", var);
                    tmp = tmp.replace("{VALUE}", value);
                    buffer = new StringBuffer(tmp);
                } else if (isLogicalOperator && null != fields && fields.length == 2) {
                    String expr1 = fields[0];
                    String expr2 = fields[1];
                    String tmp = buffer.toString().replace("{EXPR1}", expr1);
                    tmp = tmp.replace("{EXPR2}", expr2);
                    buffer = new StringBuffer(tmp);
                } else if (isArithmeticOperator && null != fields && fields.length == 2) {
                    String expr1 = fields[0];
                    String expr2 = fields[1];
                    String tmp = buffer.toString().replace("{EXPR1}", expr1);
                    tmp = tmp.replace("{EXPR2}", expr2);
                    buffer = new StringBuffer(tmp);
                } else {
                    StringBuffer argsBuffer = new StringBuffer();
                    for (int i = 0; i < fields.length; i++) {
                        String field = fields[i];
                        argsBuffer.append(field);
                        if (i != fields.length - 1) {
                            argsBuffer.append(",");
                        }
                    }
                    buffer = new StringBuffer(buffer.toString().replace("{VALUE}", argsBuffer.toString()));
                }
            }
            return buffer.toString();
        }
        return null;
    }

    @Override
    public String visitSubqueryColumnExpr(ColumnExpr expr) {
        if (null != expr && expr instanceof SubqueryColumnExpr) {
            SubqueryColumnExpr subqueryColumnExpr = (SubqueryColumnExpr) expr;
            if (null != subqueryColumnExpr.getQuery()) {
                return " (" + visit(subqueryColumnExpr.getQuery()) + ") ";
            }
        }
        return null;
    }

}
