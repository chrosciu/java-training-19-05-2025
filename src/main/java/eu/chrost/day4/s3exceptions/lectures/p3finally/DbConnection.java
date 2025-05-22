package eu.chrost.day4.s3exceptions.lectures.p3finally;

class DbConnection {
    public static void open() {
        System.out.println("Connection opened");
    }

    public static void close() {
        System.out.println("Connection closed");
    }
}
