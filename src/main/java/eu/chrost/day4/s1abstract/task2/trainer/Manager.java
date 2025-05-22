package eu.chrost.day4.s1abstract.task2.trainer;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void work() {
        System.out.println("Managing team...");
    }

    @Override
    public double calculateBonus() {
        return salary*0.2;
    }
}
