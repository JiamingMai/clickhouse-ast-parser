package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class PrewhereClause extends SimpleClause {

    private ColumnExpr prewhereExpr;

    public PrewhereClause(ColumnExpr prewhereExpr) {
        this.prewhereExpr = prewhereExpr;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitPrewhereClause(this);
    }

}
