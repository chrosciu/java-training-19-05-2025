package eu.chrost.day2.s2methods.solutions;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(average(4, 7, 9));
        System.out.println(average());

        double average = average();
        if (Double.isNaN(average)) {
            System.out.println("NaN");
        }
    }


    public static double average(int... numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
