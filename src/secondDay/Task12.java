package secondDay;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter 4 Numbers!");

        int num = scanner.nextInt();

        if (num % 2 == 0){
            evenSum = num;
        }
        else {
            oddSum = num;
        }
        num = scanner.nextInt();
        if (num % 2 == 0){
            evenSum = evenSum + num;
        }
        else {
            oddSum = oddSum +num;
        }
        num = scanner.nextInt();
        if (num % 2 == 0){
            evenSum = evenSum + num;
        }
        else {
            oddSum = oddSum +num;
        }
        num = scanner.nextInt();
        if (num % 2 == 0){
            evenSum = evenSum + num;
        }
        else {
            oddSum = oddSum +num;
        }
        System.out.println("Even Number Total: "+ evenSum);
        System.out.println("Odd Number Total: "+ oddSum);

    }
}
