package eu.chrost.lectures.day1.s1variables;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        String input = scanner.nextLine();
        int firstNumber = Integer.parseInt(input);

        System.out.println("Podaj druga liczbe: ");
        input = scanner.nextLine();
        int secondNumber = Integer.parseInt(input);

        int sum = firstNumber + secondNumber;
        System.out.println("Suma: " + sum);
    }
}
