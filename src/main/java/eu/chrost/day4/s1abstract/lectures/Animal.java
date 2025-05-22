package eu.chrost.day4.s1abstract.lectures;

abstract public class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public String greet();
}
