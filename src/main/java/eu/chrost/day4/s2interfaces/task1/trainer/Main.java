package eu.chrost.day4.s2interfaces.task1.trainer;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Tomek", 4);
        Student s2 = new Student("Kasia", 5);
        Student s3 = new Student("Ola", 3);
        Student s4 = new Student("Wojtek", 2);

        Student[] students = {s1,s2,s3,s4};
        Arrays.sort(students);
        for (Student student: students) {
            System.out.println(student);
        }
    }

}
