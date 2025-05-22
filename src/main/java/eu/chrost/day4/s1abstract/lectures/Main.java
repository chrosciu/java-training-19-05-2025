package eu.chrost.day4.s1abstract.lectures;

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Maja");
        Cat cat = new Cat("Maniek");

//        System.out.println(dog.greet());
//        System.out.println(cat.greet());

        //Animal animal = new Animal("???");
        //System.out.println(animal.greet());

        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.admit(dog);
        animalShelter.admit(cat);
        animalShelter.displayGreetings();
    }
}
