package eu.chrost.day3.s1constructors.task2;

public class Car {
    private final String brand;
    private final String model;
    private final int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 2000;
    }

    public Car() {
        this("Unknown", "Unknown", 2000);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", year=" + year + '}';
    }

    public boolean isOlderThan(int year) {
        return this.year < year;
    }

}
