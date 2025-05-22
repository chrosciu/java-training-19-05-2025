package eu.chrost.day4.s3exceptions.lectures.p1basics;

class NullReference {
    public static void main(String[] args) {
        String s = "Marcin";
        s = null;
        int length = s.length();
    }
}
