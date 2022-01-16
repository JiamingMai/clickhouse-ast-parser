package com.clickhouse.parser.ast.expr;

import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.INode;
import com.clickhouse.parser.ast.JoinConstraintClause;
import com.clickhouse.parser.ast.SampleClause;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class JoinExpr extends INode {

    private ExprType exprType;
    private JoinOpType opType = JoinOpType.INNER;
    private JoinOpMode opMode = JoinOpMode.DEFAULT;
    private boolean finalExpr;

    private TableExpr tableExpr;
    private SampleClause sampleClause;
    private JoinExpr leftExpr;
    private JoinExpr rightExpr;
    private JoinConstraintClause joinConstraintClause;

    public enum ExprType
    {
        TABLE,
        JOIN_OP,
    }

    public enum JoinOpType
    {
        INNER,
        INNER_ALL,
        INNER_ANY,
        INNER_ASOF,
        LEFT,
        LEFT_SEMI,
        LEFT_ALL,
        LEFT_ANTI,
        LEFT_ANY,
        LEFT_ASOF,
        RIGHT,
        RIGHT_SEMI,
        RIGHT_ALL,
        RIGHT_ANTI,
        RIGHT_ANY,
        RIGHT_ASOF,
        FULL,
        FULL_ALL,
        FULL_ANY,
        CROSS,
    }

    public enum JoinOpMode
    {
        DEFAULT,  // actual mode depends on setting's 'distributed_product_mode' value
        GLOBAL,
        LOCAL,
    }

    public JoinExpr(ExprType exprType, TableExpr tableExpr, SampleClause sampleClause, boolean finalExpr) {
        this.exprType = exprType;
        this.tableExpr = tableExpr;
        this.sampleClause = sampleClause;
        this.finalExpr = finalExpr;
    }

    public JoinExpr(
            ExprType exprType,
            JoinOpType opType,
            JoinOpMode opMode,
            JoinExpr leftExpr,
            JoinExpr rightExpr,
            JoinConstraintClause joinConstraintClause) {
        this.exprType = exprType;
        this.opType = opType;
        this.opMode = opMode;
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
        this.joinConstraintClause = joinConstraintClause;
    }

    public static JoinExpr createTableExpr(TableExpr tableExpr, SampleClause sampleClause, boolean finalExpr) {
        return new JoinExpr(ExprType.TABLE, tableExpr, sampleClause, finalExpr);
    }

    public static JoinExpr createJoinOp(JoinOpType op, JoinExpr leftExpr, JoinExpr rightExpr, JoinOpMode mode, JoinConstraintClause clause) {
        return new JoinExpr(ExprType.JOIN_OP, op, mode, leftExpr, rightExpr, clause);
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitJoinExpr(this);
    }
}
