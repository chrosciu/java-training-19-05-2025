package eu.chrost.lectures.day1.s1variables;

public class StringVariables {
    public static void main(String[] args) {
        String name = "Marcin";
        System.out.println(name);

        String surname = "Chrost";
        System.out.println(surname);

        String fullName = name + " " + surname;
        System.out.println(fullName);

        int i = 3;
        String description = "i = " + i;
        System.out.println(description);

        System.out.println("i = " + i);

        String iAsString = Integer.toString(i);
        String anotherIAsString = "" + i;

        System.out.println(iAsString);
        System.out.println(anotherIAsString);

        String s = "4";
        int sAsInt = Integer.parseInt(s);
        System.out.println(sAsInt);

        String badNumber = "a";
        //int badNumberAsInt = Integer.parseInt(badNumber); //to sie kompiluje ale rzuca wyjatek w trakcie wykonania programu
    }
}
