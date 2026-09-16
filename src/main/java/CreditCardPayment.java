public class CreditCardPayment implements PaymentMethod {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        // The caller never sees these steps -- they're hidden behind pay()
        System.out.println("Contacting card network...");
        System.out.println("Charging $" + amount + " to card ending in "
            + cardNumber.substring(cardNumber.length() - 4));
    }
}
