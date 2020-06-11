package test.traulko.day1.validator;

import com.traulko.day1.validator.ArithmeticValidator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ArithmeticValidatorTest {
    ArithmeticValidator arithmeticValidator;

    @BeforeClass
    public void setUp() {
        arithmeticValidator = new ArithmeticValidator();
    }

    @AfterClass
    public void tearDown() {
        arithmeticValidator = null;
    }

    @Test
    public void isCorrectIntValueSequencePositiveTest() {
        boolean actual = arithmeticValidator.isCorrectIntValueSequence(1, 2, 3);
        assertTrue(actual, "isCorrectIntValueSequencePositiveTest is failed as...");
    }

    @Test
    public void isCorrectIntValueSequenceNegativeTest() {
        boolean actual = arithmeticValidator.isCorrectIntValueSequence(1);
        assertFalse(actual, "isCorrectIntValueSequenceNegativeTest is failed as...");
    }
}