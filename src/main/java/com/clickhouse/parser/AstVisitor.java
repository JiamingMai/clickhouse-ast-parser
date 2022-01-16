package com.clickhouse.parser;

import com.clickhouse.parser.ast.*;
import com.clickhouse.parser.ast.expr.*;

import java.util.List;

public class AstVisitor<T> {

    public T visit(INode astNode) {
        return astNode.accept(this);
    }

    public T visitAlterTableQuery(AlterTableQuery alterTableQuery) {
        if (null != alterTableQuery.getIdentifier()) {
            visit(alterTableQuery.getIdentifier());
        }
        if (null != alterTableQuery.getClauses()) {
            for (AlterTableClause alterTableClause : alterTableQuery.getClauses()) {
                visit(alterTableClause);
            }
        }
        return null;
    }

    public T visitTableElementExpr(TableElementExpr tableElementExpr) {
        if (null != tableElementExpr.getCodec()) {
            visit(tableElementExpr.getCodec());
        }
        if (null != tableElementExpr.getTtl()) {
            visit(tableElementExpr.getTtl());
        }
        return null;
    }

    public T visitCodecExpr(CodecExpr codecExpr) {
        if (null != codecExpr.getCodeArgExprList()) {
            for (CodecArgExpr codecArgExpr : codecExpr.getCodeArgExprList()) {
                visit(codecArgExpr);
            }
        }
        return null;
    }

    public T visitCodecArgExpr(CodecArgExpr codecArgExpr) {
        if (null != codecArgExpr.getIdentifier()) {
            visit(codecArgExpr.getIdentifier());
        }
        if (null != codecArgExpr.getList()) {
            for (ColumnExpr columnExpr : codecArgExpr.getList()) {
                visit(columnExpr);
            }
        }
        return null;
    }

    public T visitAddColumnAlterTableClause(AddColumnAlterTableClause addColumnAlterTableClause) {
        if (null != addColumnAlterTableClause.getAfter()) {
            visit(addColumnAlterTableClause.getAfter());
        }
        if (null != addColumnAlterTableClause.getElement()) {
            visit(addColumnAlterTableClause.getElement());
        }
        return null;
    }

    public T visitAddIndexAlterTableClause(AddIndexAlterTableClause addIndexAlterTableClause) {
        if (null != addIndexAlterTableClause.getAfter()) {
            visit(addIndexAlterTableClause.getAfter());
        }
        if (null != addIndexAlterTableClause.getElement()) {
            visit(addIndexAlterTableClause.getElement());
        }
        return null;
    }

    public T visitAttachAlterTableClause(AttachAlterTableClause attachAlterTableClause) {
        if (null != attachAlterTableClause.getFrom()) {
            visit(attachAlterTableClause.getFrom());
        }
        if (null != attachAlterTableClause.getPartitionClause()) {
            visit(attachAlterTableClause.getPartitionClause());
        }
        return null;
    }

    public T visitPartitionClause(PartitionClause partitionClause) {
        if (null != partitionClause.getId()) {
            visit(partitionClause.getId());
        }
        if (null != partitionClause.getList()) {
            for (Literal literal : partitionClause.getList()) {
                visit(literal);
            }
        }
        return null;
    }

    public T visitClearAlterTableClause(ClearAlterTableClause clearAlterTableClause) {
        if (null != clearAlterTableClause.getIdentifier()) {
            visit(clearAlterTableClause.getIdentifier());
        }
        if (null != clearAlterTableClause.getIn()) {
            visit(clearAlterTableClause.getIn());
        }
        return null;
    }

    public T visitCodecAlterTableClause(CodecAlterTableClause codecAlterTableClause) {
        if (null != codecAlterTableClause.getIdentifier()) {
            visit(codecAlterTableClause.getIdentifier());
        }
        if (null != codecAlterTableClause.getCodec()) {
            visit(codecAlterTableClause.getCodec());
        }
        return null;
    }

    public T visitCommentAlterTableClause(CommentAlterTableClause commentAlterTableClause) {
        if (null != commentAlterTableClause.getComment()) {
            visit(commentAlterTableClause.getComment());
        }
        if (null != commentAlterTableClause.getIdentifier()) {
            visit(commentAlterTableClause.getIdentifier());
        }
        return null;
    }

    public T visitDeleteAlterTableClause(DeleteAlterTableClause deleteAlterTableClause) {
        if (null != deleteAlterTableClause.getExpr()) {
            visit(deleteAlterTableClause.getExpr());
        }
        return null;
    }

