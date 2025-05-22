package eu.chrost.day3.s4inheritance.lectures;

class Employee {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println(prepareInfo());
    }

    protected String prepareInfo() {
        return "Name: " + name + ", salary: " + salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void whoAmI() {
        System.out.println("I'm an employee");
    }
}
