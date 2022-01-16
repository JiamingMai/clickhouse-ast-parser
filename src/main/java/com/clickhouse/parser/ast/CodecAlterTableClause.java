package com.clickhouse.parser.ast;

import com.clickhouse.parser.ast.expr.CodecExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class CodecAlterTableClause extends AlterTableClause {

    private boolean ifExists;

    private Identifier identifier;

    private CodecExpr codec;

    public CodecAlterTableClause(boolean ifExists, Identifier identifier, CodecExpr codec) {
        this.clauseType = ClauseType.CODEC;
        this.ifExists = ifExists;
        this.identifier = identifier;
        this.codec = codec;
    }
}
