package eu.chrost.day1.s3loops.solutions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        String input = scanner.nextLine();
        int liczba = Integer.parseInt(input);
        int suma = 0;
        for (int i = 0; i <= liczba; i++) {
            suma = suma + i;
        }
        System.out.println("Suma " + suma);
    }
}
