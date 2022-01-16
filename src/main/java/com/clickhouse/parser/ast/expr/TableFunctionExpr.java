package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.INode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class TableFunctionExpr extends INode {

    private Identifier name;
    
    private List<TableArgExpr> args;

    public TableFunctionExpr(Identifier name, List<TableArgExpr> args) {
        this.name = name;
        this.args = args;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitTableFunctionExpr(this);
    }
}
