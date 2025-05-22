package eu.chrost.day4.s3exceptions.lectures.p4trywithresources;

class AutoCloseableConnection implements AutoCloseable {
    public AutoCloseableConnection() {
        System.out.println("Connection opened");
    }

    @Override
    public void close() {
        System.out.println("Connection closed");
    }
}