    public T visitDetachAlterTableClause(DetachAlterTableClause detachAlterTableClause) {
        if (null != detachAlterTableClause.getClause()) {
            visit(detachAlterTableClause.getClause());
        }
        return null;
    }

    public T visitDropColumnAlterTableClause(DropColumnAlterTableClause dropColumnAlterTableClause) {
        if (null != dropColumnAlterTableClause.getIdentifier()) {
            visit(dropColumnAlterTableClause.getIdentifier());
        }
        return null;
    }

    public T visitDropIndexAlterTableClause(DropIndexAlterTableClause dropIndexAlterTableClause) {
        if (null != dropIndexAlterTableClause.getIdentifier()) {
            visit(dropIndexAlterTableClause.getIdentifier());
        }
        return null;
    }

    public T visitDropPartitionAlterTableClause(DropPartitionAlterTableClause dropPartitionAlterTableClause) {
        if (null != dropPartitionAlterTableClause.getClause()) {
            visit(dropPartitionAlterTableClause.getClause());
        }
        return null;
    }

    public T visitFreezePartitionAlterTableClause(FreezePartitionAlterTableClause freezePartitionAlterTableClause) {
        if (null != freezePartitionAlterTableClause.getClause()) {
            visit(freezePartitionAlterTableClause.getClause());
        }
        return null;
    }

    public T visitModifyAlterTableClause(ModifyAlterTableClause modifyAlterTableClause) {
        if (null != modifyAlterTableClause.getElement()) {
            visit(modifyAlterTableClause.getElement());
        }
        return null;
    }

    public T visitMovePartitionToDiskAlterTableClause(MovePartitionToDiskAlterTableClause movePartitionToDiskAlterTableClause) {
        if (null != movePartitionToDiskAlterTableClause.getLiteral()) {
            visit(movePartitionToDiskAlterTableClause.getLiteral());
        }
        if (null != movePartitionToDiskAlterTableClause.getClause()) {
            visit(movePartitionToDiskAlterTableClause.getClause());
        }
        return null;
    }

    public T visitMovePartitionToTableAlterTableClause(MovePartitionToTableAlterTableClause movePartitionToTableAlterTableClause) {
        if (null != movePartitionToTableAlterTableClause.getIdentifier()) {
            visit(movePartitionToTableAlterTableClause.getIdentifier());
        }
        if (null != movePartitionToTableAlterTableClause.getClause()) {
            visit(movePartitionToTableAlterTableClause.getClause());
        }
        return null;
    }

    public T visitMovePartitionToVolumeAlterTableClause(MovePartitionToVolumeAlterTableClause movePartitionToVolumeAlterTableClause) {
        if (null != movePartitionToVolumeAlterTableClause.getLiteral()) {
            visit(movePartitionToVolumeAlterTableClause.getLiteral());
        }
        if (null != movePartitionToVolumeAlterTableClause.getClause()) {
            visit(movePartitionToVolumeAlterTableClause.getClause());
        }
        return null;
    }

    public T visitOrderByAlterTableClause(OrderByAlterTableClause orderByAlterTableClause) {
        if (null != orderByAlterTableClause.getExpr()) {
            visit(orderByAlterTableClause.getExpr());
        }
        return null;
    }

    public T visitRemoveAlterTableClause(RemoveAlterTableClause removeAlterTableClause) {
        if (null != removeAlterTableClause.getIdentifier()) {
            visit(removeAlterTableClause.getIdentifier());
        }
        return null;
    }

    public T visitRemoveTTLAlterTableClause(RemoveTTLAlterTableClause removeTTLAlterTableClause) {
        return null;
    }

    public T visitRenameAlterTableClause(RenameAlterTableClause renameAlterTableClause) {
        if (null != renameAlterTableClause.getIdentifier()) {
            visit(renameAlterTableClause.getIdentifier());
        }
        if (null != renameAlterTableClause.getTo()) {
            visit(renameAlterTableClause.getTo());
        }
        return null;
    }

    public T visitReplaceAlterTableClause(ReplaceAlterTableClause replaceAlterTableClause) {
        if (null != replaceAlterTableClause.getFrom()) {
            visit(replaceAlterTableClause.getFrom());
        }
        if (null != replaceAlterTableClause.getClause()) {
            visit(replaceAlterTableClause.getClause());
        }
        return null;
    }

