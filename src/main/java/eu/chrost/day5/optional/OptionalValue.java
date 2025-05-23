package eu.chrost.day5.optional;

import java.util.Optional;
import java.util.function.Supplier;

record Car(String name) {}

class OptionalValue {
    public static void main(String[] args) {
        Optional<Car> existingCar = Optional.of(new Car("Fiat"));
        Optional<Car> nonExistingCar = Optional.empty();

        displayCar(existingCar);
        displayCar(nonExistingCar);
    }


    private static void displayCar(Optional<Car> car) {
        System.out.println(car); //dziala ale za wiele nie daje
        if (car.isPresent()) {
            Car realCar = car.get();
            System.out.println(car);
        } else {
            System.out.println("Car does not exist");
        }
        Car anotherRealCar = car.orElse(new Car("Tico"));
        System.out.println(anotherRealCar);
        Car yetAnotherCar = car.orElseThrow(new Supplier<RuntimeException>() {
            @Override
            public RuntimeException get() {
                return new RuntimeException("Car does not exists");
            }
        });
        System.out.println(yetAnotherCar);
    }
}
