// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public class Pentagon extends Shape {
    public Pentagon(int boundingBoxArea) {
        super("Pentagon", boundingBoxArea);
    }

    @Override
    public double computeArea() {
        return 0.75 * getBoundingBoxArea();
    }
}
