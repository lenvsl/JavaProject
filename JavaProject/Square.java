// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public class Square extends Shape {
    public Square(int boundingBoxArea) {
        super("Square", boundingBoxArea);
    }

    @Override
    public double computeArea() {
        return getBoundingBoxArea();
    }
}
