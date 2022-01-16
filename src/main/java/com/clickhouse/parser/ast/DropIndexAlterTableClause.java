package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class DropIndexAlterTableClause extends AlterTableClause {

    private boolean ifExists;

    private Identifier identifier;

    public DropIndexAlterTableClause(boolean ifExists, Identifier identifier) {
        this.clauseType = ClauseType.DROP_INDEX;
        this.ifExists = ifExists;
        this.identifier = identifier;
    }

}
