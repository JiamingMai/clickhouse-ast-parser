package com.clickhouse.parser.ast;

import com.clickhouse.parser.ast.expr.TableElementExpr;
import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.expr.TableFunctionExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class TableSchemaClause extends INode {

    public enum ClauseType {
        DESCRIPTION,
        TABLE,
        FUNCTION,
    }

    private ClauseType clauseType;

    private List<TableElementExpr> exprs;

    private TableIdentifier identifier;

    private TableFunctionExpr functionExpr;

    public TableSchemaClause(ClauseType clauseType, List<TableElementExpr> exprs) {
        this.clauseType = clauseType;
        this.exprs = exprs;
    }

    public TableSchemaClause(ClauseType clauseType, TableIdentifier identifier) {
        this.clauseType = clauseType;
        this.identifier = identifier;
    }

    public TableSchemaClause(ClauseType clauseType, TableFunctionExpr functionExpr) {
        this.clauseType = clauseType;
        this.functionExpr = functionExpr;
    }

    public static TableSchemaClause createDescription(List<TableElementExpr> exprs) {
        return new TableSchemaClause(ClauseType.DESCRIPTION, exprs);
    }

    public static TableSchemaClause createAsTable(TableIdentifier identifier) {
        return new TableSchemaClause(ClauseType.TABLE, identifier);
    }

    public static TableSchemaClause createAsFunction(TableFunctionExpr functionExpr) {
        return new TableSchemaClause(ClauseType.FUNCTION, functionExpr);
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        // TODO:
        return super.accept(astVisitor);
    }
}
