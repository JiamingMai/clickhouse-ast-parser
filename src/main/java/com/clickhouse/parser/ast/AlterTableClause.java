package com.clickhouse.parser.ast;

import com.clickhouse.parser.ast.expr.*;
import com.clickhouse.parser.AstVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class AlterTableClause extends INode {

    public static AlterTableClause createAddColumn(boolean ifNotExists, TableElementExpr element, Identifier after) {
        if (element.getExprType() != TableElementExpr.ExprType.COLUMN) {
            // it is an exception when this happen
            return null;
        }
        return new AddColumnAlterTableClause(ifNotExists, element, after);
    }

    public static AlterTableClause createAddIndex(boolean ifNotExists, TableElementExpr element, Identifier after) {
        if (element.getExprType() != TableElementExpr.ExprType.INDEX) {
            // it is an exception when this happen
            return null;
        }
        return new AddIndexAlterTableClause(ifNotExists, element, after);
    }

    public static AlterTableClause createAttach(PartitionClause clause, TableIdentifier from) {
        return new AttachAlterTableClause(clause, from);
    }

    public static AlterTableClause createClear(boolean ifExists, Identifier identifier, PartitionClause in) {
        return new ClearAlterTableClause(ifExists, identifier, in);
    }

    public static AlterTableClause createCodec(boolean ifExists, Identifier identifier, CodecExpr codec) {
        return new CodecAlterTableClause(ifExists, identifier, codec);
    }

    public static AlterTableClause createComment(boolean ifExists, Identifier identifier, StringLiteral comment) {
        return new CommentAlterTableClause(ifExists, identifier, comment);
    }

    public static AlterTableClause createDelete(ColumnExpr expr) {
        return new DeleteAlterTableClause(expr);
    }

    public static AlterTableClause createDetach(PartitionClause clause) {
        return new DetachAlterTableClause(clause);
    }

    public static AlterTableClause createDropColumn(boolean ifExists, Identifier identifier) {
        return new DropColumnAlterTableClause(ifExists, identifier);
    }

    public static AlterTableClause createDropIndex(boolean ifExists, Identifier identifier) {
        return new DropIndexAlterTableClause(ifExists, identifier);
    }

    public static AlterTableClause createDropPartition(PartitionClause clause) {
        return new DropPartitionAlterTableClause(clause);
    }

    public static AlterTableClause createFreezePartition(PartitionClause clause) {
        return new FreezePartitionAlterTableClause(clause);
    }

    public static AlterTableClause createModify(boolean ifExists, TableElementExpr element) {
        return new ModifyAlterTableClause(ifExists, element);
    }

    public static AlterTableClause createMovePartitionToDisk(PartitionClause clause, StringLiteral literal) {
        return new MovePartitionToDiskAlterTableClause(clause, literal);
    }

    public static AlterTableClause createMovePartitionToTable(PartitionClause clause, TableIdentifier identifier) {
        return new MovePartitionToTableAlterTableClause(clause, identifier);
    }

    public static AlterTableClause createMovePartitionToVolume(PartitionClause clause, StringLiteral literal) {
        return new MovePartitionToVolumeAlterTableClause(clause, literal);
    }

    public static AlterTableClause createRemove(boolean ifExists, Identifier identifier, TableColumnPropertyType type) {
        return new RemoveAlterTableClause(ifExists, identifier, type);
    }

    public static AlterTableClause createRemoveTTL() {
        return new RemoveTTLAlterTableClause();
    }

    public static AlterTableClause createRename(boolean ifExists, Identifier identifier, Identifier to) {
        return new RenameAlterTableClause(ifExists, identifier, to);
    }

    public static AlterTableClause createOrderBy(ColumnExpr expr) {
        return new OrderByAlterTableClause(expr);
    }

    public static AlterTableClause createReplace(PartitionClause clause, TableIdentifier from) {
        return new ReplaceAlterTableClause(clause, from);
    }

    public static AlterTableClause createTTL(TTLClause clause) {
        return new TTLAlterTableClause(clause);
    }

    public static AlterTableClause createUpdate(List<AssignmentExpr> list, WhereClause where) {
        return new UpdateAlterTableClause(list, where);
    }

    public enum ClauseType
    {
        ADD_COLUMN,
        ADD_INDEX,
        ATTACH,
        CLEAR,
        CODEC,
        COMMENT,
        DELETE,
        DETACH,
        DROP_COLUMN,
        DROP_INDEX,
        DROP_PARTITION,
        FREEZE_PARTITION,
        MODIFY,
        MOVE_PARTITION_TO_DISK,
        MOVE_PARTITION_TO_TABLE,
        MOVE_PARTITION_TO_VOLUME,
        ORDER_BY,
        REMOVE,
        REMOVE_TTL,
        RENAME,
        REPLACE,
        TTL,
        UPDATE
    }

    protected ClauseType clauseType;

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitAlterTableClause(this);
    }

}
