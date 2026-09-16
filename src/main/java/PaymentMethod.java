/**
 * ABSTRACTION
 * -----------
 * PaymentMethod exposes WHAT any payment method can do -- pay a
 * given amount -- without exposing HOW each one actually does it.
 * Calling code below only ever talks to this contract; the network
 * calls, redirects, and other messy details stay hidden inside
 * each implementation.
 */
public interface PaymentMethod {
    void pay(double amount);
}
