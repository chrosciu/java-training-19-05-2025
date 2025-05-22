package eu.chrost.day3.s3static.task3;

class Config {
    private static Config instance;

    private Config() {
    }

    private static final String APP_NAME = "MyApp";
    private static final String VERSION = "1.0.0";

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getAppName() {
        return APP_NAME;
    }

    public String getVersion() {
        return VERSION;
    }
}
