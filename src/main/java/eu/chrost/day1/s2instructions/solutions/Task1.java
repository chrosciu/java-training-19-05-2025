package eu.chrost.day1.s2instructions.solutions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wiek: ");

        String input = scanner.nextLine();
        int age = Integer.parseInt(input);


        if (age < 18) {
            System.out.println("Jesteś niepełnoletni.");
        } else if (age <= 65) {
            System.out.println("Jesteś pełnoletni.");
        } else {
            System.out.println("Jesteś seniorem.");
        }

    }
}
