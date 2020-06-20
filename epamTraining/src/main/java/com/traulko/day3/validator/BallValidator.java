package com.traulko.day3.validator;

public class BallValidator {
    public static final double MIN_RADIUS_VALUE = 0;
    public static final double MAX_RADIUS_VALUE = 30;
    public static final double MIN_WEIGHT_VALUE = 0;
    public static final double MAX_WEIGHT_VALUE = 10;

    public boolean isCorrectBallRadius(double radius) {
        return radius > MIN_RADIUS_VALUE &&
                radius <= MAX_RADIUS_VALUE;

    }

    public boolean isCorrectBallWeight(double weight) {
        return weight > MIN_WEIGHT_VALUE &&
                weight <= MAX_WEIGHT_VALUE;
    }
}
