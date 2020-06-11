package com.traulko.day1.service;

import com.traulko.day1.entity.CustomPoint;

public class PointService {
    public double calculateDistanceFromOrigin(int xCoordinate, int yCoordinate) {
        return Math.hypot(xCoordinate, yCoordinate);
    }

    /*
    returns -1 if point1 closest to origin; 1 if point2 closest to origin;
    0 if points are equidistant
     */
    public int getClosestToOriginPoint(CustomPoint point1, CustomPoint point2) {
        return Double.compare(point1.calculateDistanceFromOrigin(), point2.calculateDistanceFromOrigin());
    }
}
