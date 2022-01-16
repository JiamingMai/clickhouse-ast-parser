package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.INode;
import com.clickhouse.parser.ast.StringLiteral;
import com.clickhouse.parser.AstVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class OrderExpr extends INode {

    private boolean asc;

    private NullsOrder nulls;

    private ColumnExpr expr;

    private StringLiteral collate;

    public enum NullsOrder {
        NATURAL,
        NULLS_FIRST,
        NULLS_LAST,
    }

    public OrderExpr(ColumnExpr expr, NullsOrder nulls, StringLiteral collate) {
        this(expr, nulls, collate, true);
    }

    public OrderExpr(ColumnExpr expr, NullsOrder nulls, StringLiteral collate, boolean ascending) {
        this.expr = expr;
        this.nulls = nulls;
        this.collate = collate;
        this.asc = ascending;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitOrderExpr(this);
    }
}
