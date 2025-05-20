package eu.chrost.day2.s1arrays.solutions;

public class Task2 {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Wymagany co najmniej 1 argument");
            return;
        }
        int[] numbersInt = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbersInt[i] = Integer.parseInt(args[i]);
        }
        int maxValue = numbersInt[0];
        for (int i = 1; i < numbersInt.length; i++){
            if (numbersInt[i] > maxValue){
                maxValue = numbersInt[i];
            }
        }
        System.out.println("Największa wartość tablicy to: " + maxValue);
    }
}
