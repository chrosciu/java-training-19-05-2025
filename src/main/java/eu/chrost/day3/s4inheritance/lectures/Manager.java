package eu.chrost.day3.s4inheritance.lectures;

class Manager extends Employee {
    private final String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    protected String prepareInfo() {
        return super.prepareInfo() + ", department: " + department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }

    @Override
    public void whoAmI() {
        System.out.println("I'm a manager");
    }
}
