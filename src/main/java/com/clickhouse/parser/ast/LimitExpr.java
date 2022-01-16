package com.clickhouse.parser.ast;

import com.clickhouse.parser.ast.expr.ColumnExpr;
import lombok.Data;

@Data
public class LimitExpr extends INode  {

    private ColumnExpr limit;

    private ColumnExpr offset;

    public LimitExpr(ColumnExpr limit) {
        this.limit = limit;
    }

    public LimitExpr(ColumnExpr limit, ColumnExpr offset) {
        this.limit = limit;
        this.offset = offset;
    }

}
