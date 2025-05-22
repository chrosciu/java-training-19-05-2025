package eu.chrost.day4.s1abstract.lectures;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Woof! My name is: " + name;
    }
}
