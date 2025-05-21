package eu.chrost.day3.s2records.lectures;

public record Point(double x, double y) {
    public Point() {
        this(0, 0);
    }

    public double distanceTo(Point p) {
        return calculateDistance(this, p);
    }

    private double calculateDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2.0) + Math.pow(p1.y - p2.y, 2.0));
    }
}
