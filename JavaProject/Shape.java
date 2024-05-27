// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public abstract class Shape {
    private String type;
    private int boundingBoxArea;

    public Shape(String type, int boundingBoxArea) {
        this.type = type;
        this.boundingBoxArea = boundingBoxArea;
    }

    public abstract double computeArea();

    public double computePoints() {
        return computeArea();
    }

    public boolean sameArea(Shape other) {
        return this.computeArea() == other.computeArea();
    }

    public boolean sameType(Shape other) {
        return this.type.equals(other.type);
    }

    @Override
    public String toString() {
        return type + ": " + computeArea();
    }

    public int getBoundingBoxArea() {
        return boundingBoxArea;
    }
}
