package eu.chrost.day2.s1arrays.solutions;

public class Task3 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        int[] intReverseArray = new int[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            intReverseArray[i] = intArray[intArray.length - 1 - i];
        }
        for (int i = 0; i < intReverseArray.length; i++) {
            System.out.println(intReverseArray[i]);
        }
    }
}






