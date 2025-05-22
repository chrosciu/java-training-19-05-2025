package eu.chrost.day4.s3exceptions.lectures.p4trywithresources;

class TryWithResources {
    public static void main(String[] args) {
        try (AutoCloseableConnection autoCloseableConnection = new AutoCloseableConnection()) {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
