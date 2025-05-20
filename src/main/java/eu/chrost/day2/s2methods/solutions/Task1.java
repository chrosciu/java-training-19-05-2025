package eu.chrost.day2.s2methods.solutions;

public class Task1 {
    public static void main(String[] args) {
        System.out.println ("Suma: " + add(1, 5));
        System.out.println ("Suma: " + add(1.5, 5.4));
    }

    public static int add(int liczba1, int liczba2) {
        int add = 0;
        add = liczba1 + liczba2;
        return add;
    }
    public static double add(double liczba1, double liczba2) {
        double add = 0;
        add = liczba1 + liczba2;
        return add;
    }

}
