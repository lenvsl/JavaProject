// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShapeGenerator {
    private List<Shape> shapes;
    private static final int[] POSSIBLE_SIZES = {1, 2, 3, 4, 8, 12, 16};
    private Random random;

    public ShapeGenerator(int shapesPerType) {
        shapes = new ArrayList<>();
        random = new Random();
        initializeShapes(shapesPerType);
    }

    private void initializeShapes(int shapesPerType) {
        for (int i = 0; i < shapesPerType; i++) {
            shapes.add(new Square(getRandomSize()));
            shapes.add(new Triangle(getRandomSize()));
            shapes.add(new Pentagon(getRandomSize()));
            shapes.add(new Circle(getRandomSize()));
            shapes.add(new BonusCircle(getRandomSize(), getRandomBonus()));
        }
        Collections.shuffle(shapes);
    }

    private int getRandomSize() {
        return POSSIBLE_SIZES[random.nextInt(POSSIBLE_SIZES.length)];
    }

    private double getRandomBonus() {
        return 1 + random.nextInt(10);
    }

    public Shape nextShape() {
        if (shapes.isEmpty()) {
            return null;
        }
        return shapes.remove(0);
    }

    public boolean hasShape() {
        return !shapes.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            sb.append(shape).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ShapeGenerator generator = new ShapeGenerator(2);
        while (generator.hasShape()) {
            Shape shape = generator.nextShape();
            System.out.println("Next shape: " + shape);
            System.out.println("Remaining shapes in generator:");
            System.out.println(generator);
        }
    }
}
