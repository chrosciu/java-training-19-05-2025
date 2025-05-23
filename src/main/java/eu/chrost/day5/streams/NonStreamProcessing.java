package eu.chrost.day5.streams;

import java.util.ArrayList;
import java.util.List;

class NonStreamProcessing {
    public static void main(String[] args) {
        List<String> names = List.of("Marcin", "Tomasz", "Paweł");

        //wziac kazde imie z poprzedniej listy, zamienic na duze litery i dodac do nowej listy ponizej
        //[MARCIN, TOMASZ, PAWEŁ]
        //nie przetwarzaj imienia Tomasz

        List<String> namesUpperCase = new ArrayList<>();
        for (String name: names) {
            if (!name.equals("Tomasz")) {
                namesUpperCase.add(name.toUpperCase());
            }
        }
        System.out.println(namesUpperCase);

        //wez calosc polacz w jeden element, oddzielony przecinkami
        String result = "";
        for (String name: names) {
            if (!name.equals("Tomasz")) {
                result += name.toUpperCase() + ",";
            }
        }
        System.out.println(result);

        String joinedNames = names.stream()
                .filter(s -> !s.equals("Tomasz"))
                .map(s -> s.toUpperCase())
                .reduce("", (accumulator, element) -> {
                    if (accumulator.isEmpty()) {
                        return element;
                    } else {
                        return accumulator + "," + element;
                    }
                });
        System.out.println(joinedNames);
    }
}
