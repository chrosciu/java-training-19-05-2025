package eu.chrost.day5.streams;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

class ToUpperFunction implements Function<String, String> {

    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}

class IgnoringTomaszPredicate implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return !s.equals("Tomasz");
    }
}

class StreamProcessing {
    public static void main(String[] args) {
        //trzy elementy przetwarzania

        //1. budujemy strumien

        //2. definiujemy operacje jakie maja zostac zastosowane dla kazdego elementu
        //najczestsze operacje to
        //map - dokonaj transformacji na elemencie
        //filter - wyklucz wybrane elementy z dalszego przetwarzania

        //3. dopinamy operacje terminujaca definiujac co ma sie stac z elementami po przetworzeniu
        //najczesciej
        //stworz kolekcje
        //zlacz wszystkie elementy w jeden za pomoca reduce()
        //bez wykonania tej operacji strumien nie jest w ogole przetwarzany !

        List<String> names = List.of("Marcin", "Tomasz", "Paweł");

        ToUpperFunction toUpperFunction = new ToUpperFunction();
        IgnoringTomaszPredicate ignoringTomaszPredicate = new IgnoringTomaszPredicate();

        List<String> processedNames = names.stream() //budowanie strumienia -> Stream<String> - oryginalne imiona
                .filter(ignoringTomaszPredicate) //Stream<String -> juz bez imienia Tomasz
                .map(toUpperFunction) //Stream<String> -> juz z imionami upperCase
                .toList(); // -> wrzucenie do List<String>

        System.out.println(processedNames);

        List<String> processedAgainNames = names.stream()
                .filter(new Predicate<String>() {
                    //rowniez klasa anonimowa
                    @Override
                    public boolean test(String s) {
                        return !s.equals("Tomasz");
                    }
                })
                .map(new Function<String, String>() {
                    //klasa anonimowa
                    //istnieje tylko w metodzie map i po wyjsciu z niej ginie
                    //nie ma nazwy
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase();
                    }
                })
                .toList();
        System.out.println(processedAgainNames);

        String joinedNames = names.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return !s.equals("Tomasz");
                    }
                })
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase();
                    }
                }).reduce("", new BinaryOperator<String>() {
                    //ta funkcja jest wolana dla kazdego elementu strumienia
                    //accumulator - aktualny wynik
                    //element - element
                    //zwracamy nowy wynik / nowy stan akumulator
                    @Override
                    public String apply(String accumulator, String element) {
                        if (accumulator.isEmpty()) {
                            return element;
                        } else {
                            return accumulator + "," + element;
                        }
                    }
                });
        System.out.println(joinedNames);
    }
}
