package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class DropColumnAlterTableClause extends AlterTableClause {

    private boolean ifExists;

    private Identifier identifier;

    public DropColumnAlterTableClause(boolean ifExists, Identifier identifier) {
        this.clauseType = ClauseType.DROP_COLUMN;
        this.ifExists = ifExists;
        this.identifier = identifier;
    }
}
