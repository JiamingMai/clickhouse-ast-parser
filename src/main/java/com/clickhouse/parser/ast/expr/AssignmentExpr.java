package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.INode;
import com.clickhouse.parser.ast.Identifier;
import com.clickhouse.parser.AstVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AssignmentExpr extends INode {

    private Identifier identifier;

    private ColumnExpr expr;

    public AssignmentExpr(Identifier identifier, ColumnExpr expr) {
        this.identifier = identifier;
        this.expr = expr;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitAssignmentExpr(this);
    }
}
