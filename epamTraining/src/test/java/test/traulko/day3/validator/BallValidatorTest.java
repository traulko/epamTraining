package test.traulko.day3.validator;

import com.traulko.day3.validator.BallValidator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class BallValidatorTest {
    BallValidator ballValidator;

    @BeforeClass
    public void setUp() {
        ballValidator = new BallValidator();
    }

    @AfterClass
    public void tearDown() {
        ballValidator = null;
    }

    @Test
    public void isCorrectBallRadiusPositiveTest() {
        boolean actual = ballValidator.isCorrectBallRadius(1);
        assertTrue(actual, "isCorrectBallRadiusPositiveTest failed as...");
    }

    @Test
    public void isCorrectBallRadiusNegativeTest() {
        boolean actual = ballValidator.isCorrectBallRadius(1000);
        assertFalse(actual, "isCorrectBallRadiusPositiveTest failed as...");
    }

    @Test
    public void isCorrectBallWeightPositiveTest() {
        boolean actual = ballValidator.isCorrectBallWeight(5);
        assertTrue(actual, "isCorrectBallWeightPositiveTest failed as...");
    }

    @Test
    public void isCorrectBallWeightNegativeTest() {
        boolean actual = ballValidator.isCorrectBallWeight(-1);
        assertFalse(actual, "isCorrectBallWeightNegativeTest failed as...");
    }
}