    public T visitTTLAlterTableClause(TTLAlterTableClause ttlAlterTableClause) {
        if (null != ttlAlterTableClause.getClause()) {
            visit(ttlAlterTableClause.getClause());
        }
        return null;
    }

    public T visitTTLClause(TTLClause ttlClause) {
        if (null != ttlClause.getTtlExprList()) {
            for (TTLExpr ttlExpr : ttlClause.getTtlExprList()) {
                visit(ttlExpr);
            }
        }
        return null;
    }

    public T visitTTLExpr(TTLExpr ttlExpr) {
        if (null != ttlExpr.getLiteral()) {
            visit(ttlExpr.getLiteral());
        }
        if (null != ttlExpr.getExpr()) {
            visit(ttlExpr.getExpr());
        }
        return null;
    }

    public T visitUpdateAlterTableClause(UpdateAlterTableClause updateAlterTableClause) {
        if (null != updateAlterTableClause.getWhere()) {
            visit(updateAlterTableClause.getWhere());
        }
        if (null != updateAlterTableClause.getList()) {
            for (AssignmentExpr assignmentExpr : updateAlterTableClause.getList()) {
                visit(assignmentExpr);
            }
        }
        return null;
    }

    public T visitAssignmentExpr(AssignmentExpr assignmentExpr) {
        if (null != assignmentExpr.getExpr()) {
            visit(assignmentExpr.getExpr());
        }
        if (null != assignmentExpr.getIdentifier()) {
            visit(assignmentExpr.getIdentifier());
        }
        return null;
    }

    public T visitAlterTableClause(AlterTableClause alterTableClause) {
        switch (alterTableClause.getClauseType()) {
            case ADD_COLUMN:
                visitAddColumnAlterTableClause((AddColumnAlterTableClause) alterTableClause);
                break;
            case ADD_INDEX:
                visitAddIndexAlterTableClause((AddIndexAlterTableClause) alterTableClause);
                break;
            case ATTACH:
                visitAttachAlterTableClause((AttachAlterTableClause) alterTableClause);
                break;
            case CLEAR:
                visitClearAlterTableClause((ClearAlterTableClause) alterTableClause);
                break;
            case CODEC:
                visitCodecAlterTableClause((CodecAlterTableClause) alterTableClause);
                break;
            case COMMENT:
                visitCommentAlterTableClause((CommentAlterTableClause) alterTableClause);
                break;
            case DELETE:
                visitDeleteAlterTableClause((DeleteAlterTableClause) alterTableClause);
                break;
            case DETACH:
                visitDetachAlterTableClause((DetachAlterTableClause) alterTableClause);
                break;
            case DROP_COLUMN:
                visitDropColumnAlterTableClause((DropColumnAlterTableClause) alterTableClause);
                break;
            case DROP_INDEX:
                visitDropIndexAlterTableClause((DropIndexAlterTableClause) alterTableClause);
                break;
            case DROP_PARTITION:
                visitDropPartitionAlterTableClause((DropPartitionAlterTableClause) alterTableClause);
                break;
            case FREEZE_PARTITION:
                visitFreezePartitionAlterTableClause((FreezePartitionAlterTableClause) alterTableClause);
                break;
            case MODIFY:
                visitModifyAlterTableClause((ModifyAlterTableClause) alterTableClause);
                break;
            case MOVE_PARTITION_TO_DISK:
                visitMovePartitionToDiskAlterTableClause((MovePartitionToDiskAlterTableClause) alterTableClause);
                break;
            case MOVE_PARTITION_TO_TABLE:
                visitMovePartitionToTableAlterTableClause((MovePartitionToTableAlterTableClause) alterTableClause);
                break;
            case MOVE_PARTITION_TO_VOLUME:
                visitMovePartitionToVolumeAlterTableClause((MovePartitionToVolumeAlterTableClause) alterTableClause);
                break;
            case ORDER_BY:
                visitOrderByAlterTableClause((OrderByAlterTableClause) alterTableClause);
                break;
            case REMOVE:
                visitRemoveAlterTableClause((RemoveAlterTableClause) alterTableClause);
                break;
            case REMOVE_TTL:
                visitRemoveTTLAlterTableClause((RemoveTTLAlterTableClause) alterTableClause);
                break;
            case RENAME:
                visitRenameAlterTableClause((RenameAlterTableClause) alterTableClause);
                break;
            case REPLACE:
                visitReplaceAlterTableClause((ReplaceAlterTableClause) alterTableClause);
                break;
            case TTL:
                visitTTLAlterTableClause((TTLAlterTableClause) alterTableClause);
                break;
            case UPDATE:
                visitUpdateAlterTableClause((UpdateAlterTableClause) alterTableClause);
                break;
            default:
                // this cannot happen anyway
        }
        return null;
    }

