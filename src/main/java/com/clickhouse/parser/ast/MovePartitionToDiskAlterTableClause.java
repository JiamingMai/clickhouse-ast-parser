package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class MovePartitionToDiskAlterTableClause extends AlterTableClause {

    private PartitionClause clause;

    private StringLiteral literal;

    public MovePartitionToDiskAlterTableClause(PartitionClause clause, StringLiteral literal) {
        this.clauseType = ClauseType.MOVE_PARTITION_TO_DISK;
        this.clause = clause;
        this.literal = literal;
    }
}
