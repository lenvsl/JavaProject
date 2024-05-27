// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

import java.util.Stack;
import java.util.Scanner;

public class Player {
    private Stack<Shape> shapeStack;
    private int maxSize;
    private double points;

    public Player(int maxSize) {
        this.maxSize = maxSize;
        this.shapeStack = new Stack<>();
        this.points = 0;
    }

    public void playShape(Shape shape) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("New shape generated: " + shape);
        System.out.println("Do you want to keep this shape? (yes/no): ");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.equals("yes")) {
            double shapePoints = shape.computePoints();
            if (!shapeStack.isEmpty()) {
                Shape topShape = shapeStack.peek();
                if (shape.sameArea(topShape)) {
                    shapePoints *= 10;
                }
                if (shape.sameType(topShape)) {
                    shapeStack.pop();
                    shapePoints += topShape.computePoints();
                } else {
                    shapeStack.push(shape);
                }
            } else {
                shapeStack.push(shape);
            }
            points += shapePoints;
            System.out.println("Points gained: " + shapePoints);
        } else {
            System.out.println("Shape discarded.");
        }
    }

    public boolean isStackFull() {
        return shapeStack.size() >= maxSize;
    }

    public void printStack() {
        System.out.println("Player's stack:");
        for (Shape shape : shapeStack) {
            System.out.println(shape);
        }
    }

    public double getPoints() {
        return points;
    }
}
