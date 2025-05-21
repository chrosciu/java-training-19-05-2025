package eu.chrost.day2.s3classes.task2;

import java.util.Objects;

public class Rectangle {
    public double length;
    public double width;
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return (2*length) + (2*width);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
