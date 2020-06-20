package com.traulko.day3;

import com.traulko.day3.entity.Ball;
import com.traulko.day3.entity.Basket;
import com.traulko.day3.exception.BasketBallException;
import com.traulko.day3.service.BasketService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(10, 10, new ArrayList<>());

        Ball ball = new Ball(5, 5, Ball.CustomColor.GREEN);

        BasketService basketService = new BasketService();

        try {
            boolean a = basketService.addBallToBasket(basket, ball);
            boolean b =basketService.addBallToBasket(basket, ball);
            boolean c =basketService.addBallToBasket(basket, ball);
            boolean d =basketService.addBallToBasket(basket, ball);
            basket.add(ball);
        } catch (BasketBallException e) {
            System.out.println(e.getMessage());
        }

    }
}
