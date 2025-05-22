package eu.chrost.day4.s1abstract.task2.trainer;

class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Developer 1", 1500),
                new Developer("Developer 2", 1600),
                new Developer("Developer 3", 1700),
                new Manager("Manager 1", 2500),
                new Manager("Manager 2", 2650),
                new Manager("Manager 3", 2770)
        };

        for (Employee employee : employees) {
            employee.work();
            employee.greet();
            System.out.println(employee.calculateBonus());
        }
    }
}
