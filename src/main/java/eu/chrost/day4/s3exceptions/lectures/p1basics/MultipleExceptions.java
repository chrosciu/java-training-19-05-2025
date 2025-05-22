package eu.chrost.day4.s3exceptions.lectures.p1basics;

class MultipleExceptions {
    public static void main(String[] args) {
        System.out.println(asInteger("7"));
        System.out.println(asInteger("5"));
        System.out.println(asInteger("a"));
        System.out.println(asInteger(null));
    }

    private static int asInteger(String s) {
        try {
            if ("5".equals(s)) {
                Object o = s;
                Integer i = (Integer) o;
            }
            String trimmed = s.trim();
            return Integer.parseInt(trimmed);
        } catch (NullPointerException e) {
            System.out.println("Null passed as an argument");
        } catch (NumberFormatException e) {
            System.out.println("Non integer string passed as an argument");
        } catch (Exception e) {
            System.out.println("Another exception has been caught: ");
            e.printStackTrace();
        }
        return 0;
    }
}
