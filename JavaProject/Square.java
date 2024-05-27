// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public class Square extends Shape { //κληρονομει από την κλάση Shape
    public Square(int accessMethodForSquare) {
        super("Square", accessMethodForSquare); //κλήση του constructor της υπερκλάσης με τον τύπο "Square" και το εμβαδόν του περιβάλλοντος τετραγώνου
    }

    @Override
    public double computeArea() {
        return getAccessMethodForSquare(); //επιστρέφει το εμβαδόν του τετραγώνου, το οποίο είναι ίσο με το εμβαδόν του περιβάλλοντος τετραγώνου
    }
}
