package eu.chrost.day2.s2methods.lectures;

public class OverloadedMethods {
    public static void main(String[] args) {
        System.out.println(incrementValue(5, 7));
        System.out.println(incrementValue(6));
        System.out.println(incrementValue("13"));
    }

    public static int incrementValue(int value, int amount) {
        return value + amount;
    }

    public static int incrementValue(int value) {
        //return value + 1;
        return incrementValue(value, 1); //to samo co wyzej ale czesciej stosowane
    }

    public static int incrementValue(String valueAsString) {
        int value = Integer.parseInt(valueAsString);
        return incrementValue(value);
    }
}
