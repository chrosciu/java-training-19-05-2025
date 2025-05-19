package eu.chrost.day1.s1variables.lectures;

public class IntegerVariables {
    public static void main(String[] args) {
        int i = 123;
        System.out.println(i);

        int i1;
        //System.out.println(i1);  //nie kompiluje sie
        i1 = 123;
        System.out.println(i1);

        long l = 1;
        System.out.println(l);

        int a = 30;
        int b = 20;

        int sum = a + b;
        System.out.println(sum);

        int diff = a - b;
        System.out.println(diff);

        int product = a * b;
        System.out.println(product);

        int quotient = a / b;
        System.out.println(quotient);

        int bigA = 1_000_000;
        int bigB = 1_000_000;

        int bigProduct = bigA * bigB;
        System.out.println(bigProduct); //wartosc ujemna - przepelnienie typu

        long bigLongProduct = bigA * (long) bigB;
        System.out.println(bigLongProduct);

        int c = 3;
        long longC = c;
        System.out.println(longC);

        long d = 5;
        //int intD = d; //nie kompiluje sie - trzeba wprost dokonac rzutowania
        int intD = (int) d;




    }
}
