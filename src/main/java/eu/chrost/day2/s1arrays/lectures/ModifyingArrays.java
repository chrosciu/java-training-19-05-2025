package eu.chrost.day2.s1arrays.lectures;

import java.util.Arrays;

public class ModifyingArrays {
    public static void main(String[] args) {
        int[] intArray = {3, 4, 7};
        int newElement = 9;

        int[] extendedArray = new int[intArray.length + 1];
        for (int i = 0; i < intArray.length; i++) {
            extendedArray[i] = intArray[i];
        }
        //System.arraycopy(intArray, 0, extendedArray, 0, intArray.length); //alternatywa do powyzszego for-a
        extendedArray[intArray.length] = newElement;

        System.out.println(Arrays.toString(extendedArray));

    }
}
