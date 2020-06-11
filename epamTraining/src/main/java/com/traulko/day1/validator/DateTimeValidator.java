package com.traulko.day1.validator;

public class DateTimeValidator {
    public static final int MONTH_MAX_VALUE = 12;
    public static final int MIN_VALUE = 0;
    public static final int YEAR_MAX_VALUE = 2020;
    public static final int SECOND_MAX_VALUE = 86400;

    public boolean isCorrectMonthNumber (int monthNumber) {
        return (monthNumber <= MONTH_MAX_VALUE && monthNumber > MIN_VALUE);
    }

    public boolean isCorrectYearNumber (int yearNumber) {
        return (yearNumber >= MIN_VALUE && yearNumber <= YEAR_MAX_VALUE);
    }

    public boolean isCorrectCountOfSeconds (int totalSeconds) {
        return (totalSeconds >= MIN_VALUE && totalSeconds <= SECOND_MAX_VALUE);
    }
}

