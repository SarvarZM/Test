package secondDay;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter 4 numbers!");
        int sum;

        int num = scanner.nextInt();
        sum = num;

        num = scanner.nextInt();
        sum = sum + num;

        num = scanner.nextInt();
        sum = sum + num;

        num = scanner.nextInt();
        sum = sum +num;

        System.out.println("Your total is: "+ sum);
    }
}
