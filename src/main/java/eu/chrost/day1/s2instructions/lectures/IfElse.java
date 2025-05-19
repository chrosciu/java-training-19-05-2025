package eu.chrost.day1.s2instructions.lectures;

import java.util.Random;

public class IfElse {
    public static void main(String[] args) {
        String message = "Genrating randoms";
        int randomNumber = new Random().nextInt(100);
        if (randomNumber < 50) {
            System.out.println(randomNumber + " is less than 50");
        } else {
            System.out.println(randomNumber + " is equal or more than 50");
        }

        if (randomNumber % 2 == 0) System.out.println(randomNumber + " is even");
        System.out.println("This will be always executed");

        if (randomNumber % 2 != 0)
            System.out.println(randomNumber + " is odd");
        System.out.println("This will be always executed");

        if (randomNumber < 30) {
            System.out.println(message);
            String s = "Less than 30";
            System.out.println(s);
        } else if (randomNumber < 60) {
            //System.out.println(s); //nie kompiluje sie
            System.out.println("Between 30 and 60");
        } else {
            System.out.println("Above 60");
        }


        //System.out.println(s); //jak wyzej
    }
}
