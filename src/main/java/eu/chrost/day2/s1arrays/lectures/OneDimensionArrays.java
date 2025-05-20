package eu.chrost.day2.s1arrays.lectures;

import java.util.Arrays;

public class OneDimensionArrays {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[0] = 1;
        intArray[1] = 3;
        intArray[2] = 6;
        intArray[3] = 9;

        int arrayLength = intArray.length;
        System.out.println("arrayLength: " + arrayLength);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "] -> " + intArray[i]);
        }

        int anotherIntArray[] = new int[4]; //dziala ale niezalecane

        int[] predefinedArray = {3, 4, 7};

        for (int i = 0; i < predefinedArray.length; i++) {
            System.out.println("predefinedArray[" + i + "] -> " + predefinedArray[i]);
        }

        predefinedArray[1] = 6;

        for (int i = 0; i < predefinedArray.length; i++) {
            System.out.println("predefinedArray[" + i + "] -> " + predefinedArray[i]);
        }

        System.out.println("predefinedArray:");
        for (int element : predefinedArray) {
            System.out.println(element);
        }

        System.out.println(Arrays.toString(predefinedArray));

        System.out.println(predefinedArray); //uruchomi sie, ale wynik bedzie kompletnie nieczytelny
    }
}
