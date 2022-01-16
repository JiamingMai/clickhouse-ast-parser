package com.clickhouse.parser.ast;


import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.expr.TTLExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class TTLClause extends SimpleClause {

    private List<TTLExpr> ttlExprList;

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitTTLClause(this);
    }
}
