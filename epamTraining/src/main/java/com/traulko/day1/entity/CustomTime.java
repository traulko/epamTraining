package com.traulko.day1.entity;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        CustomTime other = (CustomTime) o;
        return (this.hour == other.hour &&
                this.minute == other.minute && this.second == other.second);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hour;
        result = prime * result + minute;
        result = prime * result + second;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomTime{");
        sb.append("hour=").append(hour);
        sb.append(", minute=").append(minute);
        sb.append(", second=").append(second);
        sb.append('}');
        return sb.toString();
    }
}
