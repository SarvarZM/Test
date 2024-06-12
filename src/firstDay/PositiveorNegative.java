package firstDay;

import java.util.Scanner;

public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number!");

        int num= scanner.nextInt();

        boolean isPositive = num > 0;
        if(isPositive){
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is Negative");
        }


    }
}
