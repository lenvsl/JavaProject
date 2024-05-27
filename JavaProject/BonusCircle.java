// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public class BonusCircle extends Circle {
    private double bonus;

    public BonusCircle(int boundingBoxArea, double bonus) {
        super(boundingBoxArea);
        this.bonus = bonus;
    }

    @Override
    public double computePoints() {
        return super.computePoints() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " (Bonus: " + bonus + ")";
    }
}
