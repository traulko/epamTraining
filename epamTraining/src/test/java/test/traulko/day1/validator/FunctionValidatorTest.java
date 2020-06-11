package test.traulko.day1.validator;

import com.traulko.day1.validator.FunctionValidator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FunctionValidatorTest {
    FunctionValidator functionValidator;
    @BeforeClass
    public void setUp() {
        functionValidator = new FunctionValidator();
    }

    @AfterClass
    public void tearDown() {
        functionValidator = null;
    }

    @Test
    public void isCorrectFunctionArgumentPositiveTest() {
        boolean actual = functionValidator.isCorrectFunctionArgument(1);
        assertTrue(actual, "isCorrectFunctionArgumentPositiveTest is failed as...");
    }

    @Test
    public void isCorrectFunctionArgumentNegativeTest() {
        double argument = Math.cbrt(6);
        boolean actual = functionValidator.isCorrectFunctionArgument(argument);
        assertFalse(actual, "isCorrectFunctionArgumentNegativeTest is failed as...");
    }

    @Test
    public void isCorrectFunctionValuesPositiveTest() {
        boolean actual = functionValidator.isCorrectFunctionValues(1, 5, 2);
        assertTrue(actual, "isCorrectFunctionValuesPositiveTest is failed as...");
    }

    @Test
    public void isCorrectFunctionValuesNegativeTest() {
        boolean actual = functionValidator.isCorrectFunctionValues(0, 0, 0);
        assertFalse(actual, "isCorrectFunctionValuesNegativeTest is failed as...");
    }
}