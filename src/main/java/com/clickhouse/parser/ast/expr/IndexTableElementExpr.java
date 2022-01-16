package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import com.clickhouse.parser.ast.NumberLiteral;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class IndexTableElementExpr extends TableElementExpr {

    private Identifier name;

    private ColumnExpr expr;

    private ColumnTypeExpr type;

    private NumberLiteral granularity;

    public IndexTableElementExpr(Identifier name, ColumnExpr expr, ColumnTypeExpr type, NumberLiteral granularity) {
        this.name = name;
        this.expr = expr;
        this.type = type;
        this.granularity = granularity;
    }
}
