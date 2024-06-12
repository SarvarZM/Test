package exceptionsPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsPractice2 {
    public static void main(String[] args) {

        boolean isException = false;
        do {
            try{
                Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 2 numbers!");

                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();

                int result = num1 / num2;

                System.out.println("Division of two numbers: " + result);
                isException =false;
            } catch (ArithmeticException | InputMismatchException exception) {
                System.out.println(exception.getMessage());
                isException =true;
            }
        }while(isException);
    }
}
