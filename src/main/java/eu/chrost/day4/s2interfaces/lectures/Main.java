package eu.chrost.day4.s2interfaces.lectures;

import eu.chrost.day4.s2interfaces.lectures.subpackage.NameDisplayer;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Marcin", 1000, 44);
        Employee employee2 = new Employee("Ola", 10000, 45);
        Employee employee3 = new Employee("Tomasz", 5000, 41);
        Employee employee4 = new Employee("Paweł", 3000, 38);
        Animal animal1 = new Animal("Maja", 14);
        Animal animal2 = new Animal("Maniek", 5);

        Nameable[] nameables = {employee1, employee2, animal1, animal2};
        NameDisplayer.displayNames(nameables);

        Nameable nameable = employee1;
        if (nameable instanceof Employee e) {
            System.out.println(e.getSalary());
        }

        Employee[] employees = {employee1, employee2, employee3, employee4};
        //posortuj po placy - jako domyslny sposob sortowania klasy Employee
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        //posortuj po wieku - uzyj w tym celu specjalnego Comparatora
        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(employees, ageComparator);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


}
