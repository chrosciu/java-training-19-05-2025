package eu.chrost.day1.s2instructions.lectures;

import java.util.Random;

public class SwitchNew {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(6);

        switch (randomNumber) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> {
                System.out.println("Two");
                System.out.println("Other instructions");
            }
            default -> System.out.println("Any other number");
        }

        String kind = switch (randomNumber) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> {
                System.out.println("Two");
                yield "two";
            }
            default -> "other";
        };

        System.out.println(kind);
    }
}
