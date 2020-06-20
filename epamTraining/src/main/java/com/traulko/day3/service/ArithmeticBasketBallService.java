package com.traulko.day3.service;

import com.traulko.day3.entity.Ball;
import com.traulko.day3.entity.Basket;
import com.traulko.day3.exception.BasketBallException;

import java.util.List;

public class ArithmeticBasketBallService {
    public double calculateCurrentBallsWeight(Basket basket) throws BasketBallException {
        if (basket == null) {
            throw new BasketBallException("Basket is null");
        }
        List<Ball> balls = basket.getBalls();
        double ballsWeight = 0;
        for (Ball ball : balls) {
            ballsWeight += ball.getWeight();
        }
        return ballsWeight;
    }

    public double calculateCurrentBallsVolume(Basket basket) throws BasketBallException {
        if (basket == null) {
            throw new BasketBallException("Basket is null");
        }
        List<Ball> balls = basket.getBalls();
        double ballsVolume = 0;
        for (Ball ball : balls) {
            ballsVolume += ball.getVolume();
        }
        return ballsVolume;
    }

    public int calculateTotalColorBalls(Basket basket, Ball.CustomColor color) throws BasketBallException {
        if (basket == null) {
            throw new BasketBallException("Basket is null");
        }
        if (color == null) {
            throw new BasketBallException("Color is null");
        }
        List<Ball> balls = basket.getBalls();
        int count = 0;
        for (Ball ball : balls) {
            if (ball.getCustomColor() == color) {
                count++;
            }
        }
        return count;
    }
}
