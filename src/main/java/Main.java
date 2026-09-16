/**
 * ENCAPSULATION DEMO ONLY -- no inheritance, no interfaces,
 * no polymorphism here. Just one class protecting its own data.
 *
 * Compile:  javac src/main/java/*.java -d out
 * Run:      java -cp out Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("== Encapsulation: BankAccount ==");
        BankAccount account = new BankAccount("Ana", 100.0);
        System.out.println(account.getOwner() + "'s starting balance: $" + account.getBalance());

        account.deposit(50);
        account.withdraw(30);

        System.out.println();
        System.out.println("== Rejected operations (validated inside the class) ==");
        try {
            account.deposit(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        try {
            account.withdraw(1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        // account.balance = -500;  // Would NOT compile: balance is private

        System.out.println();
        System.out.println("Final balance: $" + account.getBalance());
    }
}
