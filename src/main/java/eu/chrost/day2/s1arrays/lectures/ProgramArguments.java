package eu.chrost.day2.s1arrays.lectures;

public class ProgramArguments {
    //Zsumuj liczby od M do N, gdzie M i N sa przekazane z zewnatrz jako argumenty
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Należy przekazac dokładnie 2 argumenty - liczby całkowite, pierwsza mniejsza bądź równa drugiej");
            return;
        }

        String firstArgument = args[0];
        String secondArgument = args[1];
        int firstNumber;
        int secondNumber;

        try {
            firstNumber = Integer.parseInt(firstArgument);
        } catch (NumberFormatException e) {
            System.out.println("Pierwszy argument nie jest liczbą całkowitą");
            return;
        }

        try {
            secondNumber = Integer.parseInt(secondArgument);
        } catch (NumberFormatException e) {
            System.out.println("Drugi argument nie jest liczbą całkowitą");
            return;
        }

        if (firstNumber > secondNumber) {
            System.out.println("Pierwsza liczba musi byc mniejsza lub równa drugiej");
            return;
        }

        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        System.out.println("Suma od: " + firstNumber + " do: " + secondNumber + " wynosi: " + sum);

    }
}
