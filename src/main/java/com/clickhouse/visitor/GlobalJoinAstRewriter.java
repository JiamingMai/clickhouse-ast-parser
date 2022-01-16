package com.clickhouse.visitor;

import com.clickhouse.parser.ast.expr.JoinExpr;
import lombok.Data;

@Data
public class GlobalJoinAstRewriter extends ClickHouseSqlBuilder {

    private boolean withoutGlobalKeyword = false;

    @Override
    public String visitJoinOperator(JoinExpr.JoinOpType joinOpType, JoinExpr.JoinOpMode joinOpMode) {
        switch (joinOpType) {
            case LEFT:
                if (!joinOpMode.equals(JoinExpr.JoinOpMode.GLOBAL)) {
                    withoutGlobalKeyword = true;
                }
                return "GLOBAL LEFT JOIN ";
            case RIGHT:
                if (!joinOpMode.equals(JoinExpr.JoinOpMode.GLOBAL)) {
                    withoutGlobalKeyword = true;
                }
                return "GLOBAL RIGHT JOIN ";
            case INNER:
                if (!joinOpMode.equals(JoinExpr.JoinOpMode.GLOBAL)) {
                    withoutGlobalKeyword = true;
                }
                return "GLOBAL INNER JOIN ";
            default:
                return "GLOBAL JOIN ";
        }
    }

}
