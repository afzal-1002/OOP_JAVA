/**
 * Car extends Vehicle: it inherits brand, speedKmh, start(), and
 * showSpeed() automatically through `extends`, and super(...) reuses
 * Vehicle's constructor instead of re-assigning the fields itself.
 * It then adds its own field (doors) and its own method (honk()).
 */
public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speedKmh, int doors) {
        super(brand, speedKmh); // reuse Vehicle's constructor
        this.doors = doors;
    }

    public void honk() {
        System.out.println(brand + " says: Beep beep!");
    }

    public void showDoors() {
        System.out.println(brand + " has " + doors + " doors");
    }
}
