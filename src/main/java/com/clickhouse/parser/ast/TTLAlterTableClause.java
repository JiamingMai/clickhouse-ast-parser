package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class TTLAlterTableClause extends AlterTableClause {

    private TTLClause clause;

    public TTLAlterTableClause(TTLClause clause) {
        this.clauseType = ClauseType.TTL;
        this.clause = clause;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitTTLAlterTableClause(this);
    }
}
