package eu.chrost.day4.s3exceptions.lectures.p2custom;

class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is invalid : " + age + " - should be at least 18");
        }
        this.name = name;
        this.age = age;
    }
}
