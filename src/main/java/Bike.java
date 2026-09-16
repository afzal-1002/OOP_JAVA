/**
 * Bike also extends Vehicle, reusing the exact same inherited
 * fields (brand, speedKmh) and methods (start(), showSpeed()) as
 * Car, with zero duplicated code between the two subclasses.
 */
public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speedKmh, boolean hasCarrier) {
        super(brand, speedKmh);
        this.hasCarrier = hasCarrier;
    }

    public void ringBell() {
        System.out.println(brand + " says: Ring ring!");
    }

    public void showCarrier() {
        System.out.println(brand + (hasCarrier ? " has" : " does not have") + " a carrier");
    }
}
