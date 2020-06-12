package com.traulko.day1.entity;

import com.traulko.day1.service.PointService;

public class CustomPoint {
    private int xCoordinate;
    private int yCoordinate;

    public CustomPoint(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistanceFromOrigin() {
        PointService pointService = new PointService();
        return pointService.calculateDistanceFromOrigin(xCoordinate, yCoordinate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (this.getClass() != o.getClass() || o == null) {
            return false;
        }
        CustomPoint other = (CustomPoint) o;
        return (this.xCoordinate == other.xCoordinate &&
                this.yCoordinate == other.yCoordinate);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + xCoordinate;
        result = prime * result + yCoordinate;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomPoint{");
        sb.append("xCoordinate=").append(xCoordinate);
        sb.append(", yCoordinate=").append(yCoordinate);
        sb.append('}');
        return sb.toString();
    }
}
