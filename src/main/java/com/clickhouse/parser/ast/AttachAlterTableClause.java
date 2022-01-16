package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class AttachAlterTableClause extends AlterTableClause {

    private PartitionClause partitionClause;

    private TableIdentifier from;

    public AttachAlterTableClause(PartitionClause partitionClause, TableIdentifier from) {
        this.clauseType = ClauseType.ATTACH;
        this.partitionClause = partitionClause;
        this.from = from;
    }
}
