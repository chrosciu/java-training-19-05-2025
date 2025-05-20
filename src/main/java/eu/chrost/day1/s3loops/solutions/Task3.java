package eu.chrost.day1.s3loops.solutions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);

        if (number > 0) {
            int sum = 0;
            int i = 1;

            while (i < number) {
                if (number % i == 0) {
                    sum += i;
                }
                ++i;
            }
            System.out.println("Suma dzielników: " + sum);
        } else {
            System.out.println("Liczba musi byc wieksza od zera");
        }
    }
}
