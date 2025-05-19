package eu.chrost.day1.s2instructions.lectures;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(6);

        switch (randomNumber) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Any other number");
        }

        String name = (randomNumber % 2 == 0) ? "Marcin" : "Ola";

        switch (name) {
            case "Marcin":
            case "Tomasz":
                System.out.println("Me");
                break;
            default:
                System.out.println("Any other person");
        }

        boolean isEven = (randomNumber % 2 == 0);
    }
}
