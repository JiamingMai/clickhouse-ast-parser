package com.clickhouse.visitor;

import com.clickhouse.parser.ast.Identifier;
import com.clickhouse.parser.ast.expr.*;
import com.clickhouse.util.DateUtil;
import com.clickhouse.parser.ast.WhereClause;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@Slf4j
public class WhereClauseComparator {

    private ComparedResult comparedResult = new ComparedResult();

    public ComparedResult compare(WhereClause whereClause1, WhereClause whereClause2) {
        if (null == whereClause1 && null == whereClause2) {
            return comparedResult;
        }
        if ((null == whereClause1 && null != whereClause2) || (null != whereClause1 && null == whereClause2)) {
            comparedResult.setTotallyTheSame(false);
            comparedResult.setOnlyDateDifferent(false);
            return comparedResult;
        }
        if (null != whereClause1 && null != whereClause2) {
            boolean same = visitColumnExpr(whereClause1.getWhereExpr(), whereClause2.getWhereExpr());
            comparedResult.setTotallyTheSame(same);
        }
        return comparedResult;
    }

    public boolean visitColumnExpr(ColumnExpr expr1, ColumnExpr expr2) {
        if (expr1 instanceof AsteriskColumnExpr && expr1 instanceof AsteriskColumnExpr) {
            return visitAsteriskColumnExpr((AsteriskColumnExpr) expr1, (AsteriskColumnExpr) expr2);
        }
        if (expr1 instanceof AliasColumnExpr && expr2 instanceof AliasColumnExpr) {
            return visitAliasColumnExpr((AliasColumnExpr) expr1, (AliasColumnExpr) expr2);
        }
        if (expr1 instanceof FunctionColumnExpr && expr2 instanceof FunctionColumnExpr) {
            return visitFunctionColumnExpr((FunctionColumnExpr) expr1, (FunctionColumnExpr) expr2);
        }
        if (expr1 instanceof SubqueryColumnExpr && expr2 instanceof SubqueryColumnExpr) {
            return visitSubqueryColumnExpr((SubqueryColumnExpr) expr1, (SubqueryColumnExpr) expr2);
        }
        if (expr1 instanceof IdentifierColumnExpr && expr2 instanceof IdentifierColumnExpr) {
            return visitIdentifierColumnExpr((IdentifierColumnExpr) expr1, (IdentifierColumnExpr) expr2);
        }
        if (expr1 instanceof LiteralColumnExpr && expr2 instanceof LiteralColumnExpr) {
            return visitLiteralColumnExpr((LiteralColumnExpr) expr1, (LiteralColumnExpr) expr2);
        }
        return comparedResult.isTotallyTheSame();
    }

    public boolean visitAsteriskColumnExpr(AsteriskColumnExpr expr1, AsteriskColumnExpr expr2) {
        return true;
    }

    public boolean visitAliasColumnExpr(AliasColumnExpr expr1, AliasColumnExpr expr2) {
        if (null != expr1.getExpr() && null != expr2.getExpr()) {
            visitColumnExpr(expr1.getExpr(), expr2.getExpr());
        }
        if (null != expr1.getAlias() && null != expr2.getAlias()) {
            visitIdentifier(expr1.getAlias(), expr2.getAlias());
        }
        return comparedResult.isTotallyTheSame();
    }

    public boolean visitFunctionColumnExpr(FunctionColumnExpr expr1, FunctionColumnExpr expr2) {
        if (null != expr1 && null != expr2) {
            if (null != expr1.getName() && null != expr2.getName()) {

                comparedResult.setTotallyTheSame(visitIdentifier(expr1.getName(), expr2.getName()) && comparedResult.isTotallyTheSame());
            }
            if (null != expr1.getParams() && null != expr2.getParams()) {
                comparedResult.setTotallyTheSame(visitColumnExprList(expr1.getParams(), expr2.getParams()) && comparedResult.isTotallyTheSame());
            }
            if (null != expr1.getArgs() && null != expr2.getArgs()) {
                comparedResult.setTotallyTheSame(visitColumnExprList(expr1.getArgs(), expr2.getArgs()) && comparedResult.isTotallyTheSame());
            }
        }
        return comparedResult.isTotallyTheSame();
    }

    public boolean visitSubqueryColumnExpr(SubqueryColumnExpr expr1, SubqueryColumnExpr expr2) {
        if (null != expr1 && null != expr2) {
            if (expr1.equals(expr2)) {
                return true;
            }
        }
        comparedResult.setTotallyTheSame(false);
        comparedResult.setOnlyDateDifferent(false);
        return false;
    }

