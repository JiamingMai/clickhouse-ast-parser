package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class AlterTableQuery extends Query {

    private StringLiteral cluster;

    private TableIdentifier identifier;

    private List<AlterTableClause> clauses;

    public AlterTableQuery(StringLiteral cluster, TableIdentifier identifier, List<AlterTableClause> clauses) {
        this.cluster = cluster;
        this.identifier = identifier;
        this.clauses = clauses;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitAlterTableQuery(this);
    }
}
