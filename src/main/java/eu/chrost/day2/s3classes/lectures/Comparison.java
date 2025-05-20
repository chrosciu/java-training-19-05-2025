package eu.chrost.day2.s3classes.lectures;

public class Comparison {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        System.out.println("x == y -> " + (x == y));

        Point p1 = new Point();
        p1.x = 3.5;
        p1.y = 4.5;

        Point p2 = new Point();
        p2.x = 3.5;
        p2.y = 4.5;

        System.out.println("p1 == p2 -> " + (p1 == p2));

        System.out.println("p1.equals(p2) -> " + (p1.equals(p2)));

        Point p3 = p1;

        System.out.println("p1 == p3 -> " + (p1 == p3));

        String s1 = new String("Marcin");
        String s2 = new String("Marcin");

        System.out.println("s1 == s2 -> " + (s1 == s2));

        System.out.println("s1.equals(s2) -> " + (s1.equals(s2)));

        String s3 = "Marcin";
        String s4 = "Marcin";

        System.out.println("s3 == s4 -> " + (s3 == s4));

    }
}
