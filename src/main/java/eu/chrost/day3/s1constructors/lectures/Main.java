package eu.chrost.day3.s1constructors.lectures;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3.5, 4.5);
        System.out.println(p1);

        Point p2 = new Point();
        System.out.println(p2);

        //System.out.println(p1.x) // nie kompiluje sie
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        System.out.println(p1.distanceTo(p2));
        //System.out.println(p1.calculateDistance(p2)); //nie kompiluje sie


        final int x = 5;
        System.out.println(x);

        //x = 7; // nie kompiluje sie
        System.out.println(x);


        final int y;
        y = 5;
        //y = 10; // nie kompiluje sie - powtorne przypisanie

        Person person = new Person("Marcin", 44);
    }
}
