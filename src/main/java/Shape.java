/**
 * POLYMORPHISM
 * ------------
 * Polymorphism needs a common type to call through. Shape provides
 * one method, area(), that every subclass below overrides with its
 * own math. Calling code will hold a Shape reference and never
 * know (or need to know) which subclass is actually running.
 */
public class Shape {
    public double area() {
        return 0.0;
    }

    public String describe() {
        return "A generic shape with area " + area();
    }
}
