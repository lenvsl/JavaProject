// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class ShapeGenerator {
    private static final int[] SIZES = {1, 2, 3, 4, 8, 12, 16}; //πιθανές τιμές για το εμβαδόν του περιβάλλοντος τετραγώνου
    private List<Shape> shapes; //λίστα για αποθήκευση σχημάτων
    private Random randomNumber; //τυχαίος αριθμός για δημιουργία bonus και τυχαία αναδιάταξη
    public ShapeGenerator(int numOfShapes) { //κλάση ShapeGenerator η οποία υλοποιεί την γεννήτρια που παράγει σχήματα
        shapes = new ArrayList<>(); //αρχικοποίηση της λίστας
        //randomNumber = new Random();
        initializeShapes(numOfShapes); //κλήση της μεθόδου για αρχικοποίηση των σχημάτων
    }

    private void initializeShapes(int numOfShapes) { //μέθοδος initializeShapes που καλείται από τον constructor και γεμίζει τον πίνακα με τα σχήματα
        for (int i = 0; i < numOfShapes; i++) {
            shapes.add(new Square(getRandomSize()));
            shapes.add(new Triangle(getRandomSize()));
            shapes.add(new Pentagon(getRandomSize()));
            shapes.add(new Circle(getRandomSize()));
            shapes.add(new BonusCircle(getRandomSize(), getRandomBonus()));
        }
        Collections.shuffle(shapes);
    }

    private int getRandomSize() {
        return SIZES[randomNumber.nextInt(SIZES.length)];
    }

    private double getRandomBonus() {
        return 1 + randomNumber.nextInt(10);
    }

    public Shape nextShape() { //μέθοδος nextShape η οποία επιστρέφει ένα τυχαίο σχήμα από τον πίνακα και το αφαιρεί
        if (shapes.isEmpty()) { //έλεγχος αν η λίστα είναι άδεια
            return null;
        }
        return shapes.remove(0); //επιστροφή και αφαίρεση του πρώτου σχήματος από τη λίστα
    }

    public boolean hasShape() { //μέθοδο hasShape που επιστρέφει μια Boolean τιμή αν η γεννήτρια έχει άλλα σχήματα
        return !shapes.isEmpty(); //επιστροφή true αν η λίστα δεν είναι άδεια
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(); //δημιουργία StringBuilder για τη δημιουργία string
        for (Shape shape : shapes) {
            stringBuilder.append(shape).append("\n"); //προσθήκη κάθε σχήματος στη συμβολοσειρά ανά γραμμή
        }
        return stringBuilder.toString(); //επιστροφή της συμβολοσειράς
    }

    public static void main(String[] args) { //μέθοδος main που δημιουργεί μια γεννήτρια με 2 σχήματα ανά τύπο, και καλεί την nextShape μέχρι να τελειώσουν τα σχήματα της γεννήτριας
        ShapeGenerator shapeGenerator = new ShapeGenerator(2); //δημιουργία γεννήτριας με 2 σχήματα ανά τύπο
        while (shapeGenerator.hasShape()) {
            Shape shape = shapeGenerator.nextShape(); //λήψη του επόμενου σχήματος
            System.out.println("Epomeno schima: " + shape); //εμφάνιση του σχήματος
            System.out.println("Ypoloipa schimata sti gennitria: " + shapeGenerator); //εμφάνιση της γεννήτριας
        }
    }
}
