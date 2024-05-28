// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public class BonusCircle extends Circle { //η BonusCircle κληρονομεί από την Circle
    private double bonus; //πεδίο για το bonus

    public BonusCircle(double accessMethodForSquare, double bonus) {
        super(accessMethodForSquare); //κλήση του constructor της υπερκλάσης Circle
        this.bonus = bonus; //αρχικοποίηση του bonus
    }

    @Override
    public double computePoints() {
        return super.computePoints() + bonus; //υπολογίζει τους πόντους προσθέτοντας το bonus
    }

    @Override
    public String toString() {
        return super.toString() + " (Bonus: " + bonus + ")"; //επιστρέφει το string με τον τύπο, το εμβαδόν και το bonus
    }
}
