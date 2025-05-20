package eu.chrost.day2.s2methods.lectures;

public class VarArgsMethods {
    public static void main(String[] args) {
        System.out.println(sum(1, 4, 7));
        System.out.println(sum(1, 4));
        System.out.println(sum());
        System.out.println(product(1, 4, 7));
        System.out.println(product(1));
    }

    public static int sum(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static int product(int initial, int... values) {
        int product = initial;
        for (int value : values) {
            product *= value;
        }
        return product;
    }
}
