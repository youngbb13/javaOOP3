import java.util.List;
import java.util.Map;

public class BankService {
    public void withdrawFromAll(List<Account> accounts, double amount) {
        for(Account account : accounts) {
            account.showInfo();
            account.withdraw(amount);
            System.out.println();
        }
    }

    public Account findAccountByNumber(Map<String, Account> accounts, String accountNumber) {
        return accounts.get(accountNumber);
    }
}
