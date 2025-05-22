package eu.chrost.day4.s1abstract.lectures;

class AnimalShelter {
    private Animal[] animals = new Animal[0];

    public void admit(Animal animal) {
        //stworz nowa tablice o 1 wieksza niz orygialna,
        // skopiuj istniejace zwierzeta i dodaj nowe na koniec nowej tablicy
        //nastepnie przypisz nowa tablice w miejsce obecnej
        Animal[] newAnimals = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; ++i) {
            newAnimals[i] = animals[i];
        }
        newAnimals[animals.length] = animal;
        animals = newAnimals;
    }

    public void displayGreetings() {
        for (Animal animal : animals) {
            System.out.println(animal.greet());
        }
    }
}
