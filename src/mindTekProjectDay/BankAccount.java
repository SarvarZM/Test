package mindTekProjectDay;

public class BankAccount {
    private String name;
    private String accountType;
    private long accountNumber;
    private double balance;


    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public BankAccount(String name, String accountType, long accountNumber, double balance) {
        this.name = name;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
