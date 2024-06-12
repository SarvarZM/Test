package exceptionsPractice2;

public class CheckingAccount extends BankAccount{
    @Override
    public void makeTransaction(int amount) throws InsufficientFundsException {
        if(amount < 20000){
            if(balance>=amount){
                balance-=amount;
            }else{
                throw new InsufficientFundsException("Not enough balance");
            }

        }else{
            throw new BigAmountTransactionException("Account is locked, call the bank.");
        }
    }
}
