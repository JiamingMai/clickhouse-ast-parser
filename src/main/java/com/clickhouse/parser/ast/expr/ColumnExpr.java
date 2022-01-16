package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class ColumnExpr extends INode {

    private ExprType exprType;

    private boolean expectSingleColumn;

    public enum ExprType {
        ALIAS,
        ASTERISK,
        FUNCTION,
        IDENTIFIER,
        LAMBDA,
        LITERAL,
        SUBQUERY,
    }

    protected ColumnExpr(ExprType exprType) {
        this.exprType = exprType;
    }

    public static AliasColumnExpr createAlias(ColumnExpr expr, Identifier alias) {
        return new AliasColumnExpr(expr, alias);
    }

    public static AsteriskColumnExpr createAsterisk(TableIdentifier tableIdentifier, boolean singleColumn) {
        AsteriskColumnExpr asteriskColumnExpr = new AsteriskColumnExpr(tableIdentifier);
        asteriskColumnExpr.setExpectSingleColumn(singleColumn);
        return asteriskColumnExpr;
    }

    public static FunctionColumnExpr createFunction(Identifier name, List<ColumnExpr> params, List<ColumnExpr> args) {
        // FIXME: make sure that all function names are camel-case.

        // Flatten some consequent binary operators to a single multi-operator, because they are left-associative.
        // for example, this changes "AND(AND(a1, a2), b)" to "AND(a1, a2, b)"
        // here name is "AND", left is "AND(a1, a2)", right is "b"
        if ((name.getName().equals("or") || name.getName().equals("and")) && null != args && args.size() == 2) {
            ColumnExpr left = args.get(0);
            ColumnExpr right = args.get(1);
            if (null != left && left.getExprType() == ExprType.FUNCTION) {
                FunctionColumnExpr leftFuncExpr = (FunctionColumnExpr) left;
                if (leftFuncExpr.getName().equals(name.getName())) {
                    List<ColumnExpr> newArgs = new ArrayList<>();
                    newArgs.addAll(leftFuncExpr.getArgs());
                    newArgs.add(right);
                    args = newArgs;
                }
            } else if (null != right && right.getExprType() == ExprType.FUNCTION) {
                FunctionColumnExpr rightFuncExpr = (FunctionColumnExpr) right;
                if (rightFuncExpr.getName().equals(name.getName())) {

                }
                List<ColumnExpr> newArgs = new ArrayList<>();
                newArgs.add(left);
                newArgs.addAll(rightFuncExpr.getArgs());
                args = newArgs;
            }
        }
        return new FunctionColumnExpr(name, params, args);
    }

    public static IdentifierColumnExpr createIdentifier(ColumnIdentifier columnIdentifier) {
        return new IdentifierColumnExpr(columnIdentifier);
    }

    public static LambdaColumnExpr createLambda(List<Identifier> params, ColumnExpr expr) {
        return new LambdaColumnExpr(params, expr);
    }

    public static LiteralColumnExpr createLiteral(Literal literal) {
        return new LiteralColumnExpr(literal);
    }

    public static SubqueryColumnExpr createSubquery(SelectUnionQuery query, boolean scalar) {
        if (scalar) {
            query.shouldBeScalar();
        }
        return new SubqueryColumnExpr(query);
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitColumnExpr(this);
    }
}
