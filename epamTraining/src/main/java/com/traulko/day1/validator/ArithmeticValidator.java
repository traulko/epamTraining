package com.traulko.day1.validator;

public class ArithmeticValidator {
    public static final int MIN_SEQUENCE_NUMBER_COUNT = 2;
    public static final int MAX_SEQUENCE_NUMBER_COUNT = 100;

    public boolean isCorrectIntValueSequence(int... numbers) {
        return (numbers.length >= MIN_SEQUENCE_NUMBER_COUNT &&
                numbers.length <= MAX_SEQUENCE_NUMBER_COUNT);
    }
}
