package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class ClearAlterTableClause extends AlterTableClause {

    private boolean ifExists;

    private Identifier identifier;

    private PartitionClause in;

    public ClearAlterTableClause(boolean ifExists, Identifier identifier, PartitionClause in) {
        this.clauseType = ClauseType.CLEAR;
        this.ifExists = ifExists;
        this.identifier = identifier;
        this.in = in;
    }
}
