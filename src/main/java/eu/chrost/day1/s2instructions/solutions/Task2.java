package eu.chrost.day1.s2instructions.solutions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rok: ");
        int year = scanner.nextInt();

        boolean przestepny = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (przestepny) {
            System.out.println("Rok " + year + " jest przestępny.");
        } else {
            System.out.println("Rok " + year + " nie jest przestępny.");
        }

    }
}
