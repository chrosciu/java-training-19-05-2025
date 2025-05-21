package eu.chrost.day3.s1constructors.task3;

record Car(String brand, String model, int year) {

    public Car(String brand, String model) {
        this(brand, model, 2000);
    }

    public Car() {
        this("Unknown", "Unknown");
    }

    public boolean isOlderThan(int year) {
        return this.year < year;
    }
}
