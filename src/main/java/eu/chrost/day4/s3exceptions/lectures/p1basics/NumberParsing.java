package eu.chrost.day4.s3exceptions.lectures.p1basics;

class NumberParsing {
    public static void main(String[] args) {
        String s = "abc";
        try {
            int i = getIntNumberFromString(s);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("String could not be parsed");
        }
    }

    private static int getIntNumberFromString(String s) {
        try {
            System.out.println("Before parse");
            int i = Integer.parseInt(s);
            System.out.println("After parse");
            return i;
        } catch (NumberFormatException e) {
            System.out.println("Cannot parse " + s + " as a number");
            throw e;
        }
    }
}
