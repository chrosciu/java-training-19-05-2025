package eu.chrost.day3.s3static;

class Main {
    public static void main(String[] args) {
        System.out.println(Point.getCounter());

        Point p1 = new Point(3.5, 4.5);
        System.out.println(Point.getCounter());
        System.out.println(p1.getCounter()); //dziala ale niezalecane

        Point p2 = new Point(0, 0);
        System.out.println(Point.getCounter());

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(Point.CLASS_NAME);

        System.out.println(Math.PI);

        //Weather weather = new Weather(); // nie kompiluje sie
        Weather weather = Weather.getInstance();
        Weather otherWeather = Weather.getInstance();
        System.out.println(weather == otherWeather);
    }
}
