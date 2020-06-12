package com.traulko.day1.service;

import com.traulko.day1.entity.CustomTime;
import com.traulko.day1.exception.IncorrectValueException;
import com.traulko.day1.validator.DateTimeValidator;

public class DateTimeService {
    public static final int FOUR_YEARS = 4;
    public static final int FOUR_HUNDRED_YEARS = 400;
    public static final int ONE_HUNDRED_YEARS = 100;

    private enum Month {
        JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30),
        MAY(31), JUNE(30), JULY(31), AUGUST(31),
        SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

        private final int days;

        Month(int days) {
            this.days = days;
        }
    }

    public boolean isLeapYear(int year) {
        return ((year % FOUR_HUNDRED_YEARS == 0) ||
                ((year % FOUR_YEARS == 0) &&
                        (year % ONE_HUNDRED_YEARS != 0)));
    }

    public int getCountOfDaysInMonth(int monthNumber,
                                     int yearNumber) throws IncorrectValueException {
        DateTimeValidator dateTimeValidator = new DateTimeValidator();

        Month[] months = Month.values();

        if (!dateTimeValidator.isCorrectYearNumber(yearNumber)) {
            throw new IncorrectValueException("Incorrect year value");
        }
        if (!dateTimeValidator.isCorrectMonthNumber(monthNumber)) {
            throw new IncorrectValueException("Incorrect month value");
        }

        boolean isFebruary = months[monthNumber - 1].equals(Month.FEBRUARY);
        if (isLeapYear(yearNumber) && isFebruary) {
            return months[monthNumber - 1].days + 1;
        }
        else {
            return months[monthNumber - 1].days;
        }
    }

    public CustomTime convertSecondsToTimeFormat (int totalSeconds) throws IncorrectValueException {
        DateTimeValidator dateTimeValidator = new DateTimeValidator();

        if (!dateTimeValidator.isCorrectCountOfSeconds(totalSeconds)) {
            throw new IncorrectValueException("Count of second should be > 0 and < 86400!");
        }

        int countOfHours = totalSeconds / 3600;
        totalSeconds = totalSeconds - countOfHours * 3600;
        int countOfMinutes = totalSeconds / 60;
        int countOfSeconds = totalSeconds - countOfMinutes * 60;

        return new CustomTime(countOfHours, countOfMinutes, countOfSeconds);
    }
}

