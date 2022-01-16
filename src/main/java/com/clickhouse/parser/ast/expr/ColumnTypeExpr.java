package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.EnumValue;
import com.clickhouse.parser.ast.INode;
import com.clickhouse.parser.ast.Identifier;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class ColumnTypeExpr extends INode {

    private ExprType exprType;

    private Identifier name;

    public enum ExprType
    {
        SIMPLE,
        NAMED,
        COMPLEX,
        ENUM,
        PARAM,
        NESTED,
    }

    public ColumnTypeExpr(ExprType exprType) {
        this.exprType = exprType;
    }

    public ColumnTypeExpr(ExprType exprType, Identifier name) {
        this.exprType = exprType;
        this.name = name;
    }

    public static SimpleColumnTypeExpr createSimple(Identifier identifier) {
        SimpleColumnTypeExpr simpleColumnTypeExpr = new SimpleColumnTypeExpr(identifier);
        return simpleColumnTypeExpr;
    }

    public static NamedColumnTypeExpr createNamed(Identifier identifier, ColumnTypeExpr type) {
        NamedColumnTypeExpr namedColumnTypeExpr = new NamedColumnTypeExpr(identifier, type);
        return namedColumnTypeExpr;
    }

    public static ComplexColumnTypeExpr createComplex(Identifier identifier, List<ColumnTypeExpr> list) {
        ComplexColumnTypeExpr complexColumnTypeExpr = new ComplexColumnTypeExpr(identifier, list);
        return complexColumnTypeExpr;
    }

    public static EnumColumnTypeExpr createEnum(Identifier identifier, List<EnumValue> list) {
        EnumColumnTypeExpr enumColumnTypeExpr = new EnumColumnTypeExpr(identifier, list);
        return enumColumnTypeExpr;
    }

    public static ParamColumnTypeExpr createParam(Identifier identifier, List<ColumnExpr> list) {
        ParamColumnTypeExpr paramColumnTypeExpr = new ParamColumnTypeExpr(identifier, list);
        return paramColumnTypeExpr;
    }

    public static NestedColumnTypeExpr createNested(Identifier identifier, List<ColumnTypeExpr> list) {
        // TODO: assert that |list| must contain only expressions of NAMED type
        NestedColumnTypeExpr nestedColumnTypeExpr = new NestedColumnTypeExpr(identifier, list);
        return nestedColumnTypeExpr;
    }

    public ExprType getExprType() {
        return exprType;
    }

    public Identifier getName() {
        return name;
    }

    @Override
    public String toString() {
        switch (exprType) {
            case SIMPLE:
                return name.getName();
            case NAMED:
                if (this instanceof NamedColumnTypeExpr) {
                    NamedColumnTypeExpr namedColumnTypeExpr = (NamedColumnTypeExpr) this;
                    String type = namedColumnTypeExpr.getType().toString();
                    return name.getName() + " " + type;
                }
                return name.getName();
            case COMPLEX:
                if (this instanceof ComplexColumnTypeExpr) {
                    ComplexColumnTypeExpr complexColumnTypeExpr = (ComplexColumnTypeExpr) this;
                    if (null != complexColumnTypeExpr.getList()) {
                        String listStr = complexColumnTypeExpr.getList().toString();
                        return name.getName() + "(" + listStr + ")";
                    }
                }
                return name.getName();
            case ENUM:
                if (this instanceof EnumColumnTypeExpr) {
                    EnumColumnTypeExpr enumColumnTypeExpr = (EnumColumnTypeExpr) this;
                    if (null != enumColumnTypeExpr.getEnumValues()) {
                        String listStr = enumColumnTypeExpr.getEnumValues().toString();
                        return name.getName() + "(" + listStr + ")";
                    }
                }
                return name.getName();
            case PARAM:
                if (this instanceof ParamColumnTypeExpr) {
                    ParamColumnTypeExpr paramColumnTypeExpr = (ParamColumnTypeExpr) this;
                    if (null != paramColumnTypeExpr.getParams()) {
                        String listStr = paramColumnTypeExpr.getParams().toString();
                        return name.getName() + "(" + listStr + ")";
                    }
                }
                return name.getName();
            case NESTED:
                if (this instanceof NestedColumnTypeExpr) {
                    NestedColumnTypeExpr nestedColumnTypeExpr = (NestedColumnTypeExpr) this;
                    if (null != nestedColumnTypeExpr.getList()) {
                        String listStr = nestedColumnTypeExpr.getList().toString();
                        return name.getName() + "(" + listStr + ")";
                    }
                }
                return name.getName();
        }
        // this can't happen
        return "";
    }
}
