package eu.chrost.day1.s3loops.solutions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        int silnia = 1;

        for (int i = 1 ; i <= n ; i++) {
            silnia = silnia * i;
        }
        System.out.println("Silnia: " + silnia);
    }
}
