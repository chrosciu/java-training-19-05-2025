package eu.chrost.day2.s3classes.task1;

class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ola";
        p1.age = 20;

        Person p2 = new Person();
        p2.name = "Mateusz";
        p2.age = 15;

        Person p3 = new Person();
        p3.name = "Ola";
        p3.age = 20;

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());

        System.out.println("p1 == p2 " + (p1 == p2));
        System.out.println("p1 == p3 " + (p1 == p3));
        System.out.println("p1.equals(p2) " + (p1.equals(p2)));
        System.out.println("p1.equals(p3) " + (p1.equals(p3)));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


        System.out.println("Ola: " + p1.isAdult());
        System.out.println("Mateusz: " + p2.isAdult());

        Person p = new Person();
        Object o = p;

        if (o instanceof Person) {
            Person person = (Person) o;
            //...
        }

        if (o instanceof Person person) {
            //person jest tu juz dostepny
            person.isAdult();
        }

        boolean isPerson = o instanceof Person;

    }
}
