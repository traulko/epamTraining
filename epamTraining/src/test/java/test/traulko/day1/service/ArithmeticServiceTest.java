package test.traulko.day1.service;

import com.traulko.day1.exception.IncorrectValueException;
import com.traulko.day1.service.ArithmeticService;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

public class ArithmeticServiceTest {
    ArithmeticService arithmeticService;

    @BeforeClass
    public void setUp() {
        arithmeticService = new ArithmeticService();
    }

    @AfterClass
    public void tearDown() {
        arithmeticService = null;
    }

    @Test
    public void calculateLastNumberDigitPositiveTest() {
        int actual = arithmeticService.calculateLastNumberDigit(29);
        int expected = 9;
        assertEquals(actual, expected, "calculateLastNumberDigitPositiveTest is failed as...");
    }

    @Test
    public void calculateLastNumberDigitNegativeTest() {
        int actual = arithmeticService.calculateLastNumberDigit(30);
        int expected = 1;
        assertNotEquals(actual, expected, "calculateLastNumberDigitNegativeTest is failed as...");
    }

    @Test
    public void calculateSquaredNumberPositiveTest() {
        int actual = arithmeticService.calculateSquaredNumber(4);
        int expected = 16;
        assertEquals(actual, expected, "calculateSquaredNumberPositiveTest is failed as...");
    }

    @Test
    public void calculateSquaredNumberNegativeTest() {
        int actual = arithmeticService.calculateSquaredNumber(4);
        int expected = 4;
        assertNotEquals(actual, expected, "calculateSquaredNumberNegativeTest is failed as...");
    }

    @Test
    public void checkTwoEvenNumbersPositiveTest() {
        try {
            boolean actual = arithmeticService.checkTwoEvenNumbers(2, 1, -6, 1);
            assertTrue(actual, "checkTwoEvenNumbersPositiveTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void checkTwoEvenNumbersNegativeTest() {
        try {
            boolean actual = arithmeticService.checkTwoEvenNumbers(1, 1, 1, 1);
            assertFalse(actual, "checkTwoEvenNumbersNegativeTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void checkTwoEvenNumbersExceptionTest() throws IncorrectValueException {
        arithmeticService.checkTwoEvenNumbers(1);
    }

    @Test
    public void checkPerfectNumberPositiveTest() {
        try {
            boolean actual = arithmeticService.checkPerfectNumber(6);
            assertTrue(actual, "checkPerfectNumberPositiveTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void checkPerfectNumberNegativeTest() {
        try {
            boolean actual = arithmeticService.checkPerfectNumber(7);
            assertFalse(actual, "checkPerfectNumberNegativeTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void perfectNumberExceptionTest() throws IncorrectValueException {
        arithmeticService.checkPerfectNumber(-1);
    }
}