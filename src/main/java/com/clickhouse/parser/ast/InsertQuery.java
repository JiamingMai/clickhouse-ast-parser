package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import com.clickhouse.parser.ast.expr.TableFunctionExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class InsertQuery extends Query {

    enum ChildIndex {
        IDENTIFIER,  // TableIdentifier
        FUNCTION,    // TableFunctionExpr
        COLUMNS,     // ColumnNameList
        DATA,        // DataClause
    }

    enum QueryType {
        FUNCTION,
        TABLE,
    }

    private QueryType queryType;

    private TableIdentifier tableIdentifier;

    private TableFunctionExpr tableFunctionExpr;

    private DataClause dataClause;

    private List<Identifier> columns;

    public InsertQuery(QueryType type, TableIdentifier tableIdentifier, List<Identifier> columns, DataClause dataClause) {
        this.queryType = type;
        this.tableIdentifier = tableIdentifier;
        this.columns = columns;
        this.dataClause = dataClause;
    }

    public InsertQuery(QueryType type, TableFunctionExpr function, List<Identifier> columns, DataClause dataClause) {
        this.queryType = type;
        this.tableFunctionExpr = function;
        this.columns = columns;
        this.dataClause = dataClause;
    }

    public static InsertQuery createTable(TableIdentifier identifier, List<Identifier> columns, DataClause clause) {
        return new InsertQuery(QueryType.TABLE, identifier, columns, clause);
    }

    public static InsertQuery createFunction(TableFunctionExpr function, List<Identifier> columns, DataClause clause) {
        return new InsertQuery(QueryType.FUNCTION, function, columns, clause);
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitInsertQuery(this);
    }
}
