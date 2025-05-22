package eu.chrost.day4.s1abstract.task1.trainer;

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Rectangle rectangle = new Rectangle(2, 3.5);

        Shape[] shapes = {circle, rectangle};

        for (Shape shape : shapes) {
            System.out.println("Figura = " + shape.getDescription());
            System.out.println("Pole = " + shape.getArea());
        }

    }

}
