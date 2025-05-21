package eu.chrost.day3.s3static.task1;

class Counter {

    private static int objectCount;

    private final int id;

    public static int getObjectCount(){
        return objectCount;
    }

    public Counter() {
        objectCount++;
        id = objectCount;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id=" + id +
                '}';
    }


}
