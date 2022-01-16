package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.INode;
import com.clickhouse.parser.ast.StringLiteral;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class TTLExpr extends INode {

    private ColumnExpr expr;

    private StringLiteral literal;

    private TTLType ttlType;

    public enum TTLType {
        DELETE,
        TO_DISK,
        TO_VOLUME
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitTTLExpr(this);
    }
}
