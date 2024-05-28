// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

import java.util.Scanner;

public class ShapeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner που διαβάζει από την κονσόλα αυτό που πληκτρολογεί ο χρήστης
        
        System.out.print("Doste ton arithmo ton schimaton ana typo: ");
        int numOfShapes = scanner.nextInt(); //διαβάζει τον αριθμό των σχημάτων ανά τύπο από τον χρήστη
        
        System.out.print("Doste to megethos stoivas: ");
        int sizeOfStack = scanner.nextInt(); //διαβάζει το μέγεθος της στοίβας από τον χρήστη
        
        ShapeGenerator generator = new ShapeGenerator(numOfShapes); //ShapeGenerator με τον αριθμό των σχημάτων ανά τύπο
        Player player = new Player(sizeOfStack); //δημιουργεί έναν νέο παίκτη με το μέγεθος της στοίβας
        
        while (generator.hasShape() && !player.isStackFull()) { //εκτελείται όσο υπάρχουν σχήματα και η στοίβα δεν είναι γεμάτη
            player.printStack(); //εκτύπωση στοίβας
            Shape nextShape = generator.nextShape(); //δημιουργεί το επόμενο σχήμα
            if (nextShape != null) { //αν το επόμενο σχήμα δεν είναι null
                player.playShape(nextShape); //ο παίκτης παίζει το σχήμα
            }
            System.out.println("Synolikoi pontoi: " + player.playerPoints());
        }
        System.out.println("Game over!!! Telikoi pontoi: " + player.playerPoints());
        scanner.close(); //κλείνουμε τον scanner για να απελευθερώσει πόρους
    }
}
