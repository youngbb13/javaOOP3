import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Account debitDima = new DebitAccount("Dima", 120500);
        Account creditValentyn = new CreditAccount("Valentyn", 40000, 50000);
        Account savingRuslan = new SavingAccount("Ruslan", 5000);

        List<Account> accounts = new ArrayList<>();
        accounts.add(debitDima);
        accounts.add(creditValentyn);
        accounts.add(savingRuslan);

        BankService bankService = new BankService();
        bankService.withdrawFromAll(accounts, 2500);

        Map<String, Account> bankAccounts = new HashMap<>();
        bankAccounts.put("ACC-001", debitDima);
        bankAccounts.put("ACC-002", creditValentyn);
        bankAccounts.put("ACC-003", savingRuslan);


        try {
            Account found = bankService.findAccountByNumber(bankAccounts, "ACC-0033");
            found.showInfo();
            System.out.println();
        }
        catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }


        Transferable transferableAndriy = new DebitAccount("Andriy", 300);
        transferableAndriy.transfer(creditValentyn, 100);
    }
}
