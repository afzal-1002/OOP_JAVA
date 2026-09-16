public class PaypalPayment implements PaymentMethod {
    private final String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        // A completely different process, still hidden behind pay()
        System.out.println("Redirecting to PayPal for " + email + "...");
        System.out.println("Paid $" + amount + " via PayPal");
    }
}
