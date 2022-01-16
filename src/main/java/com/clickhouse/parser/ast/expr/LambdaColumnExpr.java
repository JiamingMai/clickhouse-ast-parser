package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper=true)
public class LambdaColumnExpr extends ColumnExpr {

    private List<Identifier> lambdaArgs;

    private ColumnExpr lambdaExpr;

    protected LambdaColumnExpr(List<Identifier> lambdaArgs, ColumnExpr lambdaExpr) {
        super(ExprType.LAMBDA);
        this.lambdaArgs = lambdaArgs;
        this.lambdaExpr = lambdaExpr;
    }

    public List<Identifier> getLambdaArgs() {
        return lambdaArgs;
    }

    public ColumnExpr getLambdaExpr() {
        return lambdaExpr;
    }
}
