package eu.chrost.day1.s2instructions.lectures;

import java.util.Random;

public class BooleanVariables {
    public static void main(String[] args) {
        int i = 7;
//        if (i) { //nie kompiluje sie
//
//        }

        boolean aTrue = true;
        boolean aFalse = false;

        int randomNumber = new Random().nextInt(100);

        boolean isLessThan50 = randomNumber < 50;
        boolean isOdd = randomNumber % 2 == 1;

        if (isLessThan50) {
            System.out.println(randomNumber + " - is less than 50");
        }

        if (isOdd && isLessThan50) {
            System.out.println(randomNumber + " - is less than 50 and is odd");
        }

        if (isOdd || isLessThan50) {
            System.out.println(randomNumber + " - is less than 50 or is odd");
        }

        boolean isEven = !isOdd;

        if (isEven) {
            System.out.println(randomNumber + " - is even");
        }
    }
}
