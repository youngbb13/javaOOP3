public abstract class Account {
    protected String owner;
    protected double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public void showInfo() {
        System.out.println("Owner is: " + owner);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
