package mindTekProjectDay;

public class BankAccountTest {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount("John Doe", "Checking",123456789, 200);
        BankAccount account2 = new BankAccount("Harsh Patel", "Credit",987654321, 1455);
        BankAccount account3 = new BankAccount("Dan Fisher", "Checking",678905432, 750);
        BankAccount account4 = new BankAccount("Ivan Topol", "Credit",456782389, 245);
        BankAccount account5 = new BankAccount("Sumathi Lakka","Checking", 596676433, 521);

        BankAccount[] accounts={account1,account2,account3,account4,account5};
/*
        for(BankAccount account:accounts){
            System.out.println(account.toString());

          //  System.out.println("BankAccount{name= "+account.getName()+", accountType= "+account.getAccountType()+", accountNumber= "+account.getAccountNumber()+", balance=account.getBalance()}");
        }


        for(BankAccount account:accounts){
            if(account.getBalance()>500){
                System.out.println(account.getName());
            }

 */
        int holder=0;
        for(BankAccount account:accounts){
            if (account.getAccountType().equals("Checking"))
            holder+=account.getBalance();

        }
        System.out.println(holder);
    }
}
