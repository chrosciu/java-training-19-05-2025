package eu.chrost.day4.s1abstract.lectures;

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Meow! I do not want do say anything but if you want... " + name;
    }
}
