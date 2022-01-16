package com.clickhouse.parser;

import java.util.List;

public interface MetadataService {

    String getPartitionColName(String tableFullName);

    List<String> getTables();

}
