package eu.chrost.day4.s1abstract.task1.trainer;

abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract public double getArea();

    public String getDescription() {
        return "Shape: " + name;
    }
}
