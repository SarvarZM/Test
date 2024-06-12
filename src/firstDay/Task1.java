package firstDay;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        /*
        Ask user to enter 2 interger numbers
        then print the sum of numbers
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter two numbers!");

        int num1= scanner.nextInt();
        int num2= scanner.nextInt();

        System.out.println("Your total is "+(num1+num2));

        System.out.println("Your total is "+(num1*num2));



    }
}
