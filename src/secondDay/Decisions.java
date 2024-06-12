package secondDay;

import java.util.Scanner;

public class Decisions {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();

        if (num1%2==0){
            System.out.println("Even");

        }
        else {
            System.out.println("Odd");
        }
    }
}
/*
        How to make decisions in Java : if(){} else {}
        If(boolean){run if true} else {Run if false}
        Write Program that tells if given number is positive or negative
         */