    public T visitInsertQuery(InsertQuery insertQuery) {
        if (null != insertQuery.getTableIdentifier()) {
            visitTableIdentifier(insertQuery.getTableIdentifier());
        }
        if (null != insertQuery.getTableFunctionExpr()) {
            visitTableFunctionExpr(insertQuery.getTableFunctionExpr());
        }
        if (null != insertQuery.getDataClause()) {
            visitDataClause(insertQuery.getDataClause());
        }
        if (null != insertQuery.getColumns()) {
            for (Identifier column : insertQuery.getColumns()) {
                visitIdentifier(column);
            }
        }
        return null;
    }

    public T visitDataClause(DataClause dataClause) {
        if (null != dataClause.getIdentifier()) {
            visit(dataClause.getIdentifier());
        }
        if (null != dataClause.getSelectUnionQuery()) {
            visit(dataClause.getSelectUnionQuery());
        }
        return null;
    }

    public T visitSelectUnionQuery(SelectUnionQuery selectUnionQuery) {
        for (SelectStatement selectStatement : selectUnionQuery.getStatements()) {
            visitSelectStatement(selectStatement);
        }
        return null;
    }

    public T visitSelectStatement(SelectStatement selectStatement) {
        if (null != selectStatement.getWithClause()) {
            visitWithClause(selectStatement.getWithClause());
        }
        if (null != selectStatement.getExprs()) {
            visitColumnExprList(selectStatement.getExprs());
        }
        if (null != selectStatement.getFromClause()) {
            visitFromClause(selectStatement.getFromClause());
        }
        if (null != selectStatement.getArrayJoinClause()) {
            visitArrayJoinClause(selectStatement.getArrayJoinClause());
        }
        if (null != selectStatement.getPrewhereClause()) {
            visitPrewhereClause(selectStatement.getPrewhereClause());
        }
        if (null != selectStatement.getWhereClause()) {
            visitWhereClause(selectStatement.getWhereClause());
        }
        if (null != selectStatement.getGroupByClause()) {
            visitGroupByClause(selectStatement.getGroupByClause());
        }
        if (null != selectStatement.getHavingClause()) {
            visitHavingClause(selectStatement.getHavingClause());
        }
        if (null != selectStatement.getOrderByClause()) {
            visitOrderByClause(selectStatement.getOrderByClause());
        }
        if (null != selectStatement.getLimitByClause()) {
            visitLimitByClause(selectStatement.getLimitByClause());
        }
        if (null != selectStatement.getLimitClause()) {
            visitLimitClause(selectStatement.getLimitClause());
        }
        if (null != selectStatement.getSettingsClause()) {
            visitSettingsClause(selectStatement.getSettingsClause());
        }
        return null;
    }

    public T visitWithClause(WithClause withClause) {
        visitColumnExprList(withClause.getWithExpr());
        return null;
    }

    public T visitFromClause(FromClause fromClause) {
        if (null != fromClause.getExpr()) {
            visitJoinExpr(fromClause.getExpr());
        }
        return null;
    }

    public T visitJoinExpr(JoinExpr joinExpr) {
        if (null != joinExpr.getTableExpr()) {
            visitTableExpr(joinExpr.getTableExpr());
        }
        if (null != joinExpr.getSampleClause()) {
            visitSampleClause(joinExpr.getSampleClause());
        }
        if (null != joinExpr.getLeftExpr()) {
            visitJoinExpr(joinExpr.getLeftExpr());
        }
        if (null != joinExpr.getRightExpr()) {
            visitJoinExpr(joinExpr.getRightExpr());
        }
        if (null != joinExpr.getJoinConstraintClause()) {
            visitJoinConstraintClause(joinExpr.getJoinConstraintClause());
        }
        return null;
    }

    public T visitTableExpr(TableExpr tableExpr) {
        if (null != tableExpr.getExpr()) {
            visitTableExpr(tableExpr.getExpr());
        }
        if (null != tableExpr.getAlias()) {
            visitIdentifier(tableExpr.getAlias());
        }
        if (null != tableExpr.getFunction()) {
            visitTableFunctionExpr(tableExpr.getFunction());
        }
        if (null != tableExpr.getIdentifier()) {
            visitTableIdentifier(tableExpr.getIdentifier());
        }
        if (null != tableExpr.getSubQuery()) {
            visitSelectUnionQuery(tableExpr.getSubQuery());
        }
        return null;
    }

