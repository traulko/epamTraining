package test.traulko.day3.service;

import com.traulko.day3.entity.Ball;
import com.traulko.day3.entity.Basket;
import com.traulko.day3.exception.BasketBallException;
import com.traulko.day3.service.ArithmeticBasketBallService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

public class ArithmeticBasketBallServiceTest {
    ArithmeticBasketBallService arithmeticBasketBallService;

    @BeforeClass
    public void setUp() {
        arithmeticBasketBallService = new ArithmeticBasketBallService();
    }

    @AfterClass
    public void tearDown() {
        arithmeticBasketBallService = null;
    }

    @Test
    public void calculateCurrentBallsWeightPositiveTest() {
        try {
            Ball ball1 = new Ball(1, 2, Ball.CustomColor.GREEN);
            Ball ball2 = new Ball(2, 3, Ball.CustomColor.RED);
            List<Ball> balls = new ArrayList<Ball>();
            balls.add(ball1);
            balls.add(ball2);
            Basket basket = new Basket(10, 10, balls);
            double actual = arithmeticBasketBallService.calculateCurrentBallsWeight(basket);
            double expected = 5;
            assertEquals(actual, expected, 0.001, "calculateCurrentBallsWeightPositiveTest failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateCurrentBallsWeightNegativeTest() {
        try {
            Ball ball1 = new Ball(1, 2, Ball.CustomColor.WHITE);
            List<Ball> balls = new ArrayList<Ball>();
            balls.add(ball1);
            Basket basket = new Basket(10, 10, balls);
            double actual = arithmeticBasketBallService.calculateCurrentBallsWeight(basket);
            double expected = 10;
            assertNotEquals(actual, expected, 0.001, "calculateCurrentBallsWeightNegativeTest failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = BasketBallException.class)
    public void calculateCurrentBallsWeightExceptionTest() throws BasketBallException {
        arithmeticBasketBallService.calculateCurrentBallsWeight(null);
    }

    @Test
    public void calculateCurrentBallsVolumePositiveTest() {
        try {
            Ball ball1 = new Ball(5, 6, Ball.CustomColor.BLACK);
            Ball ball2 = new Ball(8, 7, Ball.CustomColor.BROWN);
            List<Ball> balls = new ArrayList<Ball>();
            balls.add(ball1);
            balls.add(ball2);
            Basket basket = new Basket(10, 10, balls);
            double actual = arithmeticBasketBallService.calculateCurrentBallsWeight(basket);
            double expected = 13;
            assertEquals(actual, expected, 0.001, "calculateCurrentBallsWeightPositiveTest failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateCurrentBallsVolumeNegativeTest() {
        try {
            Ball ball1 = new Ball(10, 10, Ball.CustomColor.WHITE);
            List<Ball> balls = new ArrayList<Ball>();
            balls.add(ball1);
            Basket basket = new Basket(10, 10, balls);
            double actual = arithmeticBasketBallService.calculateCurrentBallsWeight(basket);
            double expected = 0;
            assertNotEquals(actual, expected, 0.001, "calculateCurrentBallsWeightNegativeTest failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = BasketBallException.class)
    public void calculateCurrentBallsVolumeExceptionTest() throws BasketBallException {
        arithmeticBasketBallService.calculateCurrentBallsVolume(null);
    }

    @Test
    public void calculateTotalColorBallsPositiveTest() {
        try {
            Ball ball1 = new Ball(2, 6, Ball.CustomColor.BLACK);
            Ball ball2 = new Ball(8, 4, Ball.CustomColor.BROWN);
            Ball ball3 = new Ball(1, 1, Ball.CustomColor.BLACK);
            List<Ball> balls = new ArrayList<Ball>();
            balls.add(ball1);
            balls.add(ball2);
            balls.add(ball3);
            Basket basket = new Basket(10, 10, balls);
            int actual = arithmeticBasketBallService.calculateTotalColorBalls(basket, Ball.CustomColor.BLACK);
            int expected = 2;
            assertEquals(actual, expected, "calculateCurrentBallsWeightPositiveTest failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateTotalColorBallsNegativeTest() {
        try {
            Ball ball1 = new Ball(2, 1, Ball.CustomColor.RED);
            Ball ball2 = new Ball(6, 6, Ball.CustomColor.RED);
            Ball ball3 = new Ball(1, 1, Ball.CustomColor.RED);
            List<Ball> balls = new ArrayList<Ball>();
            balls.add(ball1);
            balls.add(ball2);
            balls.add(ball3);
            Basket basket = new Basket(10, 10, balls);
            int actual = arithmeticBasketBallService.calculateTotalColorBalls(basket, Ball.CustomColor.RED);
            int expected = 0;
            assertNotEquals(actual, expected, "calculateCurrentBallsWeightNegativeTest failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = BasketBallException.class)
    public void calculateTotalColorBallsExceptionTest() throws BasketBallException {
        arithmeticBasketBallService.calculateTotalColorBalls(null, null);
    }
}