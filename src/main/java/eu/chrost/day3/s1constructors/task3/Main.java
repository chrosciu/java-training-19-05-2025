package eu.chrost.day3.s1constructors.task3;

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Peugeot", "308");
        Car car3 = new Car("Peugeot", "3008", 2010);
        System.out.println("Samochody: ");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car3.isOlderThan(2009));
        displayCarProperties(car1);
    }

    private static void displayCarProperties(Car car) {
        System.out.println(car.brand());
        System.out.println(car.model());
        System.out.println(car.year());
    }
}
