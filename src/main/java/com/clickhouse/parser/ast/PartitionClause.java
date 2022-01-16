package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class PartitionClause extends INode {

    public enum ClauseType {
        ID,
        LIST
    }

    private final ClauseType clauseType;

    private Literal id;

    private List<Literal> list;

    public PartitionClause(ClauseType clauseType) {
        this.clauseType = clauseType;
    }

    public PartitionClause(Literal id) {
        this.clauseType = ClauseType.ID;
        this.id = id;
    }

    public PartitionClause(List<Literal> list) {
        this.clauseType = ClauseType.LIST;
        this.list = list;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitPartitionClause(this);
    }
}
