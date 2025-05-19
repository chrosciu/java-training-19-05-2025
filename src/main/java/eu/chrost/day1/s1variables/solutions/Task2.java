package eu.chrost.day1.s1variables.solutions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wzrost uzytkownika");
        String input = scanner.nextLine();
        double wzrost = Double.parseDouble(input);
        double wzrostKwadrat = wzrost * wzrost;
        System.out.println("Wprowadź wagę uzytkownika: ");
        String inputWeight = scanner.nextLine();
        double userWeight = Double.parseDouble(inputWeight);
        double bmi = userWeight / wzrostKwadrat;
        System.out.println("BMI użytkownika to:  " + bmi);
    }
}
