package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import lombok.Data;

@Data
public class INode {

    public INode() {
    }

    public <T> T accept(AstVisitor<T> astVisitor) {
        // override this method in subclass
        return null;
    }

}
