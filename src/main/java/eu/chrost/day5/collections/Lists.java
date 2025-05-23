package eu.chrost.day5.collections;

import java.util.ArrayList;
import java.util.List;

class MyStringList {
    private String[] elements;

    public void add(String s) {
        //
    }

    public String elementAt(int index) {
        //
        return null;
    }
}

record Car(String name) {}

class MyCarList {
    private Car[] elements;

    public void add(Car s) {
        //
    }

    public Car elementAt(int index) {
        //
        return null;
    }
}

class OldList {
    private Object[] elements;

    public void add(Object s) {
        //
    }

    public Object elementAt(int index) {
        //
        return null;
    }
}

class NewList<T> {
    private T[] elements;

    public void add(T t) {
        //
    }

    public T elementAt(int index) {
        //
        return null;
    }
}

class Lists {
    public static void main(String[] args) {
        List oldList = new ArrayList();
        oldList.add("A");
        String s = (String) oldList.get(0);
        System.out.println(s);
        System.out.println(oldList);

        List<String> newList = new ArrayList<>();
        newList.add("A");
        //newList.add(7); //nie kompiluje sie
        String s1 = newList.get(0);
        //int i = newList.get(0); //nie kompiluje sie
        System.out.println(s1);
        System.out.println(newList);

        //mozna tak samo iterowac jak po tablicach
        for (String s2 : newList) {
            System.out.println(s2);
        }
    }
}
