package com.traulko.day3.entity;

public class Ball {
    private double volume;
    private double weight;
    private CustomColor customColor;

    public Ball(double volume, double weight, CustomColor customColor) {
        this.volume = volume;
        this.weight = weight;
        this.customColor = customColor;
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public CustomColor getCustomColor() {
        return customColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return volume == ball.volume &&
                weight == ball.weight &&
                customColor == ball.customColor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.valueOf(volume).hashCode();
        result = prime * result + Double.valueOf(weight).hashCode();
        result = prime * result + customColor.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("radius=").append(volume);
        sb.append(", weight=").append(weight);
        sb.append(", customColor=").append(customColor);
        sb.append('}');
        return sb.toString();
    }

    public enum CustomColor {
        WHITE(0), BLACK(1), YELLOW(2), ORANGE(3), BLUE(4),
        GREEN(5), RED(6), PURPLE(7), GRAY(8), BROWN(9);

        private final int colorNumber;

        CustomColor(int colorNumber) {
            this.colorNumber = colorNumber;
        }

        public int getColorNumber() {
            return colorNumber;
        }
    }
}
