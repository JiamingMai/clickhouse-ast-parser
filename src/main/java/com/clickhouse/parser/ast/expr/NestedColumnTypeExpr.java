package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper=true)
public class NestedColumnTypeExpr extends ColumnTypeExpr {

    private List<ColumnTypeExpr> list;

    public NestedColumnTypeExpr(Identifier name, List<ColumnTypeExpr> list) {
        super(ExprType.NESTED, name);
        this.list = list;
    }

    public List<ColumnTypeExpr> getList() {
        return list;
    }

}
