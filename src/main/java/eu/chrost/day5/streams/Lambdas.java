package eu.chrost.day5.streams;

import java.util.List;

class Lambdas {
    public static void main(String[] args) {
        List<String> names = List.of("Marcin", "Tomasz", "Paweł");

        List<String> processedNames = names.stream()
                //lambda - prostszy zapis implementacji interfejsu z jedna metoda
                //to co przed strzalka - reprezentuje argument / argumenty
                //po strzalce - to co ma zwrocic funkcja
                .filter(s -> !s.equals("Tomasz"))
                .map(s -> s.toUpperCase())
                .toList();
        System.out.println(processedNames);
    }
}
