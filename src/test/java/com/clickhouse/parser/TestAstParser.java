package com.clickhouse.parser;

import com.clickhouse.parser.ast.DistributedTableInfoDetector;
import com.clickhouse.parser.ast.INode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class TestAstParser {

    @Test
    public void testAstParser() {
        // parse SQL and generate its AST
        AstParser astParser = new AstParser();
        String sql1 = "ALTER TABLE my_db.my_tbl ADD COLUMN IF NOT EXISTS id Int64";
        Object parsedResult1 = astParser.parse(sql1);
        log.info(parsedResult1.toString());
        String sql2 = "ALTER TABLE my_db.my_tbl DROP PARTITION '2020-11-21'";
        Object parsedResult2 = astParser.parse(sql2);
        log.info(parsedResult2.toString());
    }

    @Test
    public void testReferredTablesDetector() {
        String sql = "SELECT t1.a FROM t1 RIGHT JOIN t2 ON t1.id = t2.id LIMIT 1000";
        AstParser astParser = new AstParser();
        Object ast = astParser.parse(sql);
        ReferredTablesDetector referredTablesDetector = new ReferredTablesDetector();
        List<String> tables = referredTablesDetector.searchTables((INode) ast);
        tables.parallelStream().forEach(table -> System.out.println(table));
    }

    @Test
    public void testDistributedTableInfoDetector() {
        String sql = "CREATE TABLE my_db.my_tbl (date Date, name String) Engine = Distributed('my_cluster', 'my_db', 'my_tbl_local', rand())";
        DistributedTableInfoDetector distributedTableInfoDetector = new DistributedTableInfoDetector();
        String clusterName = distributedTableInfoDetector.searchCluster(sql);
        log.info(clusterName);
        long start = System.currentTimeMillis();
        String tableFullName = distributedTableInfoDetector.searchLocalTableFullName(sql);
        long end = System.currentTimeMillis();
        log.info(tableFullName);
        log.info("It takes " + (end - start) + " ms");
    }

}
