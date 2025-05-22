package eu.chrost.day4.s2interfaces.subpackage;

import eu.chrost.day4.s2interfaces.Nameable;

public class NameDisplayer {
    public static void displayNames(Nameable[] nameables) {
        for (Nameable nameable : nameables) {
            System.out.println(nameable.getName());
        }
    }
}
