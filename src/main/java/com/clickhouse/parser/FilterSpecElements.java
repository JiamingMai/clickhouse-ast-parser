package com.clickhouse.parser;

import com.clickhouse.util.DateUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
@Data
public class FilterSpecElements {

    private Set<String> elements = new HashSet<>();

    private final String POSITIVE_INF = "positive_inf";
    private final String NEGATIVE_INF = "negative_inf";

    public FilterSpecElements() {
    }

    public FilterSpecElements(Set<String> elements) {
        if (null != elements) {
            this.elements = elements;
        }
    }

    public FilterSpecElements(String lowerBound, String upperBound) {
        String tmpLowerBound = lowerBound;
        String tmpUpperBound = upperBound;
        if (lowerBound.equals(NEGATIVE_INF)) {
            tmpLowerBound = "2018-01-01";
        }
        if (upperBound.equals(POSITIVE_INF)) {
            tmpUpperBound = addDays(DateUtil.formatDate(new Date()), 7);
            //tmpUpperBound = "2023-01-01";
        }
        buildElements(tmpLowerBound, tmpUpperBound);
    }

    private void buildElements(String lowerBound, String upperBound) {
        String cursor = lowerBound;
        while (lessThan(cursor, upperBound) || equalsTo(cursor, upperBound)) {
            elements.add(cursor);
            cursor = nextDay(cursor);
        }
    }

    private String lastDay(String dateStr) {
        return addDays(dateStr, -1);
    }

    private String nextDay(String dateStr) {
        return addDays(dateStr, 1);
    }

    private String addDays(String dateStr, int offset) {
        try {
            Date date = DateUtil.parseDate(dateStr);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(Calendar.DATE, offset);
            String lastDayStr = DateUtil.formatDate(calendar.getTime());
            return lastDayStr;
        } catch (Exception e) {
            log.error("", e);
        }
        return null;
    }

    private boolean equalsTo(String date1Str, String date2Str) {
        if (compare(date1Str, date2Str) == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean lessThan(String date1Str, String date2Str) {
        if (compare(date1Str, date2Str) < 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean greaterThan(String date1Str, String date2Str) {
        if (compare(date1Str, date2Str) > 0) {
            return true;
        } else {
            return false;
        }
    }

    private Integer compare(String date1Str, String date2Str) {
        try {
            long date1 = DateUtil.parseDate(date1Str).getTime();
            long date2 = DateUtil.parseDate(date2Str).getTime();
            if (date1 == date2) {
                return 0;
            } else {
                return date1 - date2 > 0 ? 1 : -1;
            }
        } catch (Exception e) {
            log.error("", e);
        }
        return null;
    }

}
