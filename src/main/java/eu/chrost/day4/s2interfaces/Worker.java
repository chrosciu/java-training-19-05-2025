package eu.chrost.day4.s2interfaces;

abstract class Worker {
    protected final int salary;

    public Worker(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
