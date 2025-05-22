package eu.chrost.day3.s3static.task3;

class Main {
    public static void main(String[] args) {
        Config config = Config.getInstance();

        System.out.println("app:" + config.getAppName());
        System.out.println("version: " + config.getVersion());
    }
}
