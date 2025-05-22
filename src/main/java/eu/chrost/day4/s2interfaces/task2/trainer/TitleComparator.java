package eu.chrost.day4.s2interfaces.task2.trainer;

import java.util.Comparator;

class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        String t1 = o1.title();
        String t2 = o2.title();
        return t1.compareTo(t2);

    }
}
