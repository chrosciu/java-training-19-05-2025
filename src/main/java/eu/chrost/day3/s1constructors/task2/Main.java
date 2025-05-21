package eu.chrost.day3.s1constructors.task2;

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
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
