package com.traulko.day3.service;

import com.traulko.day3.entity.Ball;
import com.traulko.day3.entity.Basket;
import com.traulko.day3.exception.BasketBallException;

import java.util.List;

public class BasketService {
    public boolean addBallToBasket(Basket basket, Ball ball) throws BasketBallException {
        if (basket == null) {
            throw new BasketBallException("Basket is null");
        }
        if (ball == null) {
            throw new BasketBallException("Ball is null");
        }

        if (isSuitableBallToBasket(basket, ball)) {
            basket.add(ball);
            return true;
        }
        return false;
    }

    public boolean removeBallFromBasket(Basket basket, int index) throws BasketBallException {
        if (basket == null) {
            throw new BasketBallException("Basket is null");
        }

        List<Ball> balls = basket.getBalls();
        int countOfBalls = balls.size();

        if (index < 0 || index >= countOfBalls) {
            return false;
        }

        basket.remove(index);
        return true;
    }

    public boolean isSuitableBallToBasket(Basket basket, Ball ball) throws BasketBallException {
        ArithmeticBasketBallService arithmeticBasketBallService = new ArithmeticBasketBallService();

        double occupiedVolume = arithmeticBasketBallService.calculateCurrentBallsVolume(basket);
        double occupiedWeight = arithmeticBasketBallService.calculateCurrentBallsWeight(basket);

        double freeVolume = basket.getVolume() - occupiedVolume;
        double freeWeight = basket.getBearingCapacity() - occupiedWeight;

        boolean isSuitableVolume = freeVolume - ball.getVolume() >= 0;
        boolean isSuitableWeight = freeWeight - ball.getWeight() >= 0;

        return isSuitableVolume && isSuitableWeight;
    }
}
