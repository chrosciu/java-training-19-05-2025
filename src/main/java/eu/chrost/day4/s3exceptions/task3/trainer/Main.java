package eu.chrost.day4.s3exceptions.task3.trainer;

class Main {
    public static void main(String[] args) {
        try (CustomResource customResource = new CustomResource()) {
            String s = null;
            customResource.operation();
            System.out.println(s.length()); // uncomment to throw exception
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
