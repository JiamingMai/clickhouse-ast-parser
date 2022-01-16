package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class WithClause extends SimpleClause {

    private List<ColumnExpr> withExpr;

    public WithClause(List<ColumnExpr> withExpr) {
        this.withExpr = withExpr;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitWithClause(this);
    }
}
