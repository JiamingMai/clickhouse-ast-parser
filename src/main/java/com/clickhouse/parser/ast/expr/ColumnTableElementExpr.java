package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import com.clickhouse.parser.ast.StringLiteral;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class ColumnTableElementExpr extends TableElementExpr {

    private Identifier name;

    private ColumnTypeExpr type;

    private TableColumnPropertyExpr property;

    private StringLiteral comment;

    private CodecExpr codec;

    private ColumnExpr ttl;

    public ColumnTableElementExpr(Identifier name, ColumnTypeExpr type, TableColumnPropertyExpr property, StringLiteral comment, CodecExpr codec, ColumnExpr ttl) {
        this.name = name;
        this.type = type;
        this.property = property;
        this.comment = comment;
        this.codec = codec;
        this.ttl = ttl;
    }
}
