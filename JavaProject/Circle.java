// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public class Circle extends Shape {
    public Circle(int boundingBoxArea) {
        super("Circle", boundingBoxArea);
    }

    @Override
    public double computeArea() {
        return 3.14 * getBoundingBoxArea() / 4;
    }
}
