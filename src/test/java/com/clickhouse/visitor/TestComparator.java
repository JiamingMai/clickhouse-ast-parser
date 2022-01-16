package com.clickhouse.visitor;

import com.clickhouse.parser.ast.SelectUnionQuery;
import com.clickhouse.parser.AstParser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TestComparator {

    @Test
    public void testComparator() {
        String cachedSql = "SELECT toStartOfDay(toDateTime(date)) AS __timestamp,\n" +
                "       count(DISTINCT id) AS id_count\n" +
                "FROM my_db.my_table\n" +
                "WHERE ftime >= toDate('2021-10-02')\n" +
                "  AND ftime <= toDate('2021-11-02')\n" +
                "  AND feature1 = 1\n" +
                "  AND feature2 = 8\n" +
                "GROUP BY toStartOfDay(toDateTime(date))\n" +
                "ORDER BY id_count DESC\n" +
                "LIMIT 50000";

        String currentSql = "SELECT toStartOfDay(toDateTime(date)) AS __timestamp,\n" +
                "       count(DISTINCT id) AS id_count\n" +
                "FROM my_db.my_table\n" +
                "WHERE ftime >= toDate('2021-10-03')\n" +
                "  AND ftime <= toDate('2021-11-03')\n" +
                "  AND feature1 = 1\n" +
                "  AND feature2 = 8\n" +
                "GROUP BY toStartOfDay(toDateTime(date))\n" +
                "ORDER BY id_count DESC\n" +
                "LIMIT 50000";

        AstParser astParser = new AstParser();
        SelectUnionQuery currentSqlAst = (SelectUnionQuery) astParser.parse(currentSql);
        SelectUnionQuery cachedSqlAst = (SelectUnionQuery) astParser.parse(cachedSql);

        WhereClauseComparator comparator = new WhereClauseComparator();
        ComparedResult comparedResult = comparator.compare(currentSqlAst.getStatements().get(0).getWhereClause(), cachedSqlAst.getStatements().get(0).getWhereClause());
        System.out.println(comparedResult);

        RewrittenDateSqlBuilder rewrittenDateSqlBuilder = new RewrittenDateSqlBuilder(comparedResult);
        String sql = rewrittenDateSqlBuilder.build(cachedSqlAst);
        System.out.println(sql);
    }

}
