package test.traulko.day1.service;

import com.traulko.day1.entity.CustomPoint;
import com.traulko.day1.service.PointService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class PointServiceTest {
    PointService pointService;

    @BeforeClass
    public void setUp() {
        pointService = new PointService();
    }

    @AfterClass
    public void tearDown() {
        pointService = null;
    }

    @Test
    public void calculateDistanceFromOriginPositiveTest() {
        double actual = pointService.calculateDistanceFromOrigin(3, 4);
        double expected = 5;
        assertEquals(actual, expected, 0.001,
                "calculateDistanceFromOriginPositiveTest is failed as...");
    }

    @Test
    public void calculateDistanceFromOriginNegativeTest() {
        double actual = pointService.calculateDistanceFromOrigin(3, 4);
        double expected = -5;
        assertNotEquals(actual, expected, 0.001,
                "calculateDistanceFromOriginNegativeTest is failed as...");
    }

    @Test
    public void calculateClosestToOriginPointPositiveTest() {
        CustomPoint point1 = new CustomPoint(1, 2);
        CustomPoint point2 = new CustomPoint(2, 4);
        int actual = pointService.getClosestToOriginPoint(point1, point2);
        int expected = -1;
        assertEquals(actual, expected,
                "calculateClosestToOriginPointPositiveTest is failed as...");
    }

    @Test
    public void calculateClosestToOriginPointNegativeTest() {
        CustomPoint point1 = new CustomPoint(0, 0);
        CustomPoint point2 = new CustomPoint(0, 0);
        int actual = pointService.getClosestToOriginPoint(point1, point2);
        int expected = 1;
        assertNotEquals(actual, expected,
                "calculateClosestToOriginPointNegativeTest is failed as...");
    }
}