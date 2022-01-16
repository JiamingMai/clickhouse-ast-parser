package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class DetachAlterTableClause extends AlterTableClause {

    private PartitionClause clause;

    public DetachAlterTableClause(PartitionClause clause) {
        this.clauseType = ClauseType.DETACH;
        this.clause = clause;
    }
}
