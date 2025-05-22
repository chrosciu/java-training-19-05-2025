package eu.chrost.day4.s2interfaces.task2.trainer;

import java.util.Comparator;

class YearComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.year() - o2.year();
    }
}
