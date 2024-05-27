// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public class Triangle extends Shape { //κληρονομει από την κλάση Shape
    public Triangle(int accessMethodForSquare) {
        super("Triangle", accessMethodForSquare); //κλήση του constructor της υπερκλάσης με τον τύπο "Triangle" και το εμβαδόν του περιβάλλοντος τετραγώνου
    }

    @Override
    public double computeArea() {
        return 0.5 * getAccessMethodForSquare(); //υπολογίζει και επιστρέφει το εμβαδόν του τριγώνου
    }
}
