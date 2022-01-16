package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Literal;
import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.INode;
import com.clickhouse.parser.ast.TableIdentifier;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class TableArgExpr extends INode {

    private Literal literal;

    private TableFunctionExpr functionExpr;

    private TableIdentifier identifier;

    public TableArgExpr(Literal literal) {
        this.literal = literal;
    }

    public TableArgExpr(TableFunctionExpr functionExpr) {
        this.functionExpr = functionExpr;
    }

    public TableArgExpr(TableIdentifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitTableArgExpr(this);
    }
}
