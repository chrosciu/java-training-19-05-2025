package eu.chrost.day5.libraries;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

class ReverseArray {
    public static void main(String[] args) {
        int[] array = {3, 7, 8, 4};
        ArrayUtils.reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
