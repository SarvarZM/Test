package secondDay;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int positiveSum =0;
        int negativeSum =0;

        System.out.println("Enter 3 Numbers Positive or Negative");

        int input = scanner.nextInt();

        if(input >= 0){
            positiveSum += input;
        }
        else {
            negativeSum += input;
        }
        input = scanner.nextInt();

        if(input >= 0){
            positiveSum += input;
        }
        else {
            negativeSum += input;
        }
        input = scanner.nextInt();

        if(input >= 0){
            positiveSum += input;
        }
        else {
            negativeSum += input;
        }
        System.out.println("Positive total: "+ positiveSum);
        System.out.println("Negative total: "+ negativeSum);

    }
}
