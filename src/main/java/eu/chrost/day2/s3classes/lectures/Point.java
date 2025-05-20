package eu.chrost.day2.s3classes.lectures;

import java.util.Objects;

public class Point {
    public double x;
    public double y;

    public void print() {
        System.out.println("Point: [x=" + x + ", y=" + y + "]");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
