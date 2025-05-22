package eu.chrost.day4.s2interfaces;

class Employee extends Worker implements Comparable<Employee>, Nameable {
    private final String name;
    private final int age;

    public Employee(String name, int salary, int age) {
        super(salary);
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        //zwroc wartosc ujemna jesli pracownik ma mniejsza pensje niz ten drugi
        //zero jesli maja te sama
        //wartosc dodatnia jesli pracownik ma wieksza pensje niz ten drugi
        //w efekcie sortowanie ustawi pracownikow od najmniejszej do najwiekszej pensji
        return salary - otherEmployee.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
