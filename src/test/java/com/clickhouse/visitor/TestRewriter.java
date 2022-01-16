package com.clickhouse.visitor;

import com.clickhouse.parser.ast.INode;
import com.clickhouse.parser.ast.SelectUnionQuery;
import com.clickhouse.parser.AstParser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TestRewriter {

    @Test
    public void testRewrite1() {
        // parse SQL and generate its AST
        long start = System.currentTimeMillis();
        String sql = "SELECT t1.id, count(1) as total_count FROM my_db1.table1 t1 LEFT JOIN my_db2.table2 t2 ON t1.id = t2.id GROUP BY t1.id";
        AstParser astParser = new AstParser();
        Object parsedResult = astParser.parse(sql);
        GlobalJoinAstRewriter globalJoinAstRewriter = new GlobalJoinAstRewriter();
        String rewrittenSql =  globalJoinAstRewriter.visit((INode) parsedResult);
        long end = System.currentTimeMillis();
        log.info(sql);
        log.info("SQL is rewritten as --> " + rewrittenSql);
        log.info("It takes " + (end - start) + " ms totally. ");
    }

    @Test
    public void testRewrite2() {
        String sql = "SELECT * FROM t WHERE uid global in (SELECT uid FROM t2)";
        AstParser astParser = new AstParser(false);
        SelectUnionQuery ast = (SelectUnionQuery) astParser.parse(sql);
        BaseSqlBuilder baseSqlBuilder = new BaseSqlBuilder();
        String rewrittenSql = baseSqlBuilder.build(ast);
        log.info(rewrittenSql);
    }

    @Test
    public void testRewrite3() {
        String sql = "SELECT * FROM t WHERE uid global in (SELECT uid FROM t2) FORMAT JSON";
        AstParser astParser = new AstParser(false);
        SelectUnionQuery ast = (SelectUnionQuery) astParser.parse(sql);
        GlobalJoinAstRewriter globalJoinAstRewriter = new GlobalJoinAstRewriter();
        String rewrittenSql =  globalJoinAstRewriter.visit((INode) ast);
        log.info(rewrittenSql);
    }

}
