package exceptionsPractice2;

public class BigAmountTransactionException extends RuntimeException {
    public BigAmountTransactionException(String s) {
        super(s);
    }
}
