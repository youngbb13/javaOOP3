public class DebitAccount extends Account implements Transferable {
    public DebitAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw money " + amount);
            System.out.println("Your balance is: " + balance);
        }
        else {
            System.out.println("Not enough money");
        }
    }

    @Override
    public void transfer(Account targetAccount, double amount) {
        if (balance >= amount) {
            System.out.println("Your balance before transfer is: " + balance);
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Transfer money " + amount);
            System.out.println("Your balance after transfer is: " + balance);
        }
        else {
            System.out.println("Not enough money");
        }
    }
}
