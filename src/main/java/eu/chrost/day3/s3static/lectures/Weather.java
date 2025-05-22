package eu.chrost.day3.s3static.lectures;

import java.util.Random;

public class Weather {
    private int temperature;

    private static Weather instance = null;

    public static Weather getInstance() {
        if (null == instance) {
            instance = new Weather();
        }
        return instance;
    }

    public int getTemperature() {
        return temperature;
    }

    private Weather() {
        this.temperature = new Random().nextInt(100);
    }
}
