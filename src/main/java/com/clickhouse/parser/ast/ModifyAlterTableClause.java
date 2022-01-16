package com.clickhouse.parser.ast;

import com.clickhouse.parser.ast.expr.TableElementExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class ModifyAlterTableClause extends AlterTableClause {

    private boolean ifExists;

    private TableElementExpr element;

    public ModifyAlterTableClause(boolean ifExists, TableElementExpr element) {
        this.clauseType = ClauseType.MODIFY;
        this.ifExists = ifExists;
        this.element = element;
    }
}
