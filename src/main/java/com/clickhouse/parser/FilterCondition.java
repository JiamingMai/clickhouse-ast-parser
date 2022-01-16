package com.clickhouse.parser;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FilterCondition {

    private String database;

    private String table;

    private String columnName;

    private List<FilterSpecElements> specElementsList;

    public FilterCondition() {
    }

    public FilterCondition(String database, String table, String columnName) {
        this.database = database;
        this.table = table;
        this.columnName = columnName;
    }

    /**
     * date or datetime. day by default
     */
    private String partitionType = "day";

    public void addFilterRange(String lowerBound, String upperBound) {
        addFilterRange(new FilterSpecElements(lowerBound, upperBound));
    }

    public void addFilterRange(FilterSpecElements specElements) {
        if (null == specElementsList) {
            specElementsList = new ArrayList<>();
        }
        specElementsList.add(specElements);
    }

}
