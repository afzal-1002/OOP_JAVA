/**
 * ABSTRACTION DEMO ONLY -- Main and checkout() only know the
 * PaymentMethod contract; they never see the credit-card network
 * calls or the PayPal redirect happening underneath. No unrelated
 * inheritance chain or encapsulated validation mixed in.
 *
 * Compile:  javac src/main/java/*.java -d out
 * Run:      java -cp out Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("== Abstraction: paying through the interface ==");
        PaymentMethod card = new CreditCardPayment("4111111111111234");
        PaymentMethod paypal = new PaypalPayment("ana@example.com");

        checkout(card, 49.99);
        System.out.println();
        checkout(paypal, 15.00);
    }

    // This method depends only on the abstraction (PaymentMethod),
    // never on a concrete implementation.
    static void checkout(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}
