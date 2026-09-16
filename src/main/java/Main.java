/**
 * INHERITANCE DEMO ONLY -- no interfaces, no polymorphic dispatch
 * through a shared reference type here. Just two subclasses reusing
 * a parent's fields and methods via `extends`.
 *
 * Compile:  javac src/main/java/*.java -d out
 * Run:      java -cp out Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("== Inheritance: Car extends Vehicle ==");
        Car car = new Car("Toyota", 180, 4);
        car.start();      // inherited from Vehicle
        car.showSpeed();  // inherited from Vehicle
        car.showDoors();  // Car's own method
        car.honk();        // Car's own method

        System.out.println();
        System.out.println("== Inheritance: Bike extends Vehicle ==");
        Bike bike = new Bike("Trek", 40, true);
        bike.start();        // inherited from Vehicle
        bike.showSpeed();    // inherited from Vehicle
        bike.showCarrier();  // Bike's own method
        bike.ringBell();      // Bike's own method
    }
}
