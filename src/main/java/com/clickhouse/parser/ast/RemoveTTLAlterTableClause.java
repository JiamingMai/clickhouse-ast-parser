package com.clickhouse.parser.ast;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class RemoveTTLAlterTableClause extends AlterTableClause {

    public RemoveTTLAlterTableClause() {
        this.clauseType = ClauseType.REMOVE_TTL;
    }
}
