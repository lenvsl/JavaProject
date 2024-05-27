// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public class Triangle extends Shape {
    public Triangle(int boundingBoxArea) {
        super("Triangle", boundingBoxArea);
    }

    @Override
    public double computeArea() {
        return 0.5 * getBoundingBoxArea();
    }
}
