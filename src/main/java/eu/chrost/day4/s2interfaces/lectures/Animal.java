package eu.chrost.day4.s2interfaces.lectures;

class Animal implements Nameable {
    private final String name;
    private final int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }
}
