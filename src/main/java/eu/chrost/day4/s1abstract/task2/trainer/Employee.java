package eu.chrost.day4.s1abstract.task2.trainer;

abstract class Employee {
    private final String name;
    protected final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public abstract void work();

    public abstract double calculateBonus();

    public void greet() {
        System.out.println("I am " + name);
    }
}
