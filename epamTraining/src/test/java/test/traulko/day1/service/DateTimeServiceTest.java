package test.traulko.day1.service;

import com.traulko.day1.entity.CustomTime;
import com.traulko.day1.exception.IncorrectValueException;
import com.traulko.day1.service.DateTimeService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

public class DateTimeServiceTest {
    DateTimeService dateTimeService;

    @BeforeClass
    public void setUp() {
        dateTimeService = new DateTimeService();
    }

    @AfterClass
    public void tearDown() {
        dateTimeService = null;
    }

    @Test
    public void getCountOfDaysInMonthPositiveTest() {
        try {
            int actual = dateTimeService.getCountOfDaysInMonth(2, 2020);
            int expected = 29;
            assertEquals(actual, expected, "getCountOfDaysInMonthPositiveTest failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void getCountOfDaysInMonthNegativeTest() {
        try {
            int actual = dateTimeService.getCountOfDaysInMonth(2, 2020);
            int expected = 28;
            assertNotEquals(actual, expected, "getCountOfDaysInMonthNegativeTest failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void getCountOfDaysInMonthExceptionTest() throws IncorrectValueException {
        dateTimeService.getCountOfDaysInMonth(30, 2020);
    }

    @Test
    public void isLeapYearPositiveTest() {
        boolean actual = dateTimeService.isLeapYear(2020);
        assertTrue(actual, "isLeapYearPositiveTest failed as...");
    }

    @Test
    public void isLeapYearNegativeTest() {
        boolean actual = dateTimeService.isLeapYear(2018);
        assertFalse(actual, "isLeapYearPositiveTest failed as...");
    }

    @Test
    public void convertSecondsToTimeFormatPositiveTest() {
        try {
            CustomTime actualCustomTime = dateTimeService.convertSecondsToTimeFormat(54435);
            CustomTime expectedCustomTime = new CustomTime(15, 7, 15);
            assertEquals(actualCustomTime, expectedCustomTime,
                    "convertSecondsToTimeFormatPositiveTest failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void convertSecondsToTimeFormatNegativeTest() {
        try {
            CustomTime actualCustomTime = dateTimeService.convertSecondsToTimeFormat(3600);
            CustomTime expectedCustomTime = new CustomTime(1, 1, 1);
            assertNotEquals(actualCustomTime, expectedCustomTime,
                    "convertSecondsToTimeFormatNegativeTest failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void perfectNumberExceptionTest() throws IncorrectValueException {
        dateTimeService.convertSecondsToTimeFormat(100000);
    }
}