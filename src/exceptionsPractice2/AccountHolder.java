package exceptionsPractice2;

public class AccountHolder {
    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(100);

        bankAccount.makeTransaction(1);

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit(100);
        checkingAccount.makeTransaction(20000);
    }
}
