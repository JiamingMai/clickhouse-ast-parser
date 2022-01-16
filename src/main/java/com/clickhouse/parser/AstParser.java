package com.clickhouse.parser;

import com.clickhouse.parser.ast.SelectUnionQuery;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class AstParser {

    private boolean fillDefaultDatabase = false;

    public AstParser() {
    }

    public AstParser(boolean fillDefaultDatabase) {
        this.fillDefaultDatabase = fillDefaultDatabase;
    }

    public Object parse(String sql, String defaultDatabase) {
        try {
            long start = System.currentTimeMillis();
            // try parsing a SQL
            InputStream inputStream = new ByteArrayInputStream(sql.getBytes());
            ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);
            ClickHouseLexer ckLexer = new ClickHouseLexer(antlrInputStream);
            TokenStream tokens = new CommonTokenStream(ckLexer);
            ClickHouseParser ckParser = new ClickHouseParser(tokens);
            ClickHouseParser.QueryStmtContext tree = ckParser.queryStmt();
            // System.out.println(tree.toStringTree(ckParser));

            // Notice: ckParser.queryStmt() can only be called once as it reads data from stream
            CstVisitor visitor = new CstVisitor(defaultDatabase, fillDefaultDatabase);
            Object ast = visitor.visit(tree);
            long end = System.currentTimeMillis();
            log.debug("It takes " + (end - start) + " ms to parse the SQL.");
            //System.out.println(ast);
            if (null != ast && ast instanceof SelectUnionQuery) {
                // this is a SELECT statement
                log.debug("This is a SELECT statement.");
            } else {
                log.debug("This is NOT a SELECT statement.");
            }
            return ast;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object parse(String sql) {
        return parse(sql, "default");
    }

}
