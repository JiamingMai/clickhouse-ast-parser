package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=true)
public class NamedColumnTypeExpr extends ColumnTypeExpr {

    private ColumnTypeExpr type;

    public NamedColumnTypeExpr(Identifier name, ColumnTypeExpr type) {
        super(ExprType.NAMED, name);
        this.type = type;
    }

    public ColumnTypeExpr getType() {
        return type;
    }
}
