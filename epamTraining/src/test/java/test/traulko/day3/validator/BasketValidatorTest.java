package test.traulko.day3.validator;

import com.traulko.day3.validator.BasketValidator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class BasketValidatorTest {
    BasketValidator basketValidator;

    @BeforeClass
    public void setUp() {
        basketValidator = new BasketValidator();
    }

    @AfterClass
    public void tearDown() {
        basketValidator = null;
    }

    @Test
    public void isCorrectBasketVolumePositiveTest() {
        boolean actual = basketValidator.isCorrectBasketVolume(10);
        assertTrue(actual, "isCorrectBasketVolumePositiveTest failed as...");
    }

    @Test
    public void isCorrectBasketVolumeNegativeTest() {
        boolean actual = basketValidator.isCorrectBasketVolume(-1);
        assertFalse(actual, "isCorrectBasketVolumeNegativeTest failed as...");
    }

    @Test
    public void isCorrectBasketBearingCapacityPositiveTest() {
        boolean actual = basketValidator.isCorrectBasketBearingCapacity(10);
        assertTrue(actual, "isCorrectBasketBearingCapacityPositiveTest failed as...");
    }

    @Test
    public void isCorrectBasketBearingCapacityNegativeTest() {
        boolean actual = basketValidator.isCorrectBasketBearingCapacity(-1);
        assertFalse(actual, "isCorrectBasketBearingCapacityNegativeTest failed as...");
    }
}