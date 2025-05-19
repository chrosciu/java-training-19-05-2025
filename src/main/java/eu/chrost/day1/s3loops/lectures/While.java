package eu.chrost.day1.s3loops.lectures;

import java.util.Random;

class While {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);

        while (randomNumber >= 10) {
            System.out.println(randomNumber);
            randomNumber = new Random().nextInt(100);
        }
    }
}
