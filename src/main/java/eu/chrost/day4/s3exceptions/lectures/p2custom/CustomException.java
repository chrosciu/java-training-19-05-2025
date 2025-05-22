package eu.chrost.day4.s3exceptions.lectures.p2custom;

class CustomException {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("Marcin", 17);
        } catch (InvalidAgeException e) {
            throw new BusinessAgeException(e);
        }
    }
}
