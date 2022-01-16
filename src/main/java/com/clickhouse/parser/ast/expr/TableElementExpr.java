package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.INode;
import com.clickhouse.parser.ast.Identifier;
import com.clickhouse.parser.ast.NumberLiteral;
import com.clickhouse.parser.ast.StringLiteral;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class TableElementExpr extends INode {

    private ExprType exprType;

    public enum ExprType
    {
        COLUMN,
        CONSTRAINT,
        INDEX
    }

    private CodecExpr codec;

    private ColumnExpr ttl;

    public static TableElementExpr createColumn(Identifier name, ColumnTypeExpr type, TableColumnPropertyExpr property, StringLiteral comment, CodecExpr codec, ColumnExpr ttl) {
        ColumnTableElementExpr tableElementExpr = new ColumnTableElementExpr(name, type, property, comment, codec, ttl);
        tableElementExpr.setExprType(ExprType.COLUMN);
        return tableElementExpr;
    }

    public static TableElementExpr createConstraint(Identifier identifier, ColumnExpr expr) {
        ConstraintTableElementExpr tableElementExpr = new ConstraintTableElementExpr(identifier, expr);
        tableElementExpr.setExprType(ExprType.CONSTRAINT);
        return tableElementExpr;
    }

    public static TableElementExpr createIndex(Identifier name, ColumnExpr expr, ColumnTypeExpr type, NumberLiteral granularity) {
        IndexTableElementExpr tableElementExpr = new IndexTableElementExpr(name, expr, type, granularity);
        tableElementExpr.setExprType(ExprType.INDEX);
        return tableElementExpr;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitTableElementExpr(this);
    }
}
