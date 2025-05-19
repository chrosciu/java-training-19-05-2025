package eu.chrost.day1.s1variables.lectures;

public class FloatingVariables {
    public static void main(String[] args) {
        double d = 0.5;

        //int i = 0.5; // nie kompiluje sie

        double a = 1;
        double b = 3;

        double quotient = a / b;
        System.out.println(quotient);

        double product = quotient * b;
        System.out.println(product);

        int intA = 1;
        int intB = 3;

        double quotientOfInt = (double) intA / intB;
        System.out.println(quotientOfInt);

        double quotientOfLiterals = 1 / 3;
        System.out.println(quotientOfLiterals); //0 - gdyz 1 i 3 sa traktowane jako int

        quotientOfLiterals = 1 / 3d;
        System.out.println(quotientOfLiterals); //ok - przyrostek d powoduje ze jest to double

        quotientOfLiterals = 1 / 3.0;
        System.out.println(quotientOfLiterals); //ok - podanie czesci ulamkowej tez powoduje ze to double
    }
}
