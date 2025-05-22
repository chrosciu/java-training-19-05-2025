package eu.chrost.day4.s1abstract.task1.trainer;

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
