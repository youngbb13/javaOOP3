public class SavingAccount extends Account {
    public SavingAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance * 0.5) {
            System.out.println("Your balance before is: " + balance);
            System.out.println("You want to withdraw: " + amount);
            balance -= amount;
            System.out.println("Your balance after is: " + balance);
        }
        else {
            System.out.println("You can withdraw max 50% of balance!");
        }
    }
}
