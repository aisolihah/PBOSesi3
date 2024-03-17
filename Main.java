
public class Main {
    public static void main(String[] args) {
        Account savingAccount = new SavingAccount(1000.0, 0.05);
        savingAccount.deposit(600.0);
        savingAccount.withdraw(300.0);
        System.out.println("Saldo Saving Account: " + savingAccount.getBalance());

        Account checkingAccount = new CheckingAccount(700.0, 200.0);
        checkingAccount.withdraw(600.0);
        System.out.println("Saldo Checking Account: " + checkingAccount.getBalance());

        checkingAccount.withdraw(700.0);
        System.out.println("Saldo Checking Account: " + checkingAccount.getBalance());

    }
}