    public T visitIdentifier(Identifier identifier) {
        return null;
    }

    public T visitTableFunctionExpr(TableFunctionExpr function) {
        if (null != function.getName()) {
            visitIdentifier(function.getName());
        }
        if (null != function.getArgs()) {
            visitTableArgExprList(function.getArgs());
        }
        return null;
    }

    public T visitTableArgExprList(List<TableArgExpr> args) {
        for (TableArgExpr arg : args) {
            visitTableArgExpr(arg);
        }
        return null;
    }

    public T visitTableArgExpr(TableArgExpr arg) {
        if (null != arg.getLiteral()) {
            visitLiteral(arg.getLiteral());
        }
        if (null != arg.getFunctionExpr()) {
            visitTableFunctionExpr(arg.getFunctionExpr());
        }
        if (null != arg.getIdentifier()) {
            visitTableIdentifier(arg.getIdentifier());
        }
        return null;
    }

    public T visitLiteral(Literal literal) {
        if (literal instanceof NumberLiteral) {
            visitNumberLiteral((NumberLiteral) literal);
        }
        if (literal instanceof StringLiteral) {
            visitStringLiteral((StringLiteral) literal);
        }
        return null;
    }

    public T visitTableIdentifier(TableIdentifier tableIdentifier) {
        if (null != tableIdentifier.getDatabase()) {
            visitIdentifier(tableIdentifier.getDatabase());
        }
        return null;
    }

    public T visitSampleClause(SampleClause sampleClause) {
        if (null != sampleClause.getRatio()) {
            visitRatioExpr(sampleClause.getRatio());
        }
        if (null != sampleClause.getOffset()) {
            visitRatioExpr(sampleClause.getOffset());
        }
        return null;
    }

    public T visitRatioExpr(RatioExpr ratioExpr) {
        if (null != ratioExpr.getNumerator()) {
            visitNumberLiteral(ratioExpr.getNumerator());
        }
        if (null != ratioExpr.getDenominator()) {
            visitNumberLiteral(ratioExpr.getDenominator());
        }
        return null;
    }

    public T visitNumberLiteral(NumberLiteral numberLiteral) {
        return null;
    }

    public T visitJoinConstraintClause(JoinConstraintClause joinConstraintClause) {
        if (null != joinConstraintClause.getExprs()) {
            visitColumnExprList(joinConstraintClause.getExprs());
        }
        return null;
    }


    public T visitArrayJoinClause(ArrayJoinClause arrayJoinClause) {
        if (null != arrayJoinClause.getExprs()) {
            visitColumnExprList(arrayJoinClause.getExprs());
        }
        return null;
    }

    public T visitPrewhereClause(PrewhereClause prewhereClause) {
        if (null != prewhereClause.getPrewhereExpr()) {
            visitColumnExpr(prewhereClause.getPrewhereExpr());
        }
        return null;
    }

    public T visitWhereClause(WhereClause whereClause) {
        if (null != whereClause.getWhereExpr()) {
            visitColumnExpr(whereClause.getWhereExpr());
        }
        return null;
    }

    public T visitGroupByClause(GroupByClause groupByClause) {
        if (null != groupByClause.getGroupByExprs()) {
            visitColumnExprList(groupByClause.getGroupByExprs());
        }
        return null;
    }

    public T visitHavingClause(HavingClause havingClause) {
        if (null != havingClause.getHavingExpr()) {
            visitColumnExpr(havingClause.getHavingExpr());
        }
        return null;
    }

    public T visitOrderByClause(OrderByClause orderByClause) {
        if (null != orderByClause.getOrderExprs()) {
            for (OrderExpr orderExpr : orderByClause.getOrderExprs()) {
                visitOrderExpr(orderExpr);
            }
        }
        return null;
    }

    public T visitOrderExpr(OrderExpr orderExpr) {
        if (null != orderExpr.getExpr()) {
            visitColumnExpr(orderExpr.getExpr());
        }
        if (null != orderExpr.getCollate()) {
            visitStringLiteral(orderExpr.getCollate());
        }
        return null;
    }

    public T visitStringLiteral(StringLiteral stringLiteral) {
        return null;
    }

