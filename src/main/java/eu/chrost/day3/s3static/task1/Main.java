package eu.chrost.day3.s3static.task1;

class Main {
    public static void main(String[] args) {

        System.out.println("Counter: " + Counter.getObjectCount());

        Counter c1 = new Counter();
        System.out.println(c1);
        System.out.println("Counter: " + Counter.getObjectCount());

        Counter c2 = new Counter();
        System.out.println(c2);
        System.out.println("Counter: " + Counter.getObjectCount());

        Counter c3 = new Counter();
        System.out.println(c3);
        System.out.println("Counter: " + Counter.getObjectCount());

        Counter c4 = new Counter();
        System.out.println(c4);
        System.out.println("Counter: " + Counter.getObjectCount());

    }
}
