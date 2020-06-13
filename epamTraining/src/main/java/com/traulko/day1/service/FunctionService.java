package com.traulko.day1.service;

import com.traulko.day1.exception.IncorrectValueException;
import com.traulko.day1.validator.FunctionValidator;

import java.util.HashMap;
import java.util.Map;

public class FunctionService {
    public static final int SECOND_DEGREE = 2;
    public static final int THIRD_DEGREE = 3;

    public double calculateArithmeticFunction(double argument) throws IncorrectValueException {
        FunctionValidator functionValidator = new FunctionValidator();

        if (!functionValidator.isCorrectFunctionArgument(argument)) {
            throw new IncorrectValueException("Zero in denominator!");
        }

        /*
        F(x) =
            3 * x + 9 - x^2, if x >= 3
            1 / (x^3 - 6), if x < 3
        */

        if (argument >= 3) {
            return (3 * argument + 9 - Math.pow(argument, SECOND_DEGREE));
        } else {
            return 1 / (Math.pow(argument, THIRD_DEGREE) - 6);
        }
    }

    public Map<Double, Double> calculateTangentFunction(double segmentValue1, double segmentValue2,
                                                        double stepValue) throws IncorrectValueException {
        FunctionValidator functionValidator = new FunctionValidator();

        if (!functionValidator.isCorrectFunctionValues(segmentValue1, segmentValue2, stepValue)) {
            throw new IncorrectValueException("Incorrect values!");
        }

        double startSegmentValue = Double.min(segmentValue1, segmentValue2);
        double endSegmentValue = Double.max(segmentValue1, segmentValue2);

        HashMap<Double, Double> valueMap = new HashMap<>();

        while (startSegmentValue <= endSegmentValue) {
            double tangentFunctionResult = Math.tan(startSegmentValue);
            valueMap.put(startSegmentValue, tangentFunctionResult);
            startSegmentValue += stepValue;
        }

        return valueMap;
    }
}
