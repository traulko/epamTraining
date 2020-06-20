package com.traulko.day3.creator;

import com.traulko.day3.entity.Ball;
import com.traulko.day3.entity.Basket;
import com.traulko.day3.exception.BasketBallException;
import com.traulko.day3.parser.BasketBallValuesParser;
import com.traulko.day3.validator.BallValidator;
import com.traulko.day3.validator.BasketValidator;

import java.util.ArrayList;

public class BasketBallCreator {
    public Ball createBall(String radius, String weight, String color) throws BasketBallException {
        BasketBallValuesParser basketBallValuesParser = new BasketBallValuesParser();
        BallValidator ballValidator = new BallValidator();

        boolean isCorrectRadiusValue = basketBallValuesParser.isCorrectDoubleValue(radius);
        if (!isCorrectRadiusValue) {
            throw new BasketBallException("Incorrect radius value");
        }
        boolean isCorrectWeightValue = basketBallValuesParser.isCorrectDoubleValue(weight);
        if (!isCorrectWeightValue) {
            throw new BasketBallException("Incorrect weight value");
        }
        boolean isCorrectColor = basketBallValuesParser.isCorrectColorValue(color);
        if (!isCorrectColor) {
            throw new BasketBallException("Incorrect color");
        }

        double radiusValue = basketBallValuesParser.parseDoubleValue(radius);
        double weightValue = basketBallValuesParser.parseDoubleValue(weight);
        Ball.CustomColor colorValue = basketBallValuesParser.parseColor(color);

        isCorrectRadiusValue = ballValidator.isCorrectBallRadius(radiusValue);
        if (!isCorrectRadiusValue) {
            throw new BasketBallException("Radius value is not in limit");
        }
        isCorrectWeightValue = ballValidator.isCorrectBallWeight(weightValue);
        if (!isCorrectWeightValue) {
            throw new BasketBallException("Weight value is not in limit");
        }

        return new Ball(radiusValue, weightValue, colorValue);
    }

    public Basket createBasket(String volume, String bearingCapacity) throws BasketBallException {
        BasketBallValuesParser basketBallValuesParser = new BasketBallValuesParser();
        BasketValidator basketValidator = new BasketValidator();

        boolean isCorrectVolumeValue = basketBallValuesParser.isCorrectDoubleValue(volume);
        if (!isCorrectVolumeValue) {
            throw new BasketBallException("Incorrect volume value");
        }
        boolean isCorrectBearingCapacityValue = basketBallValuesParser.isCorrectIntValue(bearingCapacity);
        if (!isCorrectBearingCapacityValue) {
            throw new BasketBallException("Incorrect bearing capacity value");
        }

        double volumeValue = basketBallValuesParser.parseDoubleValue(volume);
        int bearingCapacityValue = basketBallValuesParser.parseIntValue(bearingCapacity);

        isCorrectVolumeValue = basketValidator.isCorrectBasketVolume(volumeValue);
        if (!isCorrectVolumeValue) {
            throw new BasketBallException("Volume value is not in limit");
        }
        isCorrectBearingCapacityValue = basketValidator.isCorrectBasketBearingCapacity(bearingCapacityValue);
        if (!isCorrectBearingCapacityValue) {
            throw new BasketBallException("Bearing capacity is not in limit");
        }

        return new Basket(volumeValue, bearingCapacityValue, new ArrayList<Ball>());
    }
}
