package eu.chrost.day4.s2interfaces.task1.trainer;

class Student implements Comparable<Student> {
    private final String name;
    private final int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        if (this.grade < o.grade) {
            return 1;
        } else if (this.grade == o.grade) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

