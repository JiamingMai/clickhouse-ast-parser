package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.Identifier;
import com.clickhouse.parser.ast.Literal;
import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.INode;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class SettingExpr extends INode {

    private Identifier name;

    private Literal value;

    public SettingExpr(Identifier name, Literal value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitSettingExpr(this);
    }
}
