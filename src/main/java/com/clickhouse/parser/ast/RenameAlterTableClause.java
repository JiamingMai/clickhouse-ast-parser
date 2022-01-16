package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class RenameAlterTableClause extends AlterTableClause {

    private boolean ifExists;

    private Identifier identifier;

    private Identifier to;

    public RenameAlterTableClause(boolean ifExists, Identifier identifier, Identifier to) {
        this.clauseType = ClauseType.RENAME;
        this.ifExists = ifExists;
        this.identifier = identifier;
        this.to = to;
    }
}
