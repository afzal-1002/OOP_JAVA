/**
 * ENCAPSULATION
 * -------------
 * The `balance` field is private: no code outside this class can
 * read or change it directly. The only doors in are deposit() and
 * withdraw(), and both validate the request before touching the
 * field. That is the whole idea of encapsulation -- bundle data
 * with the methods that are allowed to change it, and refuse
 * anything that would leave the object in a broken state.
 */
public class BankAccount {
    private final String owner;
    private double balance;

    public BankAccount(String owner, double openingBalance) {
        this.owner = owner;
        setBalance(openingBalance);
    }

    // Private: even other code in this class must go through
    // validation, there is no back door.
    private void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposited $" + amount + " -> balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        System.out.println("Withdrew $" + amount + " -> balance: $" + balance);
    }
}
