package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class MovePartitionToVolumeAlterTableClause extends AlterTableClause {

    private PartitionClause clause;

    private StringLiteral literal;

    public MovePartitionToVolumeAlterTableClause(PartitionClause clause, StringLiteral literal) {
        this.clauseType = ClauseType.MOVE_PARTITION_TO_VOLUME;
        this.clause = clause;
        this.literal = literal;
    }
}
