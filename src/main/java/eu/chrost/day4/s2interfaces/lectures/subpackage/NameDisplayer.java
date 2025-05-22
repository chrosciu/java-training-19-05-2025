package eu.chrost.day4.s2interfaces.lectures.subpackage;

import eu.chrost.day4.s2interfaces.lectures.Nameable;

public class NameDisplayer {
    public static void displayNames(Nameable[] nameables) {
        for (Nameable nameable : nameables) {
            System.out.println(nameable.getName());
        }
    }
}
