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
        Account account = accounts.get(accountNumber);

        if(account == null)
            throw new AccountNotFoundException("Account not found: " + accountNumber);

        return account;
    }
}