    public T visitLimitByClause(LimitByClause limitByClause) {
        if (null != limitByClause.getLimit()) {
            visitLimitExpr(limitByClause.getLimit());
        }
        if (null != limitByClause.getExprs()) {
            visitColumnExprList(limitByClause.getExprs());
        }
        return null;
    }

    public T visitLimitExpr(LimitExpr limitExpr) {
        if (null != limitExpr.getLimit()) {
            visitColumnExpr(limitExpr.getLimit());
        }
        if (null != limitExpr.getOffset()) {
            visitColumnExpr(limitExpr.getOffset());
        }
        return null;
    }

    public T visitLimitClause(LimitClause limitClause) {
        if (null != limitClause.getLimitExpr()) {
            visitLimitExpr(limitClause.getLimitExpr());
        }
        return null;
    }

    public T visitSettingsClause(SettingsClause settingsClause) {
        if (null != settingsClause.getSettingExprs()) {
            for (SettingExpr settingExpr : settingsClause.getSettingExprs()) {
                visitSettingExpr(settingExpr);
            }
        }
        return null;
    }

    public T visitSettingExpr(SettingExpr settingExpr) {
        if (null != settingExpr.getName()) {
            visitIdentifier(settingExpr.getName());
        }
        if (null != settingExpr.getValue()) {
            visitLiteral(settingExpr.getValue());
        }
        return null;
    }

    public T visitSelectColumnExprList(List<ColumnExpr> exprs) {
        for (ColumnExpr expr : exprs) {
            visitColumnExpr(expr);
        }
        return null;
    }

    public T visitColumnExprList(List<ColumnExpr> exprs) {
        for (ColumnExpr expr : exprs) {
            visitColumnExpr(expr);
        }
        return null;
    }

    public T visitAsteriskColumnExpr(AsteriskColumnExpr expr) {
        return null;
    }

    public T visitColumnExpr(ColumnExpr expr) {
        if (expr instanceof AsteriskColumnExpr) {
            return visitAsteriskColumnExpr((AsteriskColumnExpr) expr);
        }
        if (expr instanceof AliasColumnExpr) {
            return visitAliasColumnExpr((AliasColumnExpr) expr);
        }
        if (expr instanceof FunctionColumnExpr) {
            return visitFunctionColumnExpr(expr);
        }
        if (expr instanceof SubqueryColumnExpr) {
            return visitSubqueryColumnExpr(expr);
        }
        if (expr instanceof IdentifierColumnExpr) {
            return visitIdentifierColumnExpr(expr);
        }
        if (expr instanceof LiteralColumnExpr) {
            return visitLiteralColumnExpr(expr);
        }
        return null;
    }

    public T visitLiteralColumnExpr(ColumnExpr expr) {
        if (null != expr && expr instanceof LiteralColumnExpr) {
            LiteralColumnExpr literalColumnExpr = (LiteralColumnExpr) expr;
        }
        return null;
    }

    public T visitIdentifierColumnExpr(ColumnExpr expr) {
        if (null != expr && expr instanceof IdentifierColumnExpr) {
            IdentifierColumnExpr identifierColumnExpr = (IdentifierColumnExpr) expr;
            return visitIdentifier(identifierColumnExpr.getIdentifier());
        }
        return null;
    }

    public T visitAliasColumnExpr(AliasColumnExpr expr) {
        if (null != expr.getExpr()) {
            visitColumnExpr(expr.getExpr());
        }
        if (null != expr.getAlias()) {
            visitIdentifier(expr.getAlias());
        }
        return null;
    }

    public T visitFunctionColumnExpr(ColumnExpr expr) {
        if (null != expr && expr instanceof FunctionColumnExpr) {
            FunctionColumnExpr functionColumnExpr = (FunctionColumnExpr) expr;
            if (null != functionColumnExpr.getName()) {
                visitIdentifier(functionColumnExpr.getName());
            }
            if (null != functionColumnExpr.getParams()) {
                visitColumnExprList(functionColumnExpr.getParams());
            }
            if (null != functionColumnExpr.getArgs()) {
                visitColumnExprList(functionColumnExpr.getArgs());
            }
        }
        return null;
    }

    public T visitSubqueryColumnExpr(ColumnExpr expr) {
        if (null != expr && expr instanceof SubqueryColumnExpr) {
            SubqueryColumnExpr subqueryColumnExpr = (SubqueryColumnExpr) expr;
        }
        return null;
    }

}
