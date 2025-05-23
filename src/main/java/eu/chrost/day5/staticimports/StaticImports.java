package eu.chrost.day5.staticimports;

//importuje wszystkie klasy z pakietu java.util - bardzo niezalecane !
//import java.util.*;

import java.util.Optional;

import static eu.chrost.day5.staticimports.subpackage.Example.foo;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.util.Optional.of;

class StaticImports {
    public static void main(String[] args) {
        Optional<String> o1 = of("A");
        Optional<String> o2 = of("A");
        Optional<String> o3 = of("A");

        double result = sqrt(2 + pow(3, 2));
        System.out.println(result);

        foo();

    }
}
