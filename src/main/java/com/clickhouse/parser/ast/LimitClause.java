package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import lombok.Data;

@Data
public class LimitClause extends INode {

    private boolean withTies;

    private LimitExpr limitExpr;

    public LimitClause(boolean withTies, LimitExpr limitExpr) {
        this.withTies = withTies;
        this.limitExpr = limitExpr;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitLimitClause(this);
    }

}
