public class Main {
    public static void main(String[] args) {
        Account debitDima = new DebitAccount("Dima", 120500);
        Account creditValentyn = new CreditAccount("Valentyn", 40000, 50000);
        Account savingRuslan = new SavingAccount("Ruslan", 5000);

        Account[] accounts = {debitDima, creditValentyn, savingRuslan};
//        for(Account account : accounts) {
//            account.showInfo();
//            account.withdraw(2500);
//            System.out.println();
//        }

        BankService bankService = new BankService();
        bankService.withdrawFromAll(accounts, 2500);


        Transferable transferableAndriy = new DebitAccount("Andriy", 300);
        transferableAndriy.transfer(creditValentyn, 100);
    }
}
