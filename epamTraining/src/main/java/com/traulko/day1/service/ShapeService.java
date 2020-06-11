package com.traulko.day1.service;

import com.traulko.day1.exception.IncorrectValueException;

public class ShapeService {
    public double calculateFoursquareSide(double area) throws IncorrectValueException {
        if (area < 0) {
            throw new IncorrectValueException("Area should be > 0!");
        }
        return Math.sqrt(area);
    }

    public double calculateInscribedCircleInFoursquareRadius(double foursquareSide) throws IncorrectValueException {
        if (foursquareSide < 0) {
            throw new IncorrectValueException("Foursquare side should be > 0!");
        }
        return foursquareSide / 2;
    }

    public double calculateInscribedFoursquareInCircleDiagonal(double radius) throws IncorrectValueException {
        if (radius < 0) {
            throw new IncorrectValueException("Radius should be > 0!");
        }
        return 2 * radius;
    }

    public double calculateFoursquareSideWithDiagonal (double diagonal) throws IncorrectValueException {
        if (diagonal < 0) {
            throw new IncorrectValueException("Diagonal should be > 0!");
        }
        return diagonal / Math.sqrt(2);
    }

    public double calculateFoursquareSquare(double side) throws IncorrectValueException {
        if (side < 0) {
            throw new IncorrectValueException("Radius should be > 0!");
        }
        return Math.pow(side, 2);
    }

    public double calculateFoursquareSquareDifferenceCoefficient(double area1, double area2) throws IncorrectValueException {
        if (area1 < 0 || area2 < 0) {
            throw new IncorrectValueException("Areas should be > 0!");
        }
        return area1 == area2 ? 1 : (area1 > area2 ? area1/area2 : area2/area1);
    }

    public double calculateCircumference(double radius) throws IncorrectValueException {
        if (radius <= 0) {
            throw  new IncorrectValueException("Radius should be > 0!");
        }
        return 2 * Math.PI * radius;
    }

    public double calculateCircleSquare(double radius) throws IncorrectValueException {
        if (radius <= 0) {
            throw new IncorrectValueException("Radius should be > 0!");
        }
        return Math.PI * Math.pow(radius, 2);
    }

}
