package com.traulko.day1.validator;

public class FunctionValidator {
    public static final int THIRD_DEGREE = 3;
    public static final int FUNCTION_ZERO_DIVIDER = 6;

    public boolean isCorrectFunctionArgument(double argument) {
        return (Math.pow(argument, THIRD_DEGREE) != FUNCTION_ZERO_DIVIDER);
    }

    public boolean isCorrectFunctionValues(double segmentValue1,
                                           double segmentValue2, double step) {
        double maxSegmentValue = Double.max(segmentValue1, segmentValue2);
        double minSegmentValue = Double.min(segmentValue1, segmentValue2);
        double distance = maxSegmentValue - minSegmentValue;
        return step > 0 && distance / step > 1;
    }
}
