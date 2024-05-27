// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public class Circle extends Shape { //κληρονομει από την κλάση Shape
    public Circle(int accessMethodForSquare) {
        super("Circle", accessMethodForSquare); //κλήση του constructor της υπερκλάσης με τον τύπο "Circle" και το εμβαδόν του περιβάλλοντος τετραγώνου
    }

    @Override
    public double computeArea() {
        return 3.14 * getAccessMethodForSquare() / 4; //υπολογίζει και επιστρέφει το εμβαδόν του κύκλου
    }
}
