package com.clickhouse.parser.ast;

import com.clickhouse.parser.ast.expr.TableElementExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class AddIndexAlterTableClause extends AlterTableClause {

    private boolean ifNotExists;

    private TableElementExpr element;

    private Identifier after;

    public AddIndexAlterTableClause(boolean ifNotExists, TableElementExpr element, Identifier after) {
        this.clauseType = ClauseType.ADD_INDEX;
        this.ifNotExists = ifNotExists;
        this.element = element;
        this.after = after;
    }

}
