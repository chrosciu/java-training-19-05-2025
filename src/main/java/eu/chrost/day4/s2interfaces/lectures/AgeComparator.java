package eu.chrost.day4.s2interfaces.lectures;

import java.util.Comparator;

class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getAge() - employee2.getAge();
    }
}
