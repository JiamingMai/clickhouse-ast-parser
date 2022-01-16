package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.expr.ColumnExpr;
import com.clickhouse.parser.ast.expr.EngineExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class EngineClause extends INode {

    private EngineExpr engineExpr;

    private OrderByClause orderByClause;

    private ColumnExpr partitionByClause;

    private ColumnExpr primaryKeyClause;

    private ColumnExpr sampleByClause;

    private TTLClause ttlClause;

    private SettingsClause settingsClause;

    public EngineClause(EngineExpr engineExpr) {
        this.engineExpr = engineExpr;
    }


    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        // TODO:
        return super.accept(astVisitor);
    }
}
