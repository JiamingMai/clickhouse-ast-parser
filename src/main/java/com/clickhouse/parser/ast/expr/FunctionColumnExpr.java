package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper=true)
public class FunctionColumnExpr extends ColumnExpr {

    private Identifier name;

    private List<ColumnExpr> params;

    private List<ColumnExpr> args;

    protected FunctionColumnExpr(Identifier name, List<ColumnExpr> params, List<ColumnExpr> args) {
        super(ExprType.FUNCTION);
        this.name = name;
        this.params = params;
        this.args = args;
    }

    public Identifier getName() {
        return name;
    }

    public List<ColumnExpr> getParams() {
        return params;
    }

    public List<ColumnExpr> getArgs() {
        return args;
    }

}
