package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.TableIdentifier;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=true)
public class AsteriskColumnExpr extends ColumnExpr {

    private TableIdentifier table;

    protected AsteriskColumnExpr(TableIdentifier table) {
        super(ExprType.ASTERISK);
        this.table = table;
    }

    public TableIdentifier getTable() {
        return table;
    }
}
