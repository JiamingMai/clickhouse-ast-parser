package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class FreezePartitionAlterTableClause extends AlterTableClause {

    private PartitionClause clause;

    public FreezePartitionAlterTableClause(PartitionClause clause) {
        this.clauseType = ClauseType.FREEZE_PARTITION;
        this.clause = clause;
    }
}
