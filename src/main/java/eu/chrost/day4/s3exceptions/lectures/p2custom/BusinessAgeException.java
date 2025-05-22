package eu.chrost.day4.s3exceptions.lectures.p2custom;

class BusinessAgeException extends RuntimeException {
    public BusinessAgeException(InvalidAgeException original) {
        super(original);
    }
}
