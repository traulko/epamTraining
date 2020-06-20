package com.traulko.day3.validator;

public class BasketValidator {
    public static final double MIN_VOLUME_VALUE = 0;
    public static final double MAX_VOLUME_VALUE = 250;
    public static final int MIN_BEARING_CAPACITY_VALUE = 0;
    public static final int MAX_BEARING_CAPACITY_VALUE = 10;

    public boolean isCorrectBasketVolume(double volume) {
        return volume > MIN_VOLUME_VALUE &&
                volume <= MAX_VOLUME_VALUE;
    }

    public boolean isCorrectBasketBearingCapacity(int bearingCapacity) {
        return bearingCapacity > MIN_BEARING_CAPACITY_VALUE &&
                bearingCapacity <= MAX_BEARING_CAPACITY_VALUE;
    }
}
