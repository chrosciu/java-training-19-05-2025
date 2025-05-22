package eu.chrost.day4.s2interfaces.task2.trainer;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("A", 1970),
                new Book("B", 1960),
                new Book("D", 1980),
                new Book("C", 1940)
        };
        YearComparator yearComparator = new YearComparator();
        Arrays.sort(books, yearComparator);
        System.out.println("Sorted by year:");
        for (Book book : books) {
            System.out.println(book);
        }

        Comparator<Book> titleComparator = new TitleComparator();
        Arrays.sort(books, titleComparator);
        System.out.println("Sorted by title:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
