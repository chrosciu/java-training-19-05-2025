package eu.chrost.day1.s3loops.lectures;

import java.util.Random;

class DoWhile {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);

        do {
            System.out.println(randomNumber);
            randomNumber = new Random().nextInt(100);
        } while (randomNumber > 10);

        System.out.println("###");

        int newRandomNumber = new Random().nextInt(100);

        do {
            System.out.println(newRandomNumber);
            newRandomNumber = new Random().nextInt(100);
            if (newRandomNumber <= 10) {
                break;
            }
        } while (true);

        System.out.println("###");

        int r = new Random().nextInt(100);

        do {
            System.out.println(r);
        } while ((r = new Random().nextInt(100)) > 10);


    }
}
