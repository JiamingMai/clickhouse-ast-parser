package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper=true)
public class ComplexColumnTypeExpr extends ColumnTypeExpr {

    private List<ColumnTypeExpr> list;

    public ComplexColumnTypeExpr(Identifier name, List<ColumnTypeExpr> list) {
        super(ExprType.COMPLEX, name);
        this.list = list;
    }

    public List<ColumnTypeExpr> getList() {
        return list;
    }
}
