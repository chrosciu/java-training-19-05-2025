package eu.chrost.day4.s1abstract.task1.trainer;

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double height, double width) {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }
}