    public boolean visitIdentifier(Identifier identifier1, Identifier identifier2) {
        if (null == identifier1 && null == identifier2) {
            return true;
        }
        if (null != identifier1 && null != identifier2) {
            if (identifier1.getName().equals(identifier2.getName())) {
                return true;
            }
        }
        comparedResult.setTotallyTheSame(false);
        comparedResult.setOnlyDateDifferent(false);
        return false;
    }

    public boolean visitIdentifierColumnExpr(IdentifierColumnExpr expr1, IdentifierColumnExpr expr2) {
        if (null != expr1 && null != expr2) {
            return visitIdentifier(expr1.getIdentifier(), expr2.getIdentifier());
        }
        return false;
    }

    public boolean visitLiteralColumnExpr(LiteralColumnExpr expr1, LiteralColumnExpr expr2) {
        if (null != expr1 && null != expr2) {
            if (!expr1.getLiteral().asString().equals(expr2.getLiteral().asString())) {
                comparedResult.setTotallyTheSame(false);
                if (!isDate(expr1.getLiteral().asString()) || !isDate(expr2.getLiteral().asString())) {
                    comparedResult.setOnlyDateDifferent(false);
                }
                updateFirstValueUpperBoundDate(expr1.getLiteral().asString());
                updateSecondValueUpperBoundDate(expr2.getLiteral().asString());
            }
        }
        return comparedResult.isTotallyTheSame();
    }

    public boolean visitColumnExprList(List<ColumnExpr> exprs1, List<ColumnExpr> exprs2) {
        if (exprs1.size() != exprs2.size()) {
            comparedResult.setTotallyTheSame(false);
            return false;
        }
        for (int i = 0; i < exprs1.size(); i++) {
            ColumnExpr expr1 = exprs1.get(i);
            ColumnExpr expr2 = exprs2.get(i);
            comparedResult.setTotallyTheSame(visitColumnExpr(expr1, expr2) && comparedResult.isTotallyTheSame());
        }
        return comparedResult.isTotallyTheSame();
    }

    private boolean isDate(String str) {
        String tmp = str;
        if (str.startsWith("'") && str.endsWith("'")) {
            tmp = str.substring(1, str.length() - 1);
        }
        return Pattern.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}", tmp);
    }

    private void updateFirstValueUpperBoundDate(String dateStr) {
        String firstValueUpperBound = comparedResult.getFirstValueUpperBound();
        String firstValueLowerBound = comparedResult.getFirstValueLowerBound();
        if (null == firstValueUpperBound && null == firstValueLowerBound) {
            comparedResult.setFirstValueUpperBound(dateStr);
            comparedResult.setFirstValueLowerBound(dateStr);
            return;
        }

        Date date = DateUtil.parseDate(dateStr.substring(1, dateStr.length() - 1));
        Date firstValueUpperBoundDate = DateUtil.parseDate(firstValueUpperBound.substring(1, firstValueUpperBound.length() - 1));
        if (date.getTime() > firstValueUpperBoundDate.getTime()) {
            comparedResult.setFirstValueUpperBound(dateStr);
        }

        Date firstValueLowerBoundDate = DateUtil.parseDate(firstValueLowerBound.substring(1, firstValueLowerBound.length() - 1));
        if (date.getTime() < firstValueLowerBoundDate.getTime()) {
            comparedResult.setFirstValueLowerBound(dateStr);
        }
    }

    private void updateSecondValueUpperBoundDate(String dateStr) {
        String secondValueUpperBound = comparedResult.getSecondValueUpperBound();
        String secondValueLowerBound = comparedResult.getSecondValueLowerBound();
        if (null == secondValueUpperBound && null == secondValueLowerBound) {
            comparedResult.setSecondValueUpperBound(dateStr);
            comparedResult.setSecondValueLowerBound(dateStr);
            return;
        }

        Date date = DateUtil.parseDate(dateStr.substring(1, dateStr.length() - 1));
        Date secondValueUpperBoundDate = DateUtil.parseDate(secondValueUpperBound.substring(1, secondValueUpperBound.length() - 1));
        if (date.getTime() > secondValueUpperBoundDate.getTime()) {
            comparedResult.setSecondValueUpperBound(dateStr);
        }

        Date secondValueLowerBoundDate = DateUtil.parseDate(secondValueLowerBound.substring(1, secondValueLowerBound.length() - 1));
        if (date.getTime() < secondValueLowerBoundDate.getTime()) {
            comparedResult.setSecondValueLowerBound(dateStr);
        }
    }


}