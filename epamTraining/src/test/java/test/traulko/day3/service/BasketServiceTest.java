package test.traulko.day3.service;

import com.traulko.day3.entity.Ball;
import com.traulko.day3.entity.Basket;
import com.traulko.day3.exception.BasketBallException;
import com.traulko.day3.service.BasketService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

public class BasketServiceTest {
    BasketService basketService;

    @BeforeClass
    public void setUp() {
        basketService = new BasketService();
    }

    @AfterClass
    public void tearDown() {
        basketService = null;
    }

    @Test
    public void addBallToBasketPositiveTest() {
        try {
            Ball ball = new Ball(1, 2, Ball.CustomColor.RED);
            List<Ball> balls = new ArrayList<>();
            balls.add(ball);
            Basket basket = new Basket(10, 10, balls);
            boolean actual = basketService.addBallToBasket(basket, ball);
            assertTrue(actual, "addBallToBasketPositiveTest failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void addBallToBasketNegativeTest() {
        try {
            Ball ball = new Ball(10, 10, Ball.CustomColor.RED);
            List<Ball> balls = new ArrayList<>();
            balls.add(ball);
            Basket basket = new Basket(10, 10, balls);
            boolean actual = basketService.addBallToBasket(basket, ball);
            assertFalse(actual, "addBallToBasketNegativeTest failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = BasketBallException.class)
    public void addBallToBasketExceptionTest() throws BasketBallException {
        basketService.addBallToBasket(null, null);
    }

    @Test
    public void removeBallFromBasketPositiveTest() {
        try {
            Ball ball = new Ball(10, 10, Ball.CustomColor.RED);
            List<Ball> balls = new ArrayList<>();
            balls.add(ball);
            Basket basket = new Basket(10, 10, balls);
            boolean actual = basketService.removeBallFromBasket(basket, 0);
            assertTrue(actual, "removeBallFromBasketPositiveTest is failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void removeBallFromBasketNegativeTest() {
        try {
            List<Ball> balls = new ArrayList<>();
            Basket basket = new Basket(10, 10, balls);
            boolean actual = basketService.removeBallFromBasket(basket, 0);
            assertFalse(actual, "removeBallFromBasketNegativeTest is failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = BasketBallException.class)
    public void removeBallFromBasketExceptionTest() throws BasketBallException {
        basketService.removeBallFromBasket(null, 5);
    }

    @Test
    public void isSuitableBallToBasketPositiveTest() {
        try {
            Basket basket = new Basket(12, 12, new ArrayList<>());
            Ball ball = new Ball(5, 5, Ball.CustomColor.GRAY);
            boolean actual = basketService.isSuitableBallToBasket(basket, ball);
            assertTrue(actual, "isSuitableBallToBasketPositiveTest failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void isSuitableBallToBasketNegativeTest() {
        try {
            Basket basket = new Basket(1, 1, new ArrayList<>());
            Ball ball = new Ball(100, 100, Ball.CustomColor.GRAY);
            boolean actual = basketService.isSuitableBallToBasket(basket, ball);
            assertFalse(actual, "isSuitableBallToBasketNegativeTest failed as...");
        } catch (BasketBallException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = BasketBallException.class)
    public void isSuitableBallToBasketExceptionTest() throws BasketBallException {
        basketService.isSuitableBallToBasket(null, null);
    }
}