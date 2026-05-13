public class Main {
    public static void main(String[] args) {
        Account debitDima = new DebitAccount("Dima", 120500);
        Account creditValentyn = new CreditAccount("Valentyn", 40000, 50000);

        Account[] accounts = {debitDima, creditValentyn};
        for(Account account : accounts) {
            account.showInfo();
            account.withdraw(10000);
            System.out.println();
        }

        Transferable transferableAndriy = new DebitAccount("Andriy", 300);
        transferableAndriy.transfer(creditValentyn, 100);
    }
}
