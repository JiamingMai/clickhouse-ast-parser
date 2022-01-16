package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class MovePartitionToTableAlterTableClause extends AlterTableClause {

    private PartitionClause clause;

    private TableIdentifier identifier;

    public MovePartitionToTableAlterTableClause(PartitionClause clause, TableIdentifier identifier) {
        this.clauseType = ClauseType.MOVE_PARTITION_TO_TABLE;
        this.clause = clause;
        this.identifier = identifier;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitMovePartitionToTableAlterTableClause(this);
    }
}
