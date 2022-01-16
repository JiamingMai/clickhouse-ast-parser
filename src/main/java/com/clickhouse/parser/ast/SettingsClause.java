package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.expr.SettingExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class SettingsClause extends INode {

    private List<SettingExpr> settingExprs;

    public SettingsClause(List<SettingExpr> settingExprs) {
        this.settingExprs = settingExprs;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitSettingsClause(this);
    }

}
