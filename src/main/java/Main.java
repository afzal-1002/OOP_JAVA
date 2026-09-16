import java.util.List;

/**
 * POLYMORPHISM DEMO ONLY -- Shape/Circle/Rectangle exist purely to
 * show one call, many behaviors. No encapsulated validation, no
 * separate interfaces mixed in.
 *
 * Compile:  javac src/main/java/*.java -d out
 * Run:      java -cp out Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("== Runtime polymorphism: one call, many behaviors ==");
        List<Shape> shapes = List.of(
            new Circle(3),
            new Rectangle(4, 5),
            new Shape()
        );

        for (Shape shape : shapes) {
            // Same line of code, different method runs depending on
            // the actual object -- decided at runtime, not compile time.
            System.out.println(shape.describe());
        }

        System.out.println();
        System.out.println("== Compile-time polymorphism: method overloading ==");
        System.out.println("add(2, 3) = " + add(2, 3));
        System.out.println("add(2.5, 3.5) = " + add(2.5, 3.5));
        System.out.println("add(1, 2, 3) = " + add(1, 2, 3));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
