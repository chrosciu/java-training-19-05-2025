package eu.chrost.day2.s1arrays.solutions;

public class Task1 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        int sumaArray = 0;
        for (int i = 0; i < intArray.length; i++) {
            sumaArray = intArray[i] + sumaArray;
        }
        System.out.println("Suma elementów tablicy: " + sumaArray);
    }
}
