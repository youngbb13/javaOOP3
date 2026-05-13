public class CreditAccount extends Account {
    private final double creditLimit;

    public CreditAccount(String owner, double balance, double creditLimit) {
        super(owner, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + creditLimit >= amount) {
            balance -= amount;
            System.out.println("Withdraw money " + amount);
            System.out.println("Your balance is: " + balance);
        }
        else {
            System.out.println("Credit limit exceeded");
        }
    }
}
