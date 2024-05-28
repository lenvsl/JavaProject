// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

import java.util.Stack;
import java.util.Scanner;

public class Player {
    private Stack<Shape> shapeStack; //στοίβα για αποθήκευση των σχημάτων του παίχτη
    private int maxSize; //μαξ μέγεθος της στοίβας
    private double points; //πόντοι του παίχτη

    public Player(int maxSize) {
        this.maxSize = maxSize; //σρχικοποίηση του μαξ μεγέθους της στοίβας
        this.shapeStack = new Stack<>(); //αρχικοποίηση της στοίβας
        this.points = 0; //αρχικοποίηση των πόντων του παίχτη
    }

    public void playShape(Shape shape) { //μέθοδος playShape η οποία παίρνει σαν όρισμα ένα σχήμα και υλοποιεί το παιχνίδι του παίχτη για το         σχήμα
        Scanner scanner = null;
        String input = null;

        //Με το try block διαχειριζόμαστε τυχόν εξαιρέσεις
        try {
            scanner = new Scanner(System.in); //Scanner που διαβάζει από την κονσόλα αυτό που πληκτρολογεί ο χρήστης
            System.out.println("Dimiourgithike neo schima: " + shape);
            System.out.println("Thelete na diatirisete afto to schima; (y/n):");
            input = scanner.nextLine().trim().toLowerCase(); //ανάγνωση της απάντησης του χρήστη
        
        } finally {
            if (scanner != null) { //ελέγχει αν ο scanner έχει αρχικοποιηθεί
                scanner.close(); //κλείνουμε τον scanner για να απελευθερώσει πόρους, αν δεν τον κλείσουμε μπορεί να προκληθεί διαρροή μνήμης, οπότε γιαυτό χρειάζεται να τον κλείσουμε
            }
        }

        if (input.equals("y")) { //αν η απάντηση είναι "ναι"
            double shapePoints = shape.computePoints(); //υπολογισμός των πόντων του σχήματος
            if (!shapeStack.isEmpty()) { //αν η στοίβα δεν είναι άδεια
                
                Shape topOfStack = shapeStack.peek(); //παίρνουμε το σχήμα στην κορυφή της στοίβας
                
                if (shape.sameArea(topOfStack)) {  //αν το νέο σχήμα έχει το ίδιο εμβαδόν με το σχήμα στην κορυφή
                    shapePoints = shapePoints*10; //δεκαπλασιάζουμε
                }
                
                if (shape.sameType(topOfStack)) { //αν το νέο σχήμα έχει τον ίδιο τύπο με το σχήμα στην κορυφή
                    shapeStack.pop(); //αφαιρούμε το σχήμα από την κορυφή της στοίβας
                    shapePoints = shapePoints + topOfStack.computePoints(); //προσθέτουμε τους πόντους του αφαιρεμένου σχήματος
                } else {
                    shapeStack.push(shape); //προσθέτουμε το νέο σχήμα στην στοίβα
                }
            } else {
                shapeStack.push(shape); //αν η στοίβα είναι άδεια, προσθέτουμε το νέο σχήμα
            }
            points = points + shapePoints; //προσθέτουμε τους πόντους του σχήματος στους συνολικούς πόντους
            System.out.println("Kerdismenoi pontoi: " + shapePoints);
        } else {
            System.out.println("To schima aporrifthike.");
        }
    }

    public boolean isStackFull() { //μέθοδος isStackFull που ελέγχει αν γέμισε η στοίβα του παίχτη
        return shapeStack.size() >= maxSize; //επιστρέφει true αν η στοίβα έχει φτάσει το μέγιστο μέγεθος
    }

    public void printStack() { //μέθοδος printStack που εκτυπώνει την στοίβα
        System.out.println("Stoiva paikti:");
        for (Shape shape : shapeStack) { //για κάθε σχήμα στη στοίβα
            System.out.println(shape); //εμφάνιση του σχήματος
        }
    }

    public double playerPoints() { //μέθοδος πρόσβασης για τους πόντους του παίχτη
        return points;
    }
}
