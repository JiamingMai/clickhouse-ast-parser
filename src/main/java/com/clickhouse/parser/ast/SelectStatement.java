package com.clickhouse.parser.ast;

import com.clickhouse.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class SelectStatement extends INode  {

    private ModifierType modifierType;

    private boolean distinct;

    private boolean withTotals;

    private WithClause withClause;

    private FromClause fromClause;

    private ArrayJoinClause arrayJoinClause;

    private PrewhereClause prewhereClause;

    private WhereClause whereClause;

    private GroupByClause groupByClause;

    private HavingClause havingClause;

    private OrderByClause orderByClause;

    private LimitByClause limitByClause;

    private LimitClause limitClause;

    private SettingsClause settingsClause;

    private List<ColumnExpr> exprs;

    public enum ModifierType
    {
        NONE,
        CUBE,
        ROLLUP,
    }

    public SelectStatement(boolean distinct, ModifierType modifierType, boolean withTotals, List<ColumnExpr> exprs) {
        this.distinct = distinct;
        this.modifierType = modifierType;
        this.withTotals = withTotals;
        this.exprs = exprs;
    }

}
