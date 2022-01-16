package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class JoinConstraintClause extends SimpleClause {

    private ConstraintType type;

    private List<ColumnExpr> exprs;

    public enum ConstraintType
    {
        ON,
        USING,
    }

    public JoinConstraintClause(ConstraintType type, List<ColumnExpr> exprs) {
        this.type = type;
        this.exprs = exprs;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitJoinConstraintClause(this);
    }
}
