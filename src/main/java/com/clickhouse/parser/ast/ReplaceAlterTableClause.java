package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class ReplaceAlterTableClause extends AlterTableClause {

   private PartitionClause clause;

   private TableIdentifier from;

    public ReplaceAlterTableClause(PartitionClause clause, TableIdentifier from) {
        this.clauseType = ClauseType.REPLACE;
        this.clause = clause;
        this.from = from;
    }
}
