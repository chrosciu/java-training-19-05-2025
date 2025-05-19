package eu.chrost.day1.s2instructions.solutions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę od 1 do 7: ");
        int number = scanner.nextInt(); //tu moze byc, ale przy wczytywaniu wiecej niz 1 liczby moze sie rozsypac :)

        String kind = switch (number) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Sroda";
            case 4 -> "Czwartek";
            case 5 -> "Piatek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "wrong number ";

        };
        System.out.println(kind);

    }
}
