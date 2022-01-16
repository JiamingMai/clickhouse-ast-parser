package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper=true)
public class ParamColumnTypeExpr extends ColumnTypeExpr {

    private List<ColumnExpr> params;

    public ParamColumnTypeExpr(Identifier name, List<ColumnExpr> params) {
        super(ExprType.PARAM, name);
        this.params = params;
    }

    public List<ColumnExpr> getParams() {
        return params;
    }

}
