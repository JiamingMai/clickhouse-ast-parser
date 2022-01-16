package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.INode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class EngineExpr extends INode {

    private Identifier identifier;

    private List<ColumnExpr> args;

    public EngineExpr(Identifier identifier, List<ColumnExpr> args) {
        this.identifier = identifier;
        this.args = args;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        // TODO:
        return super.accept(astVisitor);
    }
}
