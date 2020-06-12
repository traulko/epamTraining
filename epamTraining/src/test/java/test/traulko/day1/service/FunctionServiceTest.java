package test.traulko.day1.service;

import com.traulko.day1.exception.IncorrectValueException;
import com.traulko.day1.service.FunctionService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

public class FunctionServiceTest {
    FunctionService functionService;

    @BeforeClass
    public void setUp() {
        functionService = new FunctionService();
    }

    @AfterClass
    public void tearDown() {
        functionService = null;
    }

    @Test
    public void calculateArithmeticFunctionPositiveTest() {
        try {
            double actual = functionService.calculateArithmeticFunction(3);
            double expected = 9;
            assertEquals(actual, expected, 0.001,
                    "calculateArithmeticFunctionPositiveTest failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateArithmeticFunctionNegativeTest() {
        try {
            double actual = functionService.calculateArithmeticFunction(0);
            double expected = 12;
            assertNotEquals(actual, expected, 0.001,
                    "calculateArithmeticFunctionNegativeTest failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void calculateArithmeticFunctionExceptionTest () throws IncorrectValueException {
        double argument = Math.cbrt(6);
        functionService.calculateArithmeticFunction(argument);
    }

    @Test
    public void calculateTangentFunctionPositiveTest() {
        try {
            Map<Double, Double> actual = functionService.calculateTangentFunction(1, 5, 2);
            Map<Double, Double> expected = new HashMap<>();
            expected.put(1.0, Math.tan(1));
            expected.put(3.0, Math.tan(3));
            expected.put(5.0, Math.tan(5));
            assertEquals(actual, expected, "calculateTangentFunctionPositiveTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateTangentFunctionNegativeTest() {
        try {
            Map<Double, Double> actual = functionService.calculateTangentFunction(1, 5, 2);
            Map<Double, Double> expected = new HashMap<>();
            expected.put(1.0, Math.tan(0));
            expected.put(3.0, Math.tan(0));
            expected.put(5.0, Math.tan(0));
            assertNotEquals(actual, expected, "calculateTangentFunctionNegativeTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void calculateTangentFunctionExceptionTest () throws IncorrectValueException {
        functionService.calculateTangentFunction(0, 0, 0);
    }
}
