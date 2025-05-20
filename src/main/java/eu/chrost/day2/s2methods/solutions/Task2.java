package eu.chrost.day2.s2methods.solutions;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(7));
        System.out.println(isPerfect(-1));
        System.out.println(isPerfect(6, true));
        System.out.println(isPerfect(6, false));
    }

    public static boolean isPerfect(int n, boolean verbose) {
        if (n <= 0) {
            return false;
        }
        int sumaDzielnikow = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                if (verbose) {
                    System.out.println("Znaleziony dzielnik: " + i);
                }
                sumaDzielnikow += i;
            }
        }
        if (sumaDzielnikow == n) {
            return true;
        }
        return false;
    }

    public static boolean isPerfect(int n) {
        return isPerfect(n, false);
    }
}
