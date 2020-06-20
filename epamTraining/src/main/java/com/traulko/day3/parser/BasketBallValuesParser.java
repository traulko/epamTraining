package com.traulko.day3.parser;

import com.traulko.day3.entity.Ball;

public class BasketBallValuesParser {
    public boolean isCorrectDoubleValue(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isCorrectIntValue(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isCorrectColorValue(String color) {
        try {
            Ball.CustomColor.valueOf(color.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public double parseDoubleValue(String value) {
        return Double.parseDouble(value);
    }

    public int parseIntValue(String value) {
        return Integer.parseInt(value);
    }

    public Ball.CustomColor parseColor(String color) {
        return Ball.CustomColor.valueOf(color.toUpperCase());
    }
}
