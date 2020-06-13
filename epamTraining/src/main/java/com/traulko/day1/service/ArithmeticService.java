package com.traulko.day1.service;

import com.traulko.day1.exception.IncorrectValueException;
import com.traulko.day1.validator.ArithmeticValidator;

public class ArithmeticService {
    public static final int SECOND_DEGREE = 2;
    public static final int BASE_TEN = 10;
    public static final int MIN_SEQUENCE_NUMBER_COUNT = 2;

    public int calculateLastNumberDigit(int number) {
        return number % BASE_TEN;
    }

    public int calculateSquaredNumber(int number) {
        return (int) Math.pow(number, SECOND_DEGREE);
    }

    public boolean checkTwoEvenNumbers(int... numbers) throws IncorrectValueException {
        ArithmeticValidator arithmeticValidator = new ArithmeticValidator();

        if (!arithmeticValidator.isCorrectIntValueSequence(numbers)) {
            throw new IncorrectValueException("Sequence should be consists >= 2 numbers!");
        }
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count >= MIN_SEQUENCE_NUMBER_COUNT;
    }

    public boolean checkPerfectNumber(int number) throws IncorrectValueException {
        if (number <= 0) {
            throw new IncorrectValueException("Number should be positive!");
        }
        int sumOfDividers = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }
        return sumOfDividers == number;
    }


}
