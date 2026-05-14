public class BankService {
    public void withdrawFromAll(Account[] accounts, double amount) {
        for(Account account : accounts) {
            account.showInfo();
            account.withdraw(amount);
            System.out.println();
        }
    }
}
