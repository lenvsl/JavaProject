// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

import java.util.Scanner;

public class ShapeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of shapes per type: ");
        int shapesPerType = scanner.nextInt();
        
        System.out.print("Enter the stack size for the player: ");
        int stackSize = scanner.nextInt();
        
        ShapeGenerator generator = new ShapeGenerator(shapesPerType);
        Player player = new Player(stackSize);
        
        while (generator.hasShape() && !player.isStackFull()) {
            player.printStack();
            Shape nextShape = generator.nextShape();
            if (nextShape != null) {
                player.playShape(nextShape);
            }
            System.out.println("Current points: " + player.getPoints());
        }
        
        System.out.println("Game over! Final points: " + player.getPoints());
    }
}
