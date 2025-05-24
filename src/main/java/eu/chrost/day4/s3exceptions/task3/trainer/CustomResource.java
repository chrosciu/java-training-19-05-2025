package eu.chrost.day4.s3exceptions.task3.trainer;

class CustomResource implements AutoCloseable {
    public CustomResource() {
        System.out.println("CustomResource created");
    }
    @Override
    public void close() {
        System.out.println("CustomResource destroyed");
    }
    public void operation() {
        System.out.println("Wykonuję operację!");
    }
}
