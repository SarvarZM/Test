package homeWork;

import java.util.Scanner;

public class TempConverter {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to convert.");

        double input= scanner.nextInt();

        System.out.println("Your Temp in C is "+(input - 32)* 5/9);


    }

}
