package eu.chrost.day2.s3classes.task1;

import java.util.Objects;

public class Person {
    public String name;
    public int age;

    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Person person)) return false;

        return age == person.age && Objects.equals(name, person.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //o -> funkcja haszujaca -> skrot

    // o1.equals(o2) -> ZAWSZE -> o1.hashCode() == o2.hashCode()

    // o1.hashCode() != o2.hashCode() -> ZAWSZE -> !o1.equals(o2)

    // o1.hashCode() == o2.hashCode() -> NIEKONIECZNIE -> o1.equals(o2)

    // !o1.equals(o2) -> NIEKONIECZNIE -> !o1.hashCode() == o2.hashCode()
}
