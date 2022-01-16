package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.ast.INode;
import com.clickhouse.parser.AstVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class CodecExpr extends INode {

    private List<CodecArgExpr> codeArgExprList;

    public CodecExpr(List<CodecArgExpr> codeArgExprList) {
        this.codeArgExprList = codeArgExprList;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitCodecExpr(this);
    }
}
