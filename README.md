# ClickHouse AST Parser & Visitor
# Introduction
ClickHouse AST Parser, it is much more than a parser. It is a convenient toolbox that provides services related to ClickHouse AST. 
With ClickHouse AST Parser, you are able to easily convert ClickHouse SQL statement to AST (Abstract Syntax Tree), and further utilize
the parsing results. You can operate on key objects such as CST, CST parser, CST visitor, AST, AST parser and AST visitor throughout the parsing process.

```java
String sql = "SELECT t1.id, count(1) as total_count FROM my_db1.table1 t1 LEFT JOIN my_db2.table2 t2 ON t1.id = t2.id GROUP BY t1.id";
AstParser astParser = new AstParser();
INode ast = (INode) astParser.parse(sql);
```
# Use cases
## Find out related tables
Functions such as hotspot analysis and caching rely on this basic parsing capability.
```java
String sql = "SELECT t1.id, count(1) as total_count FROM my_db1.table1 t1 LEFT JOIN my_db2.table2 t2 ON t1.id = t2.id GROUP BY t1.id";
AstParser astParser = new AstParser();
INode ast = (INode) astParser.parse(sql);
ReferredTablesDetector referredTablesDetector = new ReferredTablesDetector();
// tables should be ["my_db1.table1", "my_db2.table2"] in this case
List<String> tables = referredTablesDetector.searchTables(ast);
```
## Find out related partitions
Related partitions can also be found. But this time we need to implement MetadataService to tell it how to
get the metadata since ClickHouse SQL Parser needs to know the partition column name of a specified table. 
```java
// we need to implement MetadataService first
MetadataService metadataService = new MetadataService() {
            @Override
            public String getPartitionColName(String tableFullName) {
                // TODO: implement this method
                return null;
            }

            @Override
            public List<String> getTables() {
                // TODO: implement this method
                return null;
            }
        };
String todayDate = "2022-01-01"; // for parsing UDF like today() and yesterday() in the SQL
String targetIP = "127.0.0.1"; // the node to get metadata
ReferredPartitionsDetector referredPartitionsDetector = new ReferredPartitionsDetector(todayDate, targetIp, metadataService);
List<String> partitionRangeList = referredPartitionsDetector.searchTablePartitions(ast);
```
## Extract arguments of Distributed engine
Although Distributed engine is well designed to organize data, sometimes we do need to extract the detail information 
such as related cluster and local table name. However, it is not convenient to extract them with regular expression 
because it is easy to make mistake, especially when there are complex comments in a CREATE SQL. ClickHouse SQL Parser solve this problem.   
```java
String sql = "CREATE TABLE my_db.my_tbl (date Date, name String) Engine = Distributed('my_cluster', 'my_db', 'my_tbl_local', rand())";
DistributedTableInfoDetector distributedTableInfoDetector = new DistributedTableInfoDetector();
// clusterName is "my_cluster"
String clusterName = distributedTableInfoDetector.searchCluster(sql);
// tableFullName is "my_db.my_tbl_local"
String tableFullName = distributedTableInfoDetector.searchLocalTableFullName(sql);
``` 
### Rewrite SQL adding "global" keywords
This allows us to optimize a slow SQL by rewriting it. Adding "global" keyword to the SQL is such a case. Develop more rewriters 
based on this ClickHouse SQL Parser will bring more benefits.
```java
String sql = "SELECT t1.id, count(1) as total_count FROM my_db1.table1 t1 LEFT JOIN my_db2.table2 t2 ON t1.id = t2.id GROUP BY t1.id";
AstParser astParser = new AstParser(false);
SelectUnionQuery ast = (SelectUnionQuery) astParser.parse(sql);
GlobalJoinAstRewriter globalJoinAstRewriter = new GlobalJoinAstRewriter();
String rewrittenSql =  globalJoinAstRewriter.visit((INode) ast);
// the rewritten SQL should be:
// SELECT t1.id, count(1) as total_count FROM my_db1.table1 t1 GLOBAL LEFT JOIN my_db2.table2 t2 ON t1.id = t2.id GROUP BY t1.id
```
