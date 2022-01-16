package com.clickhouse.visitor;

import lombok.Data;

@Data
public class ComparedResult {

    private boolean totallyTheSame = true;

    private boolean onlyDateDifferent = true;

    private String firstValueUpperBound;

    private String firstValueLowerBound;

    private String secondValueUpperBound;

    private String secondValueLowerBound;

}
