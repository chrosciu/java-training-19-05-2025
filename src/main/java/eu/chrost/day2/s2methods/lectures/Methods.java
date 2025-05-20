package eu.chrost.day2.s2methods.lectures;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int[] intArray = {3, 4, 7};
        displayIntArray(intArray);

        int newElement = 9;
        int[] extendedArray = appendToArray(intArray, newElement);
        displayIntArray(extendedArray);

        displayIntArray(appendToArray(extendedArray, 12));

        int[] emptyArray = {};
        displayIntArray(appendToArray(emptyArray, 13));
    }

    public static int[] appendToArray(int[] existingArray, int elementToAppend) {
        if (existingArray.length == 0) {
            return new int[]{elementToAppend};
        }
        int[] newArray = new int[existingArray.length + 1];
        for (int i = 0; i < existingArray.length; i++) {
            newArray[i] = existingArray[i];
        }
        newArray[existingArray.length] = elementToAppend;
        return newArray;
    }

    public static void displayIntArray(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
    }
}
