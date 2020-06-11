package test.traulko.day1.service;

import com.traulko.day1.exception.IncorrectValueException;
import com.traulko.day1.service.ShapeService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

public class ShapeServiceTest {
    ShapeService shapeService;

    @BeforeClass
    public void setUp() {
        shapeService = new ShapeService();
    }

    @AfterClass
    public void tearDown() {
        shapeService = null;
    }

    @Test
    public void calculateFoursquareSidePositiveTest() {
        try {
            double actual = shapeService.calculateFoursquareSide(16);
            double expected = 4;
            assertEquals(actual, expected, 0.001,
                    "calculateFoursquareSidePositiveTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateFoursquareSideNegativeTest() {
        try {
            double actual = shapeService.calculateFoursquareSide(25);
            double expected = 0;
            assertNotEquals(actual, expected, 0.001,
                    "calculateFoursquareSideNegativeTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void calculateFoursquareSideExceptionTest() throws IncorrectValueException {
        shapeService.calculateFoursquareSide(-1);
    }

    @Test
    public void calculateInscribedCircleInFoursquareRadiusPositiveTest() {
        try {
            double actual = shapeService.calculateInscribedCircleInFoursquareRadius(105.3);
            double expected = 52.65;
            assertEquals(actual, expected, 0.001,
                    "calculateInscribedCircleInFoursquareRadiusPositiveTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateInscribedCircleInFoursquareRadiusNegativeTest() {
        try {
            double actual = shapeService.calculateInscribedCircleInFoursquareRadius(20);
            double expected = 20;
            assertNotEquals(actual, expected, 0.001,
                    "calculateInscribedCircleInFoursquareRadiusNegativeTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void calculateInscribedCircleInFoursquareRadiusExceptionTest() throws IncorrectValueException {
        shapeService.calculateInscribedCircleInFoursquareRadius(-1);
    }

    @Test
    public void calculateInscribedFoursquareInCircleDiagonalPositiveTest() {
        try {
            double actual = shapeService.calculateInscribedFoursquareInCircleDiagonal(16);
            double expected = 32;
            assertEquals(actual, expected, 0.001,
                    "calculateInscribedFoursquareInCircleDiagonalPositiveTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateInscribedFoursquareInCircleDiagonalNegativeTest() {
        try {
            double actual = shapeService.calculateInscribedFoursquareInCircleDiagonal(16);
            double expected = 0;
            assertNotEquals(actual, expected, 0.001,
                    "calculateInscribedFoursquareInCircleDiagonalNegativeTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void inscribedFoursquareInCircleDiagonalExceptionTest() throws IncorrectValueException {
        shapeService.calculateInscribedFoursquareInCircleDiagonal(-1);
    }

    @Test
    public void calculateFoursquareSideWithDiagonalPositiveTest() {
        try {
            double actual = shapeService.calculateFoursquareSideWithDiagonal(5.65);
            double expected = 4;
            assertEquals(actual, expected, 0.01,
                    "calculateFoursquareSideWithDiagonalPositiveTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateFoursquareSideWithDiagonalNegativeTest() {
        try {
            double actual = shapeService.calculateFoursquareSideWithDiagonal(5.65);
            double expected = 0;
            assertNotEquals(actual, expected, 0.01,
                    "calculateFoursquareSideWithDiagonalNegativeTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void testFoursquareSideWithDiagonalException() throws IncorrectValueException {
        shapeService.calculateFoursquareSideWithDiagonal(-1);
    }

    @Test
    public void calculateFoursquareSquarePositiveTest() {
        try {
            double actual = shapeService.calculateFoursquareSquare(5);
            double expected = 25;
            assertEquals(actual, expected, 0.001,
                    "calculateFoursquareSquarePositiveTest failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateFoursquareSquareNegativeTest() {
        try {
            double actual = shapeService.calculateFoursquareSquare(5);
            double expected = 0;
            assertNotEquals(actual, expected, 0.001,
                    "calculateFoursquareSquareNegativeTest failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void calculateFoursquareSquareExceptionTest() throws IncorrectValueException {
        shapeService.calculateFoursquareSquare(-1);
    }

    @Test
    public void calculateFoursquareSquareDifferenceCoefficientPositiveTest() {
        try {
            double actual = shapeService.calculateFoursquareSquareDifferenceCoefficient(3, 6);
            double expected = 2;
            assertEquals(actual, expected, 0.001,
                    "calculateFoursquareSquareDifferenceCoefficientPositiveTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateFoursquareSquareDifferenceCoefficientNegativeTest() {
        try {
            double actual = shapeService.calculateFoursquareSquareDifferenceCoefficient(3, 6);
            double expected = 0;
            assertNotEquals(actual, expected, 0.001,
                    "calculateFoursquareSquareDifferenceCoefficientNegativeTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void calculateFoursquareSquareDifferenceCoefficientExceptionTest() throws IncorrectValueException {
        shapeService.calculateFoursquareSquareDifferenceCoefficient(-1, 10);
    }

    @Test
    public void calculateCircumferencePositiveTest() {
        try {
            double actual = shapeService.calculateCircumference(1);
            double expected = 6.283;
            assertEquals(actual, expected, 0.001,
                    "calculateCircumferencePositiveTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateCircumferenceNegativeTest() {
        try {
            double actual = shapeService.calculateCircumference(1);
            double expected = 0;
            assertNotEquals(actual, expected, 0.001,
                    "calculateCircumferenceNegativeTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void calculateCircumferenceExceptionTest() throws IncorrectValueException {
        shapeService.calculateCircumference(-1);
    }

    @Test
    public void calculateCircleSquarePositiveTest() {
        try {
            double actual = shapeService.calculateCircleSquare(3.5);
            double expected = 38.484;
            assertEquals(actual, expected, 0.001,
                    "calculateCircleSquarePositiveTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateCircleSquareNegativeTest() {
        try {
            double actual = shapeService.calculateCircleSquare(3.5);
            double expected = 0;
            assertNotEquals(actual, expected, 0.001,
                    "calculateCircleSquareNegativeTest is failed as...");
        } catch (IncorrectValueException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = IncorrectValueException.class)
    public void calculateCircleSquareExceptionTest() throws IncorrectValueException {
        shapeService.calculateCircleSquare(-1);
    }
}