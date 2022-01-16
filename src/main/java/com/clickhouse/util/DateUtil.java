package com.clickhouse.util;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@Slf4j
public class DateUtil {

    public static final ThreadLocal<SimpleDateFormat> dateFormat = new ThreadLocal() {
        @Override
        protected SimpleDateFormat initialValue() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
            return dateFormat;
        }
    };

    public static final ThreadLocal<SimpleDateFormat> datetimeFormat = new ThreadLocal() {
        @Override
        protected SimpleDateFormat initialValue() {
            SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            datetimeFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
            return datetimeFormat;
        }
    };

    public static String formatDate(Date date) {
        return dateFormat.get().format(date);
    }

    public static String formatDatetime(Date date) {
        return datetimeFormat.get().format(date);
    }

    public static Date parseDate(String str) {
        try {
            return dateFormat.get().parse(str);
        } catch (ParseException e) {
            log.error("", e);
            return null;
        }
    }

    public static Date parseDatetime(String str) {
        try {
            return datetimeFormat.get().parse(str);
        } catch (ParseException e) {
            log.error("", e);
            return null;
        }
    }


    public static String yesterday() {
        return lastDay(today());
    }

    public static String today() {
        return dateFormat.get().format(new Date());
    }

    public static String lastDay(String dateStr) {
        return addDays(dateStr, -1);
    }

    public static String nextDay(String dateStr) {
        return addDays(dateStr, 1);
    }

    public static String addDays(String dateStr, int offset) {
        try {
            Date date = dateFormat.get().parse(dateStr);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(Calendar.DATE, offset);
            String lastDayStr = dateFormat.get().format(calendar.getTime());
            return lastDayStr;
        } catch (Exception e) {
            log.error("", e);
        }
        return null;
    }

}
