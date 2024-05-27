// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

import java.util.Scanner;

public class ShapeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Εισαγάγετε τον αριθμό των σχημάτων ανά τύπο: ");
        int shapesPerType = scanner.nextInt();
        
        System.out.print("Εισαγάγετε το μέγεθος στοίβας για τον παίκτη: ");
        int stackSize = scanner.nextInt();
        
        ShapeGenerator generator = new ShapeGenerator(shapesPerType);
        Player player = new Player(stackSize);
        
        while (generator.hasShape() && !player.isStackFull()) {
            player.printStack();
            Shape nextShape = generator.nextShape();
            if (nextShape != null) {
                player.playShape(nextShape);
            }
            System.out.println("Πόντοι μέχρι τώρα: " + player.playerPoints());
        }
        System.out.println("Game over! Final points: " + player.playerPoints());
    }
}
