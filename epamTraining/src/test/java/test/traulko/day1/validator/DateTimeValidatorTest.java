package test.traulko.day1.validator;

import com.traulko.day1.validator.DateTimeValidator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DateTimeValidatorTest {
    DateTimeValidator dateTimeValidator;

    @BeforeClass
    public void setUp() {
        dateTimeValidator = new DateTimeValidator();
    }

    @AfterClass
    public void tearDown() {
        dateTimeValidator = null;
    }

    @Test
    public void isCorrectMonthNumberPositiveTest() {
        boolean actual = dateTimeValidator.isCorrectMonthNumber(1);
        assertTrue(actual, "isCorrectMonthNumberPositiveTest is failed as...");
    }

    @Test
    public void isCorrectMonthNumberNegativeTest() {
        boolean actual = dateTimeValidator.isCorrectMonthNumber(0);
        assertFalse(actual, "isCorrectMonthNumberNegativeTest is failed as...");
    }

    @Test
    public void isCorrectYearNumberPositiveTest() {
        boolean actual = dateTimeValidator.isCorrectYearNumber(2020);
        assertTrue(actual, "isCorrectYearNumberPositiveTest is failed as...");
    }

    @Test
    public void isCorrectYearNumberNegativeTest() {
        boolean actual = dateTimeValidator.isCorrectYearNumber(-1);
        assertFalse(actual, "isCorrectYearNumberNegativeTest is failed as...");
    }

    @Test
    public void isCorrectCountOfSecondsPositiveTest() {
        boolean actual = dateTimeValidator.isCorrectCountOfSeconds(86400);
        assertTrue(actual, "isCorrectCountOfSecondsPositiveTest is failed as...");
    }

    @Test
    public void isCorrectCountOfSecondsNegativeTest() {
        boolean actual = dateTimeValidator.isCorrectCountOfSeconds(100000);
        assertFalse(actual, "isCorrectCountOfSecondsNegativeTest is failed as...");
    }
}