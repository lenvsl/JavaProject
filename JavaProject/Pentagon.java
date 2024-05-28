// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public class Pentagon extends Shape { //κληρονομει από την κλάση Shape
    public Pentagon(double accessMethodForSquare) {
        super("Pentagon", accessMethodForSquare); //κλήση του constructor της υπερκλάσης με τον τύπο "Pentagon" και το εμβαδόν του περιβάλλοντος τετραγώνου
    }

    @Override
    public double computeArea() {
        return 0.75 * getAccessMethodForSquare(); //υπολογίζει και επιστρέφει το εμβαδόν του πενταγώνου
    }
}
