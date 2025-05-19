package eu.chrost.day1.s3loops.lectures;

public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 0;
        i++;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);

        int j = 0;
        System.out.println(j++); //wypisze wartosc 0 i podbije j do 1
        System.out.println(j); //wypisze 1
        System.out.println(++j); //podbije j do 2 i wypisze wartosc 2

        j--;
        System.out.println(j);
    }
}
