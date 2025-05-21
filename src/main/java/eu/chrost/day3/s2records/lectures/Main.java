package eu.chrost.day3.s2records.lectures;

//import eu.chrost.day3.s1constructors.lectures.Person; //nie kompiluje sie - brak widocznosci klasy

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3.5, 4.5);
        Point p2 = new Point();
        Point p3 = new Point(3.5, 4.5);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        System.out.println(p1.x());
        System.out.println(p1.y());

        System.out.println(p1.distanceTo(p2));

        //Person person = new Person("Marcin", 44); //nie kompiluje sie
    }
}
