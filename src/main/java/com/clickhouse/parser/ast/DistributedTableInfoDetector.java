package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstParser;
import com.clickhouse.parser.ast.expr.ColumnExpr;
import com.clickhouse.parser.ast.expr.EngineExpr;
import com.clickhouse.parser.ast.expr.LiteralColumnExpr;

import java.util.List;

public class DistributedTableInfoDetector {

    public String searchCluster(String distributedTableCreateSql) {
        AstParser astParser = new AstParser(false);
        Object ast = astParser.parse(distributedTableCreateSql);
        if (ast instanceof INode) {
            return searchCluster((INode) ast);
        }
        return null;
    }

    public String searchCluster(INode ast) {
        if (ast instanceof CreateTableQuery) {
            CreateTableQuery createTableQuery = (CreateTableQuery) ast;
            EngineClause engineClause = createTableQuery.getEngine();
            if (null != engineClause) {
                EngineExpr engineExpr = engineClause.getEngineExpr();
                if (null != engineExpr) {
                    Identifier identifier = engineExpr.getIdentifier();
                    if (null != identifier) {
                        String engineName = identifier.getName();
                        if (null != engineName && engineName.equals("Distributed")) {
                            List<ColumnExpr> args = engineExpr.getArgs();
                            if (null != args && !args.isEmpty()) {
                                ColumnExpr arg = args.get(0);
                                if (arg instanceof LiteralColumnExpr) {
                                    LiteralColumnExpr literalColumnExpr = (LiteralColumnExpr) arg;
                                    String clusterName = literalColumnExpr.getLiteral().asString();
                                    clusterName = eliminateQuotes(clusterName);
                                    return clusterName;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public String searchLocalTableFullName(String distributedTableCreateSql) {
        AstParser astParser = new AstParser(false);
        Object ast = astParser.parse(distributedTableCreateSql);
        if (ast instanceof INode) {
            return searchLocalTableFullName((INode) ast);
        }
        return null;
    }

    public String searchLocalTableFullName(INode ast) {
        if (ast instanceof CreateTableQuery) {
            CreateTableQuery createTableQuery = (CreateTableQuery) ast;
            EngineClause engineClause = createTableQuery.getEngine();
            if (null != engineClause) {
                EngineExpr engineExpr = engineClause.getEngineExpr();
                if (null != engineExpr) {
                    Identifier identifier = engineExpr.getIdentifier();
                    if (null != identifier) {
                        String engineName = identifier.getName();
                        if (null != engineName && engineName.equals("Distributed")) {
                            List<ColumnExpr> args = engineExpr.getArgs();
                            if (null != args && !args.isEmpty()) {
                                ColumnExpr dbArg = args.get(1);
                                ColumnExpr tableArg = args.get(2);
                                if (dbArg instanceof LiteralColumnExpr && tableArg instanceof LiteralColumnExpr) {
                                    LiteralColumnExpr expr1 = (LiteralColumnExpr) dbArg;
                                    String database = eliminateQuotes(expr1.getLiteral().asString());
                                    LiteralColumnExpr expr2 = (LiteralColumnExpr) tableArg;
                                    String table = eliminateQuotes(expr2.getLiteral().asString());
                                    String tableFullName = database + "." + table;
                                    return tableFullName;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private String eliminateQuotes(String token) {
        if (token.startsWith("'") && token.endsWith("'")) {
            String replacedToken = token.substring(1, token.length() - 1);
            return replacedToken;
        }
        return token;
    }

}
