package com.traulko.day3.entity;

import java.util.List;

public class Basket {
    private double volume; // unit of measure - m^3
    private double bearingCapacity;
    private List<Ball> balls;

    public Basket(double volume, double bearingCapacity, List<Ball> balls) {
        this.volume = volume;
        this.bearingCapacity = bearingCapacity;
        this.balls = balls;
    }

    public double getVolume() {
        return volume;
    }

    public double getBearingCapacity() {
        return bearingCapacity;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void add(Ball ball) {
        balls.add(ball);
    }

    public void remove(int index) {
        balls.remove(index);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.valueOf(volume).hashCode();
        result = prime * result + Double.valueOf(bearingCapacity).hashCode();
        result = prime * result + balls.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return volume == basket.volume &&
                bearingCapacity == basket.bearingCapacity &&
                balls == basket.balls;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basket{");
        sb.append("volume=").append(volume);
        sb.append(", bearingCapacity=").append(bearingCapacity);
        sb.append(", balls=").append(balls);
        sb.append('}');
        return sb.toString();
    }
}
