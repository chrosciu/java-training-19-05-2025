package eu.chrost.day4.s1abstract.task2.trainer;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Coding...");
    }

    @Override
    public double calculateBonus() {
        return salary*0.1;
    }
}
