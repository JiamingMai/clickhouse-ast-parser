package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.INode;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class TableColumnPropertyExpr extends INode {

    private PropertyType propertyType;

    public enum PropertyType
    {
        SIMPLE,
        NAMED,
        COMPLEX,
        ENUM,
        PARAM,
        NESTED,
    }

    private ColumnExpr expr;

    public TableColumnPropertyExpr(PropertyType type, ColumnExpr expr) {
        this.propertyType = type;
        this.expr = expr;
    }

}
