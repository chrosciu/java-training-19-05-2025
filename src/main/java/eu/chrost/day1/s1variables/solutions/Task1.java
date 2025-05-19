package eu.chrost.day1.s1variables.solutions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź aktualny rok");
        String input = scanner.nextLine();
        int currentYear = Integer.parseInt(input);
        System.out.println("Wprowadź rok urodzenia użytkownika: ");
        String inputUserYear = scanner.nextLine();
        int userYear = Integer.parseInt(inputUserYear);
        int age = currentYear - userYear;
        System.out.println("Użytkownik ma " + age + " lat");
    }
}

