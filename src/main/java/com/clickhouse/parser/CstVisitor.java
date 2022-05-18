package com.clickhouse.parser;

import com.clickhouse.parser.ast.*;
import com.clickhouse.parser.ast.expr.*;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CstVisitor extends ClickHouseParserBaseVisitor {

    private TableIdentifier currentTableIdentifier;

    private String defaultDatabase = "default";

    private boolean fillDefaultDatabase = false;

    public CstVisitor() {
    }

    public CstVisitor(boolean fillDefaultDatabase) {
        this.fillDefaultDatabase = fillDefaultDatabase;
    }

    public CstVisitor(String defaultDatabase, boolean fillDefaultDatabase) {
        this.defaultDatabase = defaultDatabase;
        this.fillDefaultDatabase = fillDefaultDatabase;
    }

    @Override
    public Object visitAlterTableStmt(ClickHouseParser.AlterTableStmtContext ctx) {
        StringLiteral cluster = null;
        if (null != ctx.clusterClause()) {
            // TODO: may throw exception here
            cluster = (StringLiteral) visit(ctx.clusterClause());
        }
        TableIdentifier tableIdentifier = (TableIdentifier) visit(ctx.tableIdentifier());
        List<AlterTableClause> alterTableClauseList = new ArrayList<>();
        for (ClickHouseParser.AlterTableClauseContext alterTableClauseContext : ctx.alterTableClause()) {
            AlterTableClause alterTableClause = (AlterTableClause) visit(alterTableClauseContext);
            if (null != alterTableClause) {
                alterTableClauseList.add(alterTableClause);
            }
        }
        AlterTableQuery alterTableQuery = new AlterTableQuery(cluster, tableIdentifier, alterTableClauseList);
        return alterTableQuery;
    }

    @Override
    public Object visitClusterClause(ClickHouseParser.ClusterClauseContext ctx) {
        StringLiteral literal;
        if (null != ctx.STRING_LITERAL()) {
            literal = Literal.createString(ctx.STRING_LITERAL());
        } else {
            literal = Literal.createString(ctx.identifier().getText());
        }
        return literal;
    }

    @Override
    public Object visitAlterTableClauseAddColumn(ClickHouseParser.AlterTableClauseAddColumnContext ctx) {
        Identifier after = null;
        if (null != ctx.AFTER()) {
            after = (Identifier) visit(ctx.nestedIdentifier());
        }
        boolean ifNotExists = null != ctx.IF() ? true : false;
        TableElementExpr element = (TableElementExpr) visit(ctx.tableColumnDfnt());
        return AlterTableClause.createAddColumn(ifNotExists, element, after);
    }

    @Override
    public Object visitTableColumnPropertyExpr(ClickHouseParser.TableColumnPropertyExprContext ctx) {
        ColumnExpr expr = (ColumnExpr) visit(ctx.columnExpr());
        TableColumnPropertyExpr property = new TableColumnPropertyExpr(TableColumnPropertyExpr.PropertyType.SIMPLE, expr);
        return property;
    }

    @Override
    public Object visitTableColumnDfnt(ClickHouseParser.TableColumnDfntContext ctx) {
        TableColumnPropertyExpr property = null;
        if (null != ctx.tableColumnPropertyExpr()) {
            property = (TableColumnPropertyExpr) visit(ctx.tableColumnPropertyExpr());
        }

        ColumnTypeExpr type = null;
        if (null != ctx.columnTypeExpr()) {
            type = (ColumnTypeExpr) visit(ctx.columnTypeExpr());
        }

        StringLiteral comment = null;
        if (null != ctx.STRING_LITERAL()) {
            comment = Literal.createString(ctx.STRING_LITERAL());
        }

        CodecExpr codec = null;
        if (null != ctx.codecExpr()) {
            codec = (CodecExpr) visit(ctx.codecExpr());
        }

        ColumnExpr ttl = null;
        if (null != ctx.TTL()) {
            ttl = (ColumnExpr) visit(ctx.TTL());
        }

        Identifier name = (Identifier) visit(ctx.nestedIdentifier());

        return TableElementExpr.createColumn(name, type, property, comment, codec, ttl);
    }

    @Override
    public Object visitAlterTableClauseAddIndex(ClickHouseParser.AlterTableClauseAddIndexContext ctx) {
        Identifier after = null;
        if (null != ctx.AFTER()) {
            after = (Identifier) visit(ctx.nestedIdentifier());
        }
        boolean ifNotExists = null != ctx.IF() ? true : false;
        TableElementExpr element = (TableElementExpr) visit(ctx.tableIndexDfnt());
        return AlterTableClause.createAddIndex(ifNotExists, element, after);
    }

    @Override
    public Object visitAlterTableClauseAttach(ClickHouseParser.AlterTableClauseAttachContext ctx) {
        TableIdentifier from = null;
        if (null != ctx.tableIdentifier()) {
            from = (TableIdentifier) visit(ctx.tableIdentifier());
        }
        PartitionClause partitionClause = (PartitionClause) visit(ctx.partitionClause());
        return AlterTableClause.createAttach(partitionClause, from);
    }

    @Override
    public Object visitAlterTableClauseClear(ClickHouseParser.AlterTableClauseClearContext ctx) {
        PartitionClause partition = null;
        if (null != ctx.partitionClause()) {
            partition = (PartitionClause) visit(ctx.partitionClause());
        }
        boolean ifExists = null != ctx.IF() ? true : false;
        Identifier identifier = (Identifier) visit(ctx.nestedIdentifier());
        return AlterTableClause.createClear(ifExists, identifier, partition);
    }

    @Override
    public Object visitAlterTableClauseComment(ClickHouseParser.AlterTableClauseCommentContext ctx) {
        boolean ifExists = null != ctx.IF() ? true : false;
        Identifier identifier = (Identifier) visit(ctx.nestedIdentifier());
        StringLiteral comment = Literal.createString(ctx.STRING_LITERAL());
        return AlterTableClause.createComment(ifExists, identifier, comment);
    }

    @Override
    public Object visitAlterTableClauseDelete(ClickHouseParser.AlterTableClauseDeleteContext ctx) {
        ColumnExpr expr = (ColumnExpr) visit(ctx.columnExpr());
        return AlterTableClause.createDelete(expr);
    }

    @Override
    public Object visitAlterTableClauseDetach(ClickHouseParser.AlterTableClauseDetachContext ctx) {
        PartitionClause partitionClause = (PartitionClause) visit(ctx.partitionClause());
        return AlterTableClause.createDetach(partitionClause);
    }

    @Override
    public Object visitAlterTableClauseDropColumn(ClickHouseParser.AlterTableClauseDropColumnContext ctx) {
        boolean ifExists = null != ctx.IF() ? true : false;
        Identifier identifier = (Identifier) visit(ctx.nestedIdentifier());
        return AlterTableClause.createDropColumn(ifExists, identifier);
    }

    @Override
    public Object visitAlterTableClauseDropPartition(ClickHouseParser.AlterTableClauseDropPartitionContext ctx) {
        PartitionClause partitionClause = (PartitionClause) visit(ctx.partitionClause());
        return AlterTableClause.createDropPartition(partitionClause);
    }

    @Override
    public Object visitAlterTableClauseFreezePartition(ClickHouseParser.AlterTableClauseFreezePartitionContext ctx) {
        PartitionClause partitionClause = null;
        if (null != ctx.partitionClause()) {
            partitionClause = (PartitionClause) visit(ctx.partitionClause());
        }
        return AlterTableClause.createFreezePartition(partitionClause);
    }

    @Override
    public Object visitAlterTableClauseModify(ClickHouseParser.AlterTableClauseModifyContext ctx) {
        boolean ifExists = null != ctx.IF() ? true : false;
        TableElementExpr element = (TableElementExpr) visit(ctx.tableColumnDfnt());
        return AlterTableClause.createModify(ifExists, element);
    }

    @Override
    public Object visitAlterTableClauseModifyCodec(ClickHouseParser.AlterTableClauseModifyCodecContext ctx) {
        boolean ifExists = null != ctx.IF() ? true : false;
        Identifier identifier = (Identifier) visit(ctx.nestedIdentifier());
        CodecExpr codec = (CodecExpr) visit(ctx.codecExpr());
        return AlterTableClause.createCodec(ifExists, identifier, codec);
    }

    @Override
    public Object visitAlterTableClauseModifyOrderBy(ClickHouseParser.AlterTableClauseModifyOrderByContext ctx) {
        ColumnExpr expr = (ColumnExpr) visit(ctx.columnExpr());
        return AlterTableClause.createOrderBy(expr);
    }

    @Override
    public Object visitAlterTableClauseModifyRemove(ClickHouseParser.AlterTableClauseModifyRemoveContext ctx) {
        boolean ifExists = null != ctx.IF() ? true : false;
        Identifier identifier = (Identifier) visit(ctx.nestedIdentifier());
        TableColumnPropertyType type = (TableColumnPropertyType) visit(ctx.tableColumnPropertyType());
        return AlterTableClause.createRemove(ifExists, identifier, type);
    }

    @Override
    public Object visitAlterTableClauseModifyTTL(ClickHouseParser.AlterTableClauseModifyTTLContext ctx) {
        TTLClause ttlClause = (TTLClause) visit(ctx.ttlClause());
        return AlterTableClause.createTTL(ttlClause);
    }

    @Override
    public Object visitAlterTableClauseMovePartition(ClickHouseParser.AlterTableClauseMovePartitionContext ctx) {
        if (null != ctx.DISK()) {
            PartitionClause partitionClause = (PartitionClause) visit(ctx.partitionClause());
            StringLiteral literal = Literal.createString(ctx.STRING_LITERAL());
            return AlterTableClause.createMovePartitionToDisk(partitionClause, literal);
        } else if (null != ctx.TABLE()) {
            PartitionClause partitionClause = (PartitionClause) visit(ctx.partitionClause());
            TableIdentifier tableIdentifier = (TableIdentifier) visit(ctx.tableIdentifier());
            return AlterTableClause.createMovePartitionToTable(partitionClause, tableIdentifier);
        } else if (null != ctx.VOLUME()) {
            PartitionClause partitionClause = (PartitionClause) visit(ctx.partitionClause());
            StringLiteral literal = Literal.createString(ctx.STRING_LITERAL());
            return AlterTableClause.createMovePartitionToVolume(partitionClause, literal);
        } else {
            return null;
        }
    }

    @Override
    public Object visitAlterTableClauseRemoveTTL(ClickHouseParser.AlterTableClauseRemoveTTLContext ctx) {
        return AlterTableClause.createRemoveTTL();
    }

    @Override
    public Object visitAlterTableClauseRename(ClickHouseParser.AlterTableClauseRenameContext ctx) {
        boolean ifExists = null != ctx.IF() ? true : false;
        Identifier identifier = (Identifier) visit(ctx.nestedIdentifier(0));
        Identifier to = (Identifier) visit(ctx.nestedIdentifier(1));
        return AlterTableClause.createRename(ifExists, identifier, to);
    }

    @Override
    public Object visitAlterTableClauseReplace(ClickHouseParser.AlterTableClauseReplaceContext ctx) {
        PartitionClause partitionClause = (PartitionClause) visit(ctx.partitionClause());
        TableIdentifier tableIdentifier = (TableIdentifier) visit(ctx.tableIdentifier());
        return AlterTableClause.createReplace(partitionClause, tableIdentifier);
    }

    @Override
    public Object visitTableColumnPropertyType(ClickHouseParser.TableColumnPropertyTypeContext ctx) {
        if (null != ctx.ALIAS()) {
            return TableColumnPropertyType.ALIAS;
        } else if (null != ctx.CODEC()) {
            return TableColumnPropertyType.CODEC;
        } else if (null != ctx.COMMENT()) {
            return TableColumnPropertyType.COMMENT;
        } else if (null != ctx.DEFAULT()) {
            return TableColumnPropertyType.DEFAULT;
        } else if (null != ctx.MATERIALIZED()) {
            return TableColumnPropertyType.MATERIALIZED;
        } else if (null != ctx.TTL()) {
            return TableColumnPropertyType.TTL;
        } else {
            return null;
        }
    }

    @Override
    public Object visitAssignmentExpr(ClickHouseParser.AssignmentExprContext ctx) {
        Identifier identifier = (Identifier) visit(ctx.nestedIdentifier());
        ColumnExpr expr = (ColumnExpr) visit(ctx.columnExpr());
        return new AssignmentExpr(identifier, expr);
    }

    @Override
    public Object visitPartitionClause(ClickHouseParser.PartitionClauseContext ctx) {
        if (null != ctx.STRING_LITERAL()) {
            return new PartitionClause(Literal.createString(ctx.STRING_LITERAL()));
        }
        ColumnExpr expr = (ColumnExpr) visit(ctx.columnExpr());
        if (expr.getExprType() == ColumnExpr.ExprType.LITERAL) {
            LiteralColumnExpr literalColumnExpr = (LiteralColumnExpr) expr;
            List<Literal> list = new ArrayList<>();
            list.add(literalColumnExpr.getLiteral());
            return new PartitionClause(list);
        }
        if (expr.getExprType() == ColumnExpr.ExprType.FUNCTION) {
            FunctionColumnExpr funcColumnExpr = (FunctionColumnExpr) expr;
            if (funcColumnExpr.getName().equals("tuple")) {
                List<Literal> list = new ArrayList<>();
                for (ColumnExpr arg : funcColumnExpr.getArgs()) {
                    if (arg.getExprType() == ColumnExpr.ExprType.LITERAL) {
                        LiteralColumnExpr argLiteral = (LiteralColumnExpr) arg;
                        list.add(argLiteral.getLiteral());
                    } else {
                        // TODO: 'Expected tuple of literals as Partition Expression'.
                    }
                }
            }
        }
        // TODO: 'Expected tuple of literals as Partition Expression'.
        return null;
    }

    @Override
    public Object visitAlterTableClauseUpdate(ClickHouseParser.AlterTableClauseUpdateContext ctx) {
        List<AssignmentExpr> assignmentExprList = (List<AssignmentExpr>) visit(ctx.assignmentExprList());
        WhereClause whereClause = (WhereClause) visit(ctx.whereClause());
        return AlterTableClause.createUpdate(assignmentExprList, whereClause);
    }

    @Override
    public Object visitInsertStmt(ClickHouseParser.InsertStmtContext ctx) {
        List<Identifier> columns = null;
        if (null != ctx.columnsClause()) {
            columns = (List<Identifier>) visit(ctx.columnsClause());
        }
        if (null != ctx.FUNCTION()) {
            TableFunctionExpr tableFunctionExpr = (TableFunctionExpr) visit(ctx.tableFunctionExpr());
            DataClause dataClause = (DataClause) visit(ctx.dataClause());
            return InsertQuery.createFunction(tableFunctionExpr, columns, dataClause);
        }
        if (null != ctx.tableIdentifier()) {
            TableIdentifier tableIdentifier = (TableIdentifier) visit(ctx.tableIdentifier());
            DataClause dataClause = (DataClause) visit(ctx.dataClause());
            return InsertQuery.createTable(tableIdentifier, columns, dataClause);
        }
        // this can't happen
        return null;
    }

    @Override
    public Object visitColumnsClause(ClickHouseParser.ColumnsClauseContext ctx) {
        List<Identifier> columns = new ArrayList<>();
        for (ClickHouseParser.NestedIdentifierContext column : ctx.nestedIdentifier()) {
            Identifier identifier = (Identifier) visit(column);
            columns.add(identifier);
        }
        return columns;
    }

    @Override
    public Object visitDataClauseFormat(ClickHouseParser.DataClauseFormatContext ctx) {
        Identifier identifier = (Identifier) visit(ctx.identifier());
        int dataOffset = ctx.getStop().getStopIndex() + 1;
        return DataClause.createFormat(identifier, dataOffset);
    }

    @Override
    public Object visitDataClauseSelect(ClickHouseParser.DataClauseSelectContext ctx) {
        SelectUnionQuery selectUnionQuery = (SelectUnionQuery) visit(ctx.selectUnionStmt());
        return DataClause.createSelect(selectUnionQuery);
    }

    @Override
    public Object visitDataClauseValues(ClickHouseParser.DataClauseValuesContext ctx) {
        int dataOffset = ctx.getStop().getStopIndex() + 1;
        return DataClause.createValues(dataOffset);
    }

    @Override
    public Object visitQueryStmt(ClickHouseParser.QueryStmtContext ctx) {
        if (null != ctx.insertStmt()) {
            return visitInsertStmt(ctx.insertStmt()); // TODO: convert to InsertQuery
        }
        Query query = (Query) visit(ctx.query()); // TODO: convert to Query
        if (null != ctx.OUTFILE()) {
            query.setOutputFile(ctx.STRING_LITERAL().getSymbol().getText());
        }
        if (null != ctx.FORMAT()) {
            Object obj = visit(ctx.identifierOrNull());
            if (obj instanceof Identifier) {
                Identifier identifier = (Identifier) obj;
                String formatTypeName = identifier.getName();
                query.setFormat(formatTypeName);
            }
        }
        return query;
    }

    @Override
    public Object visitQuery(ClickHouseParser.QueryContext ctx) {
        Object query = visit(ctx.children.get(0));
        return query;
    }

    @Override
    public Object visitSchemaDescriptionClause(ClickHouseParser.SchemaDescriptionClauseContext ctx) {
        List<TableElementExpr> elements = new ArrayList<>();
        for (ClickHouseParser.TableElementExprContext elementContext : ctx.tableElementExpr()) {
            TableElementExpr element = (TableElementExpr) visit(elementContext);
            elements.add(element);
        }
        return TableSchemaClause.createDescription(elements);
    }

    @Override
    public Object visitSchemaAsTableClause(ClickHouseParser.SchemaAsTableClauseContext ctx) {
        TableIdentifier tableIdentifier = (TableIdentifier) visit(ctx.tableIdentifier());
        return TableSchemaClause.createAsTable(tableIdentifier);
    }

    @Override
    public Object visitSchemaAsFunctionClause(ClickHouseParser.SchemaAsFunctionClauseContext ctx) {
        TableFunctionExpr tableFunctionExpr = (TableFunctionExpr) visit(ctx.tableFunctionExpr());
        return TableSchemaClause.createAsFunction(tableFunctionExpr);
    }

    @Override
    public Object visitEngineExpr(ClickHouseParser.EngineExprContext ctx) {
        List<ColumnExpr> columnExprs = new ArrayList<>();
        if (null != ctx.columnExprList()) {
            columnExprs = (List<ColumnExpr>) visit(ctx.columnExprList());
        }
        Identifier identifier = (Identifier) visit(ctx.identifierOrNull());
        EngineExpr engineExpr = new EngineExpr(identifier, columnExprs);
        return engineExpr;
    }

    @Override
    public Object visitEngineClause(ClickHouseParser.EngineClauseContext ctx) {
        EngineExpr engineExpr = (EngineExpr) visit(ctx.engineExpr());
        EngineClause engineClause = new EngineClause(engineExpr);

        if (null != ctx.orderByClause() && !ctx.orderByClause().isEmpty()) {
            OrderByClause orderByClause = (OrderByClause) visit(ctx.orderByClause(0));
            engineClause.setOrderByClause(orderByClause);
        }

        if (null != ctx.partitionByClause() && !ctx.partitionByClause().isEmpty()) {
            ColumnExpr columnExpr = (ColumnExpr) visit(ctx.partitionByClause(0));
            engineClause.setPartitionByClause(columnExpr);
        }

        if (null != ctx.primaryKeyClause() && !ctx.primaryKeyClause().isEmpty()) {
            ColumnExpr primaryKeyClause = (ColumnExpr) visit(ctx.primaryKeyClause(0));
            engineClause.setPrimaryKeyClause(primaryKeyClause);
        }

        if (null != ctx.sampleByClause() && !ctx.sampleByClause().isEmpty()) {
            ColumnExpr sampleByClause = (ColumnExpr) visit(ctx.sampleByClause(0));
            engineClause.setSampleByClause(sampleByClause);
        }

        if (null != ctx.ttlClause() && !ctx.ttlClause().isEmpty()) {
            TTLClause ttlClause = (TTLClause) visit(ctx.ttlClause(0));
            engineClause.setTtlClause(ttlClause);
        }

        if (null != ctx.settingsClause() && !ctx.settingsClause().isEmpty()) {
            SettingsClause settingsClause = (SettingsClause) visit(ctx.settingsClause(0));
            engineClause.setSettingsClause(settingsClause);
        }

        return engineClause;
    }

    @Override
    public Object visitCreateTableStmt(ClickHouseParser.CreateTableStmtContext ctx) {
        StringLiteral uuid = null;
        if (null != ctx.uuidClause()) {
            uuid = (StringLiteral) visit(ctx.uuidClause());
        }

        StringLiteral cluster = null;
        if (null != ctx.clusterClause()) {
            cluster = (StringLiteral) visit(ctx.clusterClause());
        }

        TableSchemaClause schema = null;
        if (null != ctx.tableSchemaClause()) {
            schema = (TableSchemaClause) visit(ctx.tableSchemaClause());
        }

        EngineClause engine = null;
        if (null != ctx.engineClause()) {
            engine = (EngineClause) visit(ctx.engineClause());
        }

        SelectUnionQuery query = null;
        if (null != ctx.subqueryClause()) {
            query = (SelectUnionQuery) visit(ctx.subqueryClause());
        }

        boolean attach = false;
        if (null != ctx.ATTACH()) {
            attach = true;
        }

        boolean temporary = false;
        if (null != ctx.TEMPORARY()) {
            temporary = true;
        }

        boolean ifNotExists = false;
        if (null != ctx.IF()) {
            ifNotExists = true;
        }

        TableIdentifier tableIdentifier = (TableIdentifier) visit(ctx.tableIdentifier());
        CreateTableQuery createTableQuery = new CreateTableQuery(cluster, attach, temporary, ifNotExists, tableIdentifier, uuid, schema, engine, query);

        return createTableQuery;
    }

    @Override
    public Object visitSubqueryClause(ClickHouseParser.SubqueryClauseContext ctx) {
        if (null != ctx.selectUnionStmt()) {
            return visitSelectUnionStmt(ctx.selectUnionStmt());
        }
        return super.visitSubqueryClause(ctx);
    }

    // SelectUnionQuery
    @Override
    public Object visitSelectUnionStmt(ClickHouseParser.SelectUnionStmtContext ctx) {
        SelectUnionQuery selectUnionQuery = new SelectUnionQuery();
        for (ClickHouseParser.SelectStmtWithParensContext stmt : ctx.selectStmtWithParens()) {
            selectUnionQuery.appendSelect((SelectUnionQuery) visit(stmt));
        }
        return selectUnionQuery;
    }

    @Override
    public Object visitSelectStmtWithParens(ClickHouseParser.SelectStmtWithParensContext ctx) {
        SelectUnionQuery query = null;
        if (null != ctx.selectStmt()) {
            query = new SelectUnionQuery();
            query.appendSelect((SelectStatement) visit(ctx.selectStmt()));
        } else if (null != ctx.selectUnionStmt()) {
            query = (SelectUnionQuery) visit(ctx.selectUnionStmt());
        } else if (null != ctx.children && !ctx.children.isEmpty()) {
            StringBuffer text = new StringBuffer();
            for (int i = 0; i < ctx.children.size(); i++) {
                text.append(ctx.children.get(i).getText());
            }
            String database = null;
            String table = text.toString();
            if (text.toString().contains(".")) {
                String[] databaseAndTable = text.toString().split("\\.");
                database = databaseAndTable[0];
                table = databaseAndTable[1];
            }
            TableIdentifier tableIdentifier = new TableIdentifier(new Identifier(database), new Identifier(table));
            SelectStatement selectStatement = new SelectStatement(false, SelectStatement.ModifierType.NONE, false, null);
            JoinExpr joinExpr = JoinExpr.createTableExpr(TableExpr.createIdentifier(tableIdentifier), new SampleClause(null, null), true);
            FromClause fromClause = new FromClause(joinExpr);
            selectStatement.setFromClause(fromClause);
            List<ColumnExpr> columnExprs = new ArrayList<>();
            ColumnExpr columnExpr = ColumnExpr.createAsterisk(tableIdentifier, false);
            columnExprs.add(columnExpr);
            selectStatement.setExprs(columnExprs);
            List<SelectStatement> selectStatements = new ArrayList<>();
            selectStatements.add(selectStatement);
            query = new SelectUnionQuery();
            query.setStatements(selectStatements);
        }
        return query;
    }

    @Override
    public Object visitSelectStmt(ClickHouseParser.SelectStmtContext ctx) {
        SelectStatement.ModifierType type = SelectStatement.ModifierType.NONE;
        if (null != ctx.CUBE() || (null != ctx.groupByClause() && null != ctx.groupByClause().CUBE())) {
            type = SelectStatement.ModifierType.CUBE;
        } else if (null != ctx.ROLLUP() || (null != ctx.groupByClause() && null != ctx.groupByClause().ROLLUP())) {
            type = SelectStatement.ModifierType.ROLLUP;
        }

        boolean distinct = (null != ctx.DISTINCT());
        boolean withTotals = (null != ctx.TOTALS());
        List<ColumnExpr> columnExprs = (List<ColumnExpr>) visit(ctx.columnExprList());
        SelectStatement selectStatement = new SelectStatement(distinct, type, withTotals, columnExprs);

        if (null != ctx.topClause() && null != ctx.limitClause()) {
            throw new RuntimeException("Can not use TOP and LIMIT together");
        }
        if (null != ctx.withClause()) {
            WithClause withClause = (WithClause) visit(ctx.withClause());
            selectStatement.setWithClause(withClause);
        }
        if (null != ctx.topClause()) {
            LimitClause limitClause = (LimitClause) visit(ctx.topClause());
            selectStatement.setLimitClause(limitClause);
        }
        if (null != ctx.fromClause()) {
            FromClause fromClause = (FromClause) visit(ctx.fromClause());
            selectStatement.setFromClause(fromClause);
        }
        if (null != ctx.arrayJoinClause()) {
            ArrayJoinClause arrayJoinClause = (ArrayJoinClause) visit(ctx.arrayJoinClause());
            selectStatement.setArrayJoinClause(arrayJoinClause);
        }
        if (null != ctx.prewhereClause()) {
            PrewhereClause prewhereClause = (PrewhereClause) visit(ctx.prewhereClause());
            selectStatement.setPrewhereClause(prewhereClause);
        }
        if (null != ctx.whereClause()) {
            WhereClause whereClause = (WhereClause) visit(ctx.whereClause());
            selectStatement.setWhereClause(whereClause);
        }
        if (null != ctx.groupByClause()) {
            GroupByClause groupByClause = (GroupByClause) visit(ctx.groupByClause());
            selectStatement.setGroupByClause(groupByClause);
        }
        if (null != ctx.havingClause()) {
            HavingClause havingClause = (HavingClause) visit(ctx.havingClause());
            selectStatement.setHavingClause(havingClause);
        }
        if (null != ctx.orderByClause()) {
            OrderByClause orderByClause = (OrderByClause) visit(ctx.orderByClause());
            selectStatement.setOrderByClause(orderByClause);
        }
        if (null != ctx.limitByClause()) {
            LimitByClause limitByClause = (LimitByClause) visit(ctx.limitByClause());
            selectStatement.setLimitByClause(limitByClause);
        }
        if (null != ctx.limitClause()) {
            LimitClause limitClause = (LimitClause) visit(ctx.limitClause());
            selectStatement.setLimitClause(limitClause);
        }
        if (null != ctx.settingsClause()) {
            SettingsClause settingsClause = (SettingsClause) visit(ctx.settingsClause());
            selectStatement.setSettingsClause(settingsClause);
        }

        return selectStatement;
    }

    @Override
    public Object visitWithClause(ClickHouseParser.WithClauseContext ctx) {
        List<ColumnExpr> columnExprs = (List<ColumnExpr>) visit(ctx.columnExprList());
        WithClause withClause = new WithClause(columnExprs);
        return withClause;
    }

    @Override
    public Object visitTopClause(ClickHouseParser.TopClauseContext ctx) {
        LiteralColumnExpr literalColumnExpr = ColumnExpr.createLiteral(Literal.createNumber(ctx.DECIMAL_LITERAL()));
        LimitExpr limitExpr = new LimitExpr(literalColumnExpr);
        boolean withTies = (null != ctx.WITH());
        LimitClause limitClause = new LimitClause(withTies, limitExpr);
        return limitClause;
    }

    @Override
    public Object visitFromClause(ClickHouseParser.FromClauseContext ctx) {
        JoinExpr joinExpr = (JoinExpr) visit(ctx.joinExpr());
        FromClause fromClause = new FromClause(joinExpr);
        return fromClause;
    }

    @Override
    public Object visitArrayJoinClause(ClickHouseParser.ArrayJoinClauseContext ctx) {
        List<ColumnExpr> columnExprs = (List<ColumnExpr>) visit(ctx.columnExprList());
        boolean left = (null != ctx.LEFT());
        ArrayJoinClause arrayJoinClause = new ArrayJoinClause(columnExprs, left);
        return arrayJoinClause;
    }

    @Override
    public Object visitPrewhereClause(ClickHouseParser.PrewhereClauseContext ctx) {
        ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
        PrewhereClause prewhereClause = new PrewhereClause(columnExpr);
        return prewhereClause;
    }

    @Override
    public Object visitWhereClause(ClickHouseParser.WhereClauseContext ctx) {
        ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
        WhereClause whereClause = new WhereClause(columnExpr);
        return whereClause;
    }

    @Override
    public Object visitGroupByClause(ClickHouseParser.GroupByClauseContext ctx) {
        List<ColumnExpr> columnExprs = (List<ColumnExpr>) visit(ctx.columnExprList());
        GroupByClause groupByClause = new GroupByClause(columnExprs);
        return groupByClause;
    }

    @Override
    public Object visitHavingClause(ClickHouseParser.HavingClauseContext ctx) {
        ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
        HavingClause havingClause = new HavingClause(columnExpr);
        return havingClause;
    }

    @Override
    public Object visitOrderByClause(ClickHouseParser.OrderByClauseContext ctx) {
        Object obj = visit(ctx.orderExprList());
        List<OrderExpr> orderExprs = (List<OrderExpr>) visit(ctx.orderExprList());
        OrderByClause orderByClause = new OrderByClause(orderExprs);
        return orderByClause;
    }

    @Override
    public Object visitLimitByClause(ClickHouseParser.LimitByClauseContext ctx) {
        LimitExpr limitExpr = (LimitExpr) visit(ctx.limitExpr());
        List<ColumnExpr> columnExprs = (List<ColumnExpr>) visit(ctx.columnExprList());
        LimitByClause limitByClause = new LimitByClause(limitExpr, columnExprs);
        return limitByClause;
    }

    @Override
    public Object visitLimitClause(ClickHouseParser.LimitClauseContext ctx) {
        boolean withTies = (null != ctx.WITH());
        LimitExpr limitExpr = (LimitExpr) visit(ctx.limitExpr());
        LimitClause limitClause = new LimitClause(withTies, limitExpr);
        return limitClause;
    }

    @Override
    public Object visitSettingsClause(ClickHouseParser.SettingsClauseContext ctx) {
        List<SettingExpr> settingExprs = (List<SettingExpr>) visit(ctx.settingExprList());
        SettingsClause settingsClause = new SettingsClause(settingExprs);
        return settingsClause;
    }

    @Override
    public Object visitSettingExpr(ClickHouseParser.SettingExprContext ctx) {
        Identifier identifier = (Identifier) visitIdentifier(ctx.identifier());
        Literal literal = (Literal) visit(ctx.literal());
        SettingExpr settingExpr = new SettingExpr(identifier, literal);
        return settingExpr;
    }

    @Override
    public Object visitSettingExprList(ClickHouseParser.SettingExprListContext ctx) {
        List<SettingExpr> settingExprs = new ArrayList<>();
        for (ClickHouseParser.SettingExprContext settingExprContext : ctx.settingExpr()) {
            SettingExpr settingExpr = (SettingExpr) visitSettingExpr(settingExprContext);
            settingExprs.add(settingExpr);
        }
        return settingExprs;
    }

    // Column Expression
    @Override
    public Object visitColumnArgExpr(ClickHouseParser.ColumnArgExprContext ctx) {
        if (null != ctx.columnExpr()) {
            ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
            return columnExpr;
        }
        if (null != ctx.columnLambdaExpr()) {
            LambdaColumnExpr lambdaColumnExpr = (LambdaColumnExpr) visit(ctx.columnLambdaExpr());
            return lambdaColumnExpr;
        }
        // this can't happen
        return null;
    }

    @Override
    public Object visitColumnArgList(ClickHouseParser.ColumnArgListContext ctx) {
        List<ColumnExpr> columnExprs = new ArrayList<>();
        for (ClickHouseParser.ColumnArgExprContext arg : ctx.columnArgExpr()) {
            ColumnExpr column = (ColumnExpr) visit(arg);
            columnExprs.add(column);
        }
        return columnExprs;
    }

    @Override
    public Object visitColumnExprAlias(ClickHouseParser.ColumnExprAliasContext ctx) {
        if (null != ctx.AS()) {
            ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
            Identifier identifier = (Identifier) visit(ctx.identifier());
            AliasColumnExpr aliasColumnExpr = ColumnExpr.createAlias(columnExpr, identifier);
            return aliasColumnExpr;
        } else {
            ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
            Identifier identifier = (Identifier) visit(ctx.alias());
            AliasColumnExpr aliasColumnExpr = ColumnExpr.createAlias(columnExpr, identifier);
            return aliasColumnExpr;
        }
    }

    @Override
    public Object visitColumnExprAnd(ClickHouseParser.ColumnExprAndContext ctx) {
        Identifier name = new Identifier("and");
        List<ColumnExpr> args = new ArrayList<>();
        for (ClickHouseParser.ColumnExprContext expr : ctx.columnExpr()) {
            ColumnExpr arg = (ColumnExpr) visit(expr);
            args.add(arg);
        }
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprArray(ClickHouseParser.ColumnExprArrayContext ctx) {
        Identifier name = new Identifier("array");
        List<ColumnExpr> args = null;
        if (null != ctx.columnExprList()) {
            args = (List<ColumnExpr>) visit(ctx.columnExprList());
        }
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprArrayAccess(ClickHouseParser.ColumnExprArrayAccessContext ctx) {
        Identifier name = new Identifier("arrayElement");
        List<ColumnExpr> args = new ArrayList<>();
        for (ClickHouseParser.ColumnExprContext expr : ctx.columnExpr()) {
            ColumnExpr arg = (ColumnExpr) visit(expr);
            args.add(arg);
        }
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprAsterisk(ClickHouseParser.ColumnExprAsteriskContext ctx) {
        TableIdentifier table = null;
        if (null != ctx.tableIdentifier()) {
            table = (TableIdentifier) visit(ctx.tableIdentifier());
        }
        AsteriskColumnExpr asteriskColumnExpr = ColumnExpr.createAsterisk(table, true);
        return asteriskColumnExpr;
    }

    @Override
    public Object visitColumnExprBetween(ClickHouseParser.ColumnExprBetweenContext ctx) {
        // TODO: this logic is not correct, it is wrong when the SQL is as follows:
        // SELECT tdbank_imp_date ,count(Distinct uid) as uv,count(*) as pv,count(Distinct mid) as mid_cnt
        // FROM qmkg_log.msg_h_qmkg_dc00109
        // WHERE tdbank_imp_date between '2021-02-11' and '2021-02-17' and act_times>0
        // group by tdbank_imp_date
        // LIMIT 1000
        ColumnExpr expr1;
        ColumnExpr expr2;
        {
            Identifier name = null;
            if (null != ctx.NOT()) {
                name = new Identifier("lessOrEquals");
            } else {
                name = new Identifier("greaterOrEquals");
            }
            List<ColumnExpr> args = new ArrayList<>();
            args.add((ColumnExpr) visit(ctx.columnExpr(0)));
            args.add((ColumnExpr) visit(ctx.columnExpr(1)));
            expr1 = ColumnExpr.createFunction(name, null, args);
        }

        {
            Identifier name = null;
            if (null != ctx.NOT()) {
                name = new Identifier("greaterOrEquals");
            } else {
                name = new Identifier("lessOrEquals");
            }
            List<ColumnExpr> args = new ArrayList<>();
            args.add((ColumnExpr) visit(ctx.columnExpr(0)));
            args.add((ColumnExpr) visit(ctx.columnExpr(2)));
            expr2 = ColumnExpr.createFunction(name, null, args);
        }

        Identifier name = new Identifier("and");
        List<ColumnExpr> args = new ArrayList<>();
        args.add(expr1);
        args.add(expr2);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprCase(ClickHouseParser.ColumnExprCaseContext ctx) {
        boolean hasCaseExpr = (null != ctx.ELSE() && ctx.columnExpr().size() % 2 == 0) ||
                (null == ctx.ELSE() && ctx.columnExpr().size() % 2 == 1);
        Identifier name = new Identifier(hasCaseExpr ? "caseWithExpression" : "multiIf");
        List<ColumnExpr> args = new ArrayList<>();
        for (ClickHouseParser.ColumnExprContext expr : ctx.columnExpr()) {
            ColumnExpr columnExpr = (ColumnExpr) visit(expr);
            args.add(columnExpr);
        }
        if (null == ctx.ELSE()) {
            ColumnExpr arg = ColumnExpr.createLiteral(Literal.createNull());
            args.add(arg);
        }
        return ColumnExpr.createFunction(name, null, args);
    }

    @Override
    public Object visitColumnExprCast(ClickHouseParser.ColumnExprCastContext ctx) {
        List<ColumnExpr> args = new ArrayList<>();
        ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
        args.add(columnExpr);
        ColumnTypeExpr columnTypeExpr = (ColumnTypeExpr) visit(ctx.columnTypeExpr());
        LiteralColumnExpr literalColumnExpr = ColumnExpr.createLiteral(Literal.createString(columnTypeExpr.toString()));
        args.add(literalColumnExpr);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(new Identifier("cast"), null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprDate(ClickHouseParser.ColumnExprDateContext ctx) {
        Identifier name = new Identifier("toDate");
        List<ColumnExpr> args = new ArrayList<>();
        LiteralColumnExpr literalColumnExpr = ColumnExpr.createLiteral(Literal.createString(ctx.STRING_LITERAL()));
        args.add(literalColumnExpr);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprExtract(ClickHouseParser.ColumnExprExtractContext ctx) {
        String name;
        List<ColumnExpr> args = new ArrayList<>();
        if (null != ctx.interval().SECOND()) {
            name = "toSecond";
        } else if (null != ctx.interval().MINUTE()) {
            name = "toMinute";
        } else if (null != ctx.interval().HOUR()) {
            name = "toHour";
        } else if (null != ctx.interval().DAY()) {
            name = "toDayOfMonth";
        } else if (null != ctx.interval().WEEK()) {
            throw new RuntimeException("The syntax 'EXTRACT(WEEK FROM date)' is not supported, cannot extract the number of a week");
        } else if (null != ctx.interval().MONTH()) {
            name = "toMonth";
        } else if (null != ctx.interval().QUARTER()) {
            name = "toQuarter";
        } else if (null != ctx.interval().YEAR()) {
            name = "toYear";
        } else {
            // this can't happen
            throw new RuntimeException("Syntax Error");
        }
        ColumnExpr arg = (ColumnExpr) visit(ctx.columnExpr());
        args.add(arg);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(new Identifier(name), null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprFunction(ClickHouseParser.ColumnExprFunctionContext ctx) {
        Identifier name = (Identifier) visit(ctx.identifier());
        List<ColumnExpr> params = null;
        if (null != ctx.DISTINCT() && null != name && name.getName().equals("count")) {
            name = new Identifier("countDistinct");
        }
        if (null != ctx.columnExprList()) {
            params = (List<ColumnExpr>) visit(ctx.columnExprList());
        }
        List<ColumnExpr> args = null;
        if (null != ctx.columnArgList()) {
            args = (List<ColumnExpr>) visit(ctx.columnArgList());
        }
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, params, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprIdentifier(ClickHouseParser.ColumnExprIdentifierContext ctx) {
        ColumnIdentifier columnIdentifier = (ColumnIdentifier) visit(ctx.columnIdentifier());
        IdentifierColumnExpr identifierColumnExpr = ColumnExpr.createIdentifier(columnIdentifier);
        return identifierColumnExpr;
    }

    @Override
    public Object visitColumnExprInterval(ClickHouseParser.ColumnExprIntervalContext ctx) {
        Identifier name;
        if (null != ctx.interval().SECOND()) {
            name = new Identifier("toIntervalSecond");
        } else if (null != ctx.interval().MINUTE()) {
            name = new Identifier("toIntervalMinute");
        } else if (null != ctx.interval().HOUR()) {
            name = new Identifier("toIntervalHour");
        } else if (null != ctx.interval().DAY()) {
            name = new Identifier("toIntervalDay");
        } else if (null != ctx.interval().WEEK()) {
            name = new Identifier("toIntervalWeek");
        } else if (null != ctx.interval().MONTH()) {
            name = new Identifier("toIntervalMonth");
        } else if (null != ctx.interval().QUARTER()) {
            name = new Identifier("toIntervalQuarter");
        } else if (null != ctx.interval().YEAR()) {
            name = new Identifier("toIntervalYear");
        } else {
            // this can't happen
            throw new RuntimeException("Syntax Error");
        }
        List<ColumnExpr> args = new ArrayList<>();
        ColumnExpr arg = (ColumnExpr) visit(ctx.columnExpr());
        args.add(arg);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprIsNull(ClickHouseParser.ColumnExprIsNullContext ctx) {
        Identifier name;
        if (null != ctx.NOT()) {
            name = new Identifier("isNotNull");
        } else {
            name = new Identifier("isNull");
        }
        List<ColumnExpr> args = new ArrayList<>();
        ColumnExpr arg = (ColumnExpr) visit(ctx.columnExpr());
        args.add(arg);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprList(ClickHouseParser.ColumnExprListContext ctx) {
        List<ColumnExpr> list = new ArrayList<>();
        for (ClickHouseParser.ColumnsExprContext expr : ctx.columnsExpr()) {
            ColumnExpr columnExpr = (ColumnExpr) visit(expr);
            list.add(columnExpr);
        }
        return list;
    }

    @Override
    public Object visitColumnExprLiteral(ClickHouseParser.ColumnExprLiteralContext ctx) {
        Literal literal = (Literal) visit(ctx.literal());
        LiteralColumnExpr literalColumnExpr = ColumnExpr.createLiteral(literal);
        return literalColumnExpr;
    }

    @Override
    public Object visitColumnExprNegate(ClickHouseParser.ColumnExprNegateContext ctx) {
        Identifier name = new Identifier("negate");
        List<ColumnExpr> args = new ArrayList<>();
        ColumnExpr arg = (ColumnExpr) visit(ctx.columnExpr());
        args.add(arg);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprNot(ClickHouseParser.ColumnExprNotContext ctx) {
        Identifier name = new Identifier("not");
        List<ColumnExpr> args = new ArrayList<>();
        ColumnExpr arg = (ColumnExpr) visit(ctx.columnExpr());
        args.add(arg);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprOr(ClickHouseParser.ColumnExprOrContext ctx) {
        Identifier name = new Identifier("or");
        List<ColumnExpr> args = new ArrayList<>();
        for (ClickHouseParser.ColumnExprContext expr : ctx.columnExpr()) {
            ColumnExpr arg = (ColumnExpr) visit(expr);
            args.add(arg);
        }
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprParens(ClickHouseParser.ColumnExprParensContext ctx) {
        return visit(ctx.columnExpr());
    }

    @Override
    public Object visitColumnExprPrecedence1(ClickHouseParser.ColumnExprPrecedence1Context ctx) {
        Identifier name = null;
        if (null != ctx.ASTERISK()) {
            name = new Identifier("multiply");
        } else if (null != ctx.SLASH()) {
            name = new Identifier("divide");
        } else if (null != ctx.PERCENT()) {
            name = new Identifier("modulo");
        }
        List<ColumnExpr> args = new ArrayList<>();
        for (ClickHouseParser.ColumnExprContext expr : ctx.columnExpr()) {
            ColumnExpr columnExpr = (ColumnExpr) visit(expr);
            args.add(columnExpr);
        }
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprPrecedence2(ClickHouseParser.ColumnExprPrecedence2Context ctx) {
        Identifier name = null;
        if (null != ctx.PLUS()) {
            name = new Identifier("plus");
        } else if (null != ctx.DASH()) {
            name = new Identifier("minus");
        } else if (null != ctx.CONCAT()) {
            name = new Identifier("concat");
        }
        List<ColumnExpr> args = new ArrayList<>();
        for (ClickHouseParser.ColumnExprContext expr : ctx.columnExpr()) {
            ColumnExpr columnExpr = (ColumnExpr) visit(expr);
            args.add(columnExpr);
        }
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprPrecedence3(ClickHouseParser.ColumnExprPrecedence3Context ctx) {
        Identifier name = null;
        if (null != ctx.EQ_DOUBLE() || null != ctx.EQ_SINGLE()) {
            name = new Identifier("equals");
        } else if (null != ctx.NOT_EQ()) {
            name = new Identifier("notEquals");
        } else if (null != ctx.LE()) {
            name = new Identifier("lessOrEquals");
        } else if (null != ctx.GE()) {
            name = new Identifier("greaterOrEquals");
        } else if (null != ctx.LT()) {
            name = new Identifier("less");
        } else if (null != ctx.GT()) {
            name = new Identifier("greater");
        } else if (null != ctx.LIKE()) {
            if (null != ctx.NOT()) {
                name = new Identifier("notLike");
            } else {
                name = new Identifier("like");
            }
        } else if (null != ctx.ILIKE()) {
            if (null != ctx.NOT()) {
                name = new Identifier("notILike");
            } else {
                name = new Identifier("ilike");
            }
        } else if (null != ctx.IN()) {
            if (null != ctx.GLOBAL()) {
                if (null != ctx.NOT()) {
                    name = new Identifier("globalNotIn");
                } else {
                    name = new Identifier("globalIn");
                }
            } else {
                if (null != ctx.NOT()) {
                    name = new Identifier("notIn");
                } else {
                    name = new Identifier("in");
                }
            }
        }
        List<ColumnExpr> args = new ArrayList<>();
        for (ClickHouseParser.ColumnExprContext expr : ctx.columnExpr()) {
            ColumnExpr columnExpr = (ColumnExpr) visit(expr);
            args.add(columnExpr);
        }
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprSubquery(ClickHouseParser.ColumnExprSubqueryContext ctx) {
        // IN-operator is special since it accepts non-scalar subqueries on the right side.
        ClickHouseParser.ColumnExprPrecedence3Context parent = null;
        if (ctx.parent instanceof ClickHouseParser.ColumnExprPrecedence3Context) {
            parent = (ClickHouseParser.ColumnExprPrecedence3Context) ctx.parent;
        }
        SelectUnionQuery selectUnionQuery = (SelectUnionQuery) visit(ctx.selectUnionStmt());
        boolean scalar = !(null != parent && null != parent.IN());
        ColumnExpr columnExpr = ColumnExpr.createSubquery(selectUnionQuery, scalar);
        return columnExpr;
    }

    @Override
    public Object visitColumnExprSubstring(ClickHouseParser.ColumnExprSubstringContext ctx) {
        Identifier name = new Identifier("substring");
        List<ColumnExpr> args = new ArrayList<>();
        for (ClickHouseParser.ColumnExprContext expr : ctx.columnExpr()) {
            ColumnExpr arg = (ColumnExpr) visit(expr);
            args.add(arg);
        }
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprTernaryOp(ClickHouseParser.ColumnExprTernaryOpContext ctx) {
        Identifier name = new Identifier("if");
        List<ColumnExpr> args = new ArrayList<>();
        for (ClickHouseParser.ColumnExprContext expr : ctx.columnExpr()) {
            ColumnExpr arg = (ColumnExpr) visit(expr);
            args.add(arg);
        }
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprTimestamp(ClickHouseParser.ColumnExprTimestampContext ctx) {
        Identifier name = new Identifier("toDateTime");
        List<ColumnExpr> args = new ArrayList<>();
        LiteralColumnExpr literalColumnExpr = ColumnExpr.createLiteral(Literal.createString(ctx.STRING_LITERAL()));
        args.add(literalColumnExpr);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprTrim(ClickHouseParser.ColumnExprTrimContext ctx) {
        Identifier name = new Identifier("trim");
        List<ColumnExpr> args = new ArrayList<>();
        List<ColumnExpr> params = new ArrayList<>();
        ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
        args.add(columnExpr);
        // TODO: params->append(Literal::createString(???));
        LiteralColumnExpr literalColumnExpr = ColumnExpr.createLiteral(Literal.createString(ctx.STRING_LITERAL()));
        params.add(literalColumnExpr);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, params, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprTuple(ClickHouseParser.ColumnExprTupleContext ctx) {
        Identifier name = new Identifier("tuple");
        List<ColumnExpr> args = (List<ColumnExpr>) visit(ctx.columnExprList());
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnExprTupleAccess(ClickHouseParser.ColumnExprTupleAccessContext ctx) {
        Identifier name = new Identifier("tupleElement");
        List<ColumnExpr> args = new ArrayList<>();
        ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
        args.add(columnExpr);
        LiteralColumnExpr literalColumnExpr = ColumnExpr.createLiteral(Literal.createNumber(ctx.DECIMAL_LITERAL()));
        args.add(literalColumnExpr);
        FunctionColumnExpr functionColumnExpr = ColumnExpr.createFunction(name, null, args);
        return functionColumnExpr;
    }

    @Override
    public Object visitColumnLambdaExpr(ClickHouseParser.ColumnLambdaExprContext ctx) {
        List<Identifier> params = new ArrayList<>();
        for (ClickHouseParser.IdentifierContext id : ctx.identifier()) {
            Identifier identifier = (Identifier) visit(id);
            params.add(identifier);
        }
        ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
        LambdaColumnExpr lambdaColumnExpr = ColumnExpr.createLambda(params, columnExpr);
        return lambdaColumnExpr;
    }

    @Override
    public Object visitColumnsExprAsterisk(ClickHouseParser.ColumnsExprAsteriskContext ctx) {
        TableIdentifier table = null;
        if (null != ctx.tableIdentifier()) {
            table = (TableIdentifier) visit(ctx.tableIdentifier());
        }
        AsteriskColumnExpr asteriskColumnExpr = ColumnExpr.createAsterisk(table, false);
        return asteriskColumnExpr;
    }

    @Override
    public Object visitColumnsExprSubquery(ClickHouseParser.ColumnsExprSubqueryContext ctx) {
        SelectUnionQuery selectUnionQuery = (SelectUnionQuery) visit(ctx.selectUnionStmt());
        SubqueryColumnExpr subqueryColumnExpr = ColumnExpr.createSubquery(selectUnionQuery, false);
        return subqueryColumnExpr;
    }

    @Override
    public Object visitColumnsExprColumn(ClickHouseParser.ColumnsExprColumnContext ctx) {

        return visit(ctx.columnExpr());
    }

    // Literal
    @Override
    public Object visitAlias(ClickHouseParser.AliasContext ctx) {
        if (null != ctx.IDENTIFIER()) {
            return new Identifier(ctx.IDENTIFIER().getText());
        }
        if (null != ctx.keywordForAlias()) {
            return new Identifier(ctx.keywordForAlias().getText());
        }
        // this can't happen
        return super.visitAlias(ctx);
    }

    @Override
    public Object visitColumnIdentifier(ClickHouseParser.ColumnIdentifierContext ctx) {
        TableIdentifier table = null;
        if (null != ctx.tableIdentifier()) {
            table = (TableIdentifier) visit(ctx.tableIdentifier());
        }
        Identifier identifier = null;
        if (null != ctx.nestedIdentifier()) {
            identifier = (Identifier) visit(ctx.nestedIdentifier());
        } else {
            identifier = new Identifier(table.getQualifiedName());
        }
        if (null == table || null == table.getName() || table.getName().isEmpty()) {
            // TODO: this is used for paring partition range, we need to consider alias in SELECT clause
            if (fillDefaultDatabase) {
                table = currentTableIdentifier;
            }
        }
        ColumnIdentifier columnIdentifier = new ColumnIdentifier(table, identifier);
        return columnIdentifier;
    }

    @Override
    public Object visitDatabaseIdentifier(ClickHouseParser.DatabaseIdentifierContext ctx) {
        Identifier databaseIdentifier = (Identifier) visit(ctx.identifier());
        return databaseIdentifier;
    }

    @Override
    public Object visitIdentifier(ClickHouseParser.IdentifierContext ctx) {
        if (null != ctx.IDENTIFIER()) {
            return new Identifier(ctx.IDENTIFIER().getText());
        }
        if (null != ctx.interval()) {
            return new Identifier(ctx.interval().getText());
        }
        if (null != ctx.keyword()) {
            return new Identifier(ctx.keyword().getText());
        }
        // this can't happen
        return super.visitIdentifier(ctx);
    }

    @Override
    public Object visitIdentifierOrNull(ClickHouseParser.IdentifierOrNullContext ctx) {
        if (null != ctx.identifier()) {
            return visit(ctx.identifier());
        }
        if (null != ctx.NULL_SQL()) {
            if (ctx.NULL_SQL().getSymbol().getText() == "Null") {
                return new Identifier("Null");
            } else {
                // TODO: raise error
            }
        }
        // this can't happen
        return super.visitIdentifierOrNull(ctx);
    }

    @Override
    public Object visitInterval(ClickHouseParser.IntervalContext ctx) {
        return super.visitInterval(ctx);
    }

    @Override
    public Object visitKeyword(ClickHouseParser.KeywordContext ctx) {
        return super.visitKeyword(ctx);
    }

    @Override
    public Object visitKeywordForAlias(ClickHouseParser.KeywordForAliasContext ctx) {
        return super.visitKeywordForAlias(ctx);
    }

    @Override
    public Object visitNestedIdentifier(ClickHouseParser.NestedIdentifierContext ctx) {
        if (ctx.identifier().size() == 2) {
            String name1 = ((Identifier) visit(ctx.identifier(0))).getName();
            String name2 = ((Identifier) visit(ctx.identifier(1))).getName();
            return new Identifier(name1, name2);
        } else {
            return visit(ctx.identifier(0));
        }
    }

    @Override
    public Object visitTableIdentifier(ClickHouseParser.TableIdentifierContext ctx) {
        Identifier database = null;
        if (null != ctx.databaseIdentifier()) {
            database = (Identifier) visit(ctx.databaseIdentifier());
        }
        if (null == database && fillDefaultDatabase) {
            database = new Identifier(defaultDatabase);
        }
        Identifier identifier = (Identifier) visit(ctx.identifier());
        TableIdentifier tableIdentifier = new TableIdentifier(database, identifier);
        currentTableIdentifier = tableIdentifier;
        return tableIdentifier;
    }

    // JoinExpr
    @Override
    public Object visitJoinConstraintClause(ClickHouseParser.JoinConstraintClauseContext ctx) {
        JoinConstraintClause.ConstraintType constraintType = null;
        if (null != ctx.ON()) {
            constraintType = JoinConstraintClause.ConstraintType.ON;
        } else {
            constraintType = JoinConstraintClause.ConstraintType.USING;
        }
        List<ColumnExpr> columnExprs = (List<ColumnExpr>) visit(ctx.columnExprList());
        JoinConstraintClause joinConstraintClause = new JoinConstraintClause(constraintType, columnExprs);
        return joinConstraintClause;
    }

    @Override
    public Object visitJoinExprCrossOp(ClickHouseParser.JoinExprCrossOpContext ctx) {
        Map<JoinExpr.JoinOpType, JoinExpr.JoinOpMode> opMap = (Map<JoinExpr.JoinOpType, JoinExpr.JoinOpMode>) visit(ctx.joinOpCross());
        Map.Entry<JoinExpr.JoinOpType, JoinExpr.JoinOpMode> opEntry = opMap.entrySet().stream().findFirst().get();
        JoinExpr leftExpr = (JoinExpr) visit(ctx.joinExpr(0));
        JoinExpr rightExpr = (JoinExpr) visit(ctx.joinExpr(1));
        JoinExpr joinExpr = JoinExpr.createJoinOp(opEntry.getKey(), leftExpr, rightExpr, opEntry.getValue(), null);
        return joinExpr;
    }

    @Override
    public Object visitJoinExprOp(ClickHouseParser.JoinExprOpContext ctx) {
        JoinExpr.JoinOpMode mode = JoinExpr.JoinOpMode.DEFAULT;
        JoinExpr.JoinOpType op = JoinExpr.JoinOpType.INNER;
        if (null != ctx.joinOp()) {
            op = (JoinExpr.JoinOpType) visit(ctx.joinOp());
        }
        if (null != ctx.GLOBAL()) {
            mode = JoinExpr.JoinOpMode.GLOBAL;
        } else if (null != ctx.LOCAL()) {
            mode = JoinExpr.JoinOpMode.LOCAL;
        }
        JoinExpr leftExpr = (JoinExpr) visit(ctx.joinExpr(0));
        JoinExpr rightExpr = (JoinExpr) visit(ctx.joinExpr(1));
        JoinConstraintClause joinConstraintClause = (JoinConstraintClause) visit(ctx.joinConstraintClause());
        JoinExpr joinExpr = JoinExpr.createJoinOp(op, leftExpr, rightExpr, mode, joinConstraintClause);
        return joinExpr;
    }

    @Override
    public Object visitJoinExprParens(ClickHouseParser.JoinExprParensContext ctx) {
        return visit(ctx.joinExpr());
    }

    @Override
    public Object visitJoinExprTable(ClickHouseParser.JoinExprTableContext ctx) {
        SampleClause sampleClause = null;
        if (null != ctx.sampleClause()) {
            sampleClause = (SampleClause) visit(ctx.sampleClause());
        }
        boolean finalExpr = false;
        if (null != ctx.FINAL()) {
            finalExpr = true;
        }
        TableExpr tableExpr = (TableExpr) visit(ctx.tableExpr());
        JoinExpr joinExpr = JoinExpr.createTableExpr(tableExpr, sampleClause, finalExpr);
        return joinExpr;
    }

    @Override
    public Object visitJoinOpCross(ClickHouseParser.JoinOpCrossContext ctx) {
        JoinExpr.JoinOpType type = JoinExpr.JoinOpType.CROSS;
        JoinExpr.JoinOpMode mode = JoinExpr.JoinOpMode.DEFAULT;
        if (null != ctx.GLOBAL()) {
            mode = JoinExpr.JoinOpMode.GLOBAL;
        } else if (null != ctx.LOCAL()) {
            mode = JoinExpr.JoinOpMode.LOCAL;
        }
        Map<JoinExpr.JoinOpType, JoinExpr.JoinOpMode> opMap = new HashMap<>();
        opMap.put(type, mode);
        return opMap;
    }

    @Override
    public Object visitJoinOpFull(ClickHouseParser.JoinOpFullContext ctx) {
        if (null != ctx.ALL()) {
            return JoinExpr.JoinOpType.FULL_ALL;
        }
        if (null != ctx.ANY()) {
            return JoinExpr.JoinOpType.FULL_ANY;
        }
        return JoinExpr.JoinOpType.FULL;
    }

    @Override
    public Object visitJoinOpInner(ClickHouseParser.JoinOpInnerContext ctx) {
        if (null != ctx.ALL()) {
            return JoinExpr.JoinOpType.INNER_ALL;
        }
        if (null != ctx.ANY()) {
            return JoinExpr.JoinOpType.INNER_ANY;
        }
        if (null != ctx.ASOF()) {
            return JoinExpr.JoinOpType.INNER_ASOF;
        }
        return JoinExpr.JoinOpType.INNER;
    }

    @Override
    public Object visitJoinOpLeftRight(ClickHouseParser.JoinOpLeftRightContext ctx) {
        if (null != ctx.LEFT()) {
            if (null != ctx.SEMI()) {
                return JoinExpr.JoinOpType.LEFT_SEMI;
            }
            if (null != ctx.ALL()) {
                return JoinExpr.JoinOpType.LEFT_ALL;
            }
            if (null != ctx.ANTI()) {
                return JoinExpr.JoinOpType.LEFT_ANTI;
            }
            if (null != ctx.ANY()) {
                return JoinExpr.JoinOpType.LEFT_ANY;
            }
            if (null != ctx.ASOF()) {
                return JoinExpr.JoinOpType.LEFT_ASOF;
            }
            return JoinExpr.JoinOpType.LEFT;
        } else if (null != ctx.RIGHT()) {
            if (null != ctx.SEMI()) {
                return JoinExpr.JoinOpType.RIGHT_SEMI;
            }
            if (null != ctx.ALL()) {
                return JoinExpr.JoinOpType.RIGHT_ALL;
            }
            if (null != ctx.ANTI()) {
                return JoinExpr.JoinOpType.RIGHT_ANTI;
            }
            if (null != ctx.ANY()) {
                return JoinExpr.JoinOpType.RIGHT_ANY;
            }
            if (null != ctx.ASOF()) {
                return JoinExpr.JoinOpType.RIGHT_ASOF;
            }
            return JoinExpr.JoinOpType.RIGHT;
        }
        // this can't happen
        return super.visitJoinOpLeftRight(ctx);
    }

    @Override
    public Object visitSampleClause(ClickHouseParser.SampleClauseContext ctx) {
        RatioExpr offset = null;
        if (ctx.ratioExpr().size() == 2) {
            offset = (RatioExpr) visit(ctx.ratioExpr(1));
        }
        RatioExpr ratio = (RatioExpr) visit(ctx.ratioExpr(0));
        SampleClause sampleClause = new SampleClause(ratio, offset);
        return sampleClause;
    }

    // TableExpr
    @Override
    public Object visitTableArgExpr(ClickHouseParser.TableArgExprContext ctx) {
        if (null != ctx.literal()) {
            Literal literal = (Literal) visit(ctx.literal());
            TableArgExpr tableArgExpr = new TableArgExpr(literal);
            return tableArgExpr;
        }
        if (null != ctx.tableFunctionExpr()) {
            TableFunctionExpr tableFunctionExpr = (TableFunctionExpr) visit(ctx.tableFunctionExpr());
            TableArgExpr tableArgExpr = new TableArgExpr(tableFunctionExpr);
            return tableArgExpr;
        }
        if (null != ctx.tableIdentifier()) {
            TableIdentifier tableIdentifier = (TableIdentifier) visit(ctx.tableIdentifier());
            TableArgExpr tableArgExpr = new TableArgExpr(tableIdentifier);
            return tableArgExpr;
        }
        // this can't happen
        return super.visitTableArgExpr(ctx);
    }

    @Override
    public Object visitTableArgList(ClickHouseParser.TableArgListContext ctx) {
        List<TableArgExpr> list = new ArrayList<>();
        for (ClickHouseParser.TableArgExprContext arg : ctx.tableArgExpr()) {
            TableArgExpr argExpr = (TableArgExpr) visit(arg);
            list.add(argExpr);
        }
        return list;
    }

    @Override
    public Object visitTableExprAlias(ClickHouseParser.TableExprAliasContext ctx) {
        if (null != ctx.AS()) {
            TableExpr tableExpr = (TableExpr) visit(ctx.tableExpr());
            Identifier identifier = (Identifier) visit(ctx.identifier());
            return TableExpr.createAlias(tableExpr, identifier);
        } else {
            TableExpr tableExpr = (TableExpr) visit(ctx.tableExpr());
            Identifier alias = (Identifier) visit(ctx.alias());
            return TableExpr.createAlias(tableExpr, alias);
        }
    }

    @Override
    public Object visitTableExprFunction(ClickHouseParser.TableExprFunctionContext ctx) {
        TableFunctionExpr tableFunctionExpr = (TableFunctionExpr) visit(ctx.tableFunctionExpr());
        TableExpr tableExpr = TableExpr.createFunction(tableFunctionExpr);
        return tableExpr;
    }

    @Override
    public Object visitTableExprIdentifier(ClickHouseParser.TableExprIdentifierContext ctx) {
        TableIdentifier tableIdentifier = (TableIdentifier) visit(ctx.tableIdentifier());
        TableExpr tableExpr = TableExpr.createIdentifier(tableIdentifier);
        return tableExpr;
    }

    @Override
    public Object visitTableExprSubquery(ClickHouseParser.TableExprSubqueryContext ctx) {
        SelectUnionQuery selectUnionQuery = (SelectUnionQuery) visit(ctx.selectUnionStmt());
        TableExpr tableExpr = TableExpr.createSubquery(selectUnionQuery);
        return tableExpr;
    }

    @Override
    public Object visitTableFunctionExpr(ClickHouseParser.TableFunctionExprContext ctx) {
        List<TableArgExpr> list = null;
        if (null != ctx.tableArgList()) {
            list = (List<TableArgExpr>) visit(ctx.tableArgList());
        }
        Identifier identifier = (Identifier) visit(ctx.identifier());
        TableFunctionExpr tableFunctionExpr = new TableFunctionExpr(identifier, list);
        return tableFunctionExpr;
    }

    // LimitExpr
    @Override
    public Object visitLimitExpr(ClickHouseParser.LimitExprContext ctx) {
        if (ctx.columnExpr().size() == 2) {
            ColumnExpr limitColumnExpr = (ColumnExpr) visit(ctx.columnExpr(0));
            ColumnExpr offsetColumnExpr = (ColumnExpr) visit(ctx.columnExpr(1));
            LimitExpr limit = new LimitExpr(limitColumnExpr, offsetColumnExpr);
            return limit;
        } else {
            ColumnExpr limitColumnExpr = (ColumnExpr) visit(ctx.columnExpr(0));
            LimitExpr limit = new LimitExpr(limitColumnExpr);
            return limit;
        }
    }

    // Literal
    @Override
    public Object visitFloatingLiteral(ClickHouseParser.FloatingLiteralContext ctx) {
        if (null != ctx.FLOATING_LITERAL()) {
            return Literal.createNumber(ctx.FLOATING_LITERAL());
        }
        Token dot = ctx.DOT().getSymbol();
        if (!ctx.DECIMAL_LITERAL().isEmpty()) {
            // .1234
            if (dot.getTokenIndex() < ctx.DECIMAL_LITERAL(0).getSymbol().getTokenIndex()) {
                return Literal.createNumber(dot.getText() + ctx.DECIMAL_LITERAL(0).getSymbol().getText());
            }
            // 1234.
            else if (ctx.DECIMAL_LITERAL().size() == 1 && null == ctx.OCTAL_LITERAL()) {
                return Literal.createNumber(ctx.DECIMAL_LITERAL(0).getSymbol().getText() + dot.getText());
            }
            // 1234.1234
            else if (ctx.DECIMAL_LITERAL().size() == 2) {
                return Literal.createNumber(ctx.DECIMAL_LITERAL(0).getSymbol().getText() + dot.getText() + ctx.DECIMAL_LITERAL(1).getSymbol().getText());
            }
            // 1234.0123
            else {
                return Literal.createNumber(ctx.DECIMAL_LITERAL(0).getSymbol().getText() + dot.getText() + ctx.OCTAL_LITERAL().getSymbol().getText());
            }
        }
        // .0123
        else {
            return Literal.createNumber(dot.getText() + ctx.OCTAL_LITERAL().getSymbol().getText());
        }
    }

    @Override
    public Object visitLiteral(ClickHouseParser.LiteralContext ctx) {
        if (null != ctx.NULL_SQL()) {
            return Literal.createNull();
        }
        if (null != ctx.STRING_LITERAL()) {
            StringLiteral stringLiteral = Literal.createString(ctx.STRING_LITERAL());
            return stringLiteral;
        }
        if (null != ctx.numberLiteral()) {
            NumberLiteral numberLiteral = (NumberLiteral) visit(ctx.numberLiteral());
            return numberLiteral;
        }
        // this can't hadppen
        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitNumberLiteral(ClickHouseParser.NumberLiteralContext ctx) {
        if (null != ctx.floatingLiteral()) {
            NumberLiteral number = (NumberLiteral) visit(ctx.floatingLiteral());
            if (null != ctx.DASH()) {
                number.makeNegative();
            }
            return number;
        }
        if (null != ctx.OCTAL_LITERAL()) {
            boolean negative = false;
            if (null != ctx.DASH()) {
                negative = true;
            }
            return Literal.createNumber(ctx.OCTAL_LITERAL(), negative);
        }
        if (null != ctx.DECIMAL_LITERAL()) {
            boolean negative = false;
            if (null != ctx.DASH()) {
                negative = true;
            }
            return Literal.createNumber(ctx.DECIMAL_LITERAL(), negative);
        }
        if (null != ctx.HEXADECIMAL_LITERAL()) {
            boolean negative = false;
            if (null != ctx.DASH()) {
                negative = true;
            }
            return Literal.createNumber(ctx.HEXADECIMAL_LITERAL(), negative);
        }
        if (null != ctx.INF()) {
            boolean negative = false;
            if (null != ctx.DASH()) {
                negative = true;
            }
            return Literal.createNumber(ctx.INF(), negative);
        }
        if (null != ctx.NAN_SQL()) {
            return Literal.createNumber(ctx.NAN_SQL());
        }
        // this can't happen
        return super.visitNumberLiteral(ctx);
    }

    // ColumnTypeExpr
    @Override
    public Object visitColumnTypeExprSimple(ClickHouseParser.ColumnTypeExprSimpleContext ctx) {
        Identifier identifier = (Identifier) visit(ctx.identifier());
        SimpleColumnTypeExpr simpleColumnTypeExpr = ColumnTypeExpr.createSimple(identifier);
        return simpleColumnTypeExpr;
    }

    @Override
    public Object visitColumnTypeExprParam(ClickHouseParser.ColumnTypeExprParamContext ctx) {
        List<ColumnExpr> list = null;
        if (null != ctx.columnExprList()) {
            list = (List<ColumnExpr>) visit(ctx.columnExprList());
        }
        Identifier identifier = (Identifier) visit(ctx.identifier());
        ParamColumnTypeExpr paramColumnTypeExpr = ColumnTypeExpr.createParam(identifier, list);
        return paramColumnTypeExpr;
    }

    @Override
    public Object visitColumnTypeExprEnum(ClickHouseParser.ColumnTypeExprEnumContext ctx) {
        List<EnumValue> list = new ArrayList<>();
        for (ClickHouseParser.EnumValueContext value : ctx.enumValue()) {
            EnumValue enumValue = (EnumValue) visit(value);
            list.add(enumValue);
        }
        Identifier identifier = (Identifier) visit(ctx.identifier());
        EnumColumnTypeExpr enumColumnTypeExpr = ColumnTypeExpr.createEnum(identifier, list);
        return enumColumnTypeExpr;
    }

    @Override
    public Object visitColumnTypeExprComplex(ClickHouseParser.ColumnTypeExprComplexContext ctx) {
        List<ColumnTypeExpr> list = new ArrayList<>();
        for (ClickHouseParser.ColumnTypeExprContext expr : ctx.columnTypeExpr()) {
            ColumnTypeExpr columnTypeExpr = (ColumnTypeExpr) visit(expr);
            list.add(columnTypeExpr);
        }
        Identifier identifier = (Identifier) visit(ctx.identifier());
        ComplexColumnTypeExpr complexColumnTypeExpr = ColumnTypeExpr.createComplex(identifier, list);
        return complexColumnTypeExpr;
    }

    @Override
    public Object visitColumnTypeExprNested(ClickHouseParser.ColumnTypeExprNestedContext ctx) {
        List<ColumnTypeExpr> list = new ArrayList<>();
        for (int i = 0; i < ctx.columnTypeExpr().size(); i++) {
            Identifier identifier = (Identifier) visit(ctx.identifier(i + 1));
            ColumnTypeExpr columnTypeExpr = (ColumnTypeExpr) visit(ctx.columnTypeExpr(i));
            NamedColumnTypeExpr namedColumnTypeExpr = ColumnTypeExpr.createNamed(identifier, columnTypeExpr);
            list.add(namedColumnTypeExpr);
        }
        Identifier identifier = (Identifier) visit(ctx.identifier(0));
        NestedColumnTypeExpr nestedColumnTypeExpr = ColumnTypeExpr.createNested(identifier, list);
        return nestedColumnTypeExpr;
    }

    @Override
    public Object visitEnumValue(ClickHouseParser.EnumValueContext ctx) {
        StringLiteral stringLiteral = Literal.createString(ctx.STRING_LITERAL());
        NumberLiteral numberLiteral = (NumberLiteral) visit(ctx.numberLiteral());
        EnumValue enumValue = new EnumValue(stringLiteral, numberLiteral);
        return enumValue;
    }

    // OrderExpr
    @Override
    public Object visitOrderExprList(ClickHouseParser.OrderExprListContext ctx) {
        List<OrderExpr> exprList = new ArrayList<>();
        for (ClickHouseParser.OrderExprContext expr : ctx.orderExpr()) {
            OrderExpr orderExpr = (OrderExpr) visit(expr);
            exprList.add(orderExpr);
        }
        return exprList;
    }

    @Override
    public Object visitOrderExpr(ClickHouseParser.OrderExprContext ctx) {
        OrderExpr.NullsOrder nulls = OrderExpr.NullsOrder.NATURAL;
        if (null != ctx.FIRST()) {
            nulls = OrderExpr.NullsOrder.NULLS_FIRST;
        } else if (null != ctx.LAST()) {
            nulls = OrderExpr.NullsOrder.NULLS_LAST;
        }

        StringLiteral collate = null;
        if (null != ctx.COLLATE()) {
            collate = Literal.createString(ctx.STRING_LITERAL());
        }
        ColumnExpr columnExpr = (ColumnExpr) visit(ctx.columnExpr());
        OrderExpr orderExpr = new OrderExpr(columnExpr, nulls, collate, null == ctx.DESCENDING() && null == ctx.DESC());
        return orderExpr;
    }

}
