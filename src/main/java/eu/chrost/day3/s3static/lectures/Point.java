package eu.chrost.day3.s3static.lectures;

class Point {
    private final double x;
    private final double y;

    public static final String CLASS_NAME = "Point";

    private static int counter = 0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        ++counter;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static int getCounter() {
        return counter;
    }

    public static void foo() {
        //zadna z ponizszych rzeczy sie nie kompiluje -
        //wymagaja bowiem bycia w kontekscie konkretnego obiektu Point
//        System.out.println(x);
//        System.out.println(toString());
//        this;
    }

    public static void foo(String baz) {

    }

    public void bar() {
        System.out.println(counter);
        System.out.println(getCounter());
    }
}
