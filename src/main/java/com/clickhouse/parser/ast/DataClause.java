package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DataClause extends INode {

    enum ClauseType {
        FORMAT,
        SELECT,
        VALUES,
    }

    enum ChildIndex {
        FORMAT,    // Identifier
        SUBQUERY,  // SelectUnionQuery
    };

    private ClauseType clauseType;

    private Integer offset = 0;

    private Identifier identifier;

    private SelectUnionQuery selectUnionQuery;

    public DataClause(ClauseType type) {
        this.clauseType = type;
    }

    public DataClause(ClauseType type, Identifier identifier) {
        this.clauseType = type;
        this.identifier = identifier;
    }

    public DataClause(ClauseType type, SelectUnionQuery selectUnionQuery) {
        this.clauseType = type;
        this.selectUnionQuery = selectUnionQuery;
    }

    public static DataClause createFormat(Identifier identifier, Integer dataOffset) {
        DataClause dataClause = new DataClause(ClauseType.FORMAT, identifier);
        dataClause.setOffset(dataOffset);
        return dataClause;
    }

    public static DataClause createSelect(SelectUnionQuery query) {
        return new DataClause(ClauseType.SELECT, query);
    }

    public static DataClause createValues(Integer dataOffset) {
        DataClause dataClause = new DataClause(ClauseType.VALUES);
        dataClause.setOffset(dataOffset);
        return dataClause;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitDataClause(this);
    }
}
