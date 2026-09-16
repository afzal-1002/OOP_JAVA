/**
 * INHERITANCE
 * -----------
 * Vehicle holds the fields and behavior that every vehicle shares.
 * Car and Bike will `extends Vehicle` so they get brand, speedKmh,
 * start(), and showSpeed() for free -- no copy-pasting required.
 */
public class Vehicle {
    protected String brand;
    protected int speedKmh;

    public Vehicle(String brand, int speedKmh) {
        this.brand = brand;
        this.speedKmh = speedKmh;
    }

    public void start() {
        System.out.println(brand + " engine started");
    }

    public void showSpeed() {
        System.out.println(brand + " top speed: " + speedKmh + " km/h");
    }
}
