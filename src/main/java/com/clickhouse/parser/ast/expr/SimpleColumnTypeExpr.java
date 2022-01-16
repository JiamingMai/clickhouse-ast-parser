package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=true)
public class SimpleColumnTypeExpr extends ColumnTypeExpr {

    public SimpleColumnTypeExpr(Identifier name) {
        super(ExprType.SIMPLE, name);
    }

}
