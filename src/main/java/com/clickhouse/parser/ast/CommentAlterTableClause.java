package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class CommentAlterTableClause extends AlterTableClause {

    private boolean ifExists;

    private Identifier identifier;

    private StringLiteral comment;

    public CommentAlterTableClause(boolean ifExists, Identifier identifier, StringLiteral comment) {
        this.ifExists = ifExists;
        this.identifier = identifier;
        this.comment = comment;
    }

}
