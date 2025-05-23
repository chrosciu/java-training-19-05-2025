package eu.chrost.day5.wrappers;

import java.util.List;

class Wrappers {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 4, 7};

        //to samo ale z lista
        //List<int> intList; //nie kompiluje sie

        Long l; //long
        Boolean b; //boolean
        Double d; //double
        Integer i; //int - wyjątek

        //konwersja poprzez metody
        long l1 = 7;
        Long l2 = Long.valueOf(l1);
        long l3 = l2.longValue();

        //konwersja bezposrednia
        //boxing
        Long l4 = l1;
        //unboxing
        long l5 = l4;

        List<Integer> intList = List.of(1, 3, 4, 7);
        //UWAGA: metoda List.of tworzy liste niemodyfikowalna !!!
        //jezeli potrzebna jest lista modyfikowalna to trzeba stworzyc ArrayList<> przez konstruktor
        //i recznie pododawac elementy

        //auto unboxing dziala takze przy iteracji
        for (int i2 : intList) {
            System.out.println(i2);
        }

        //UWAGA na referencje do null-a
        Long l6 = null;
        //to wywola NullPointerException
        // long l7 = l6;

    }
}
