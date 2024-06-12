package firstDay;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        System.out.println("What is your name?");

        String name= scanner.next();

        System.out.println("My Name is "+ name);

        System.out.println("How old are you?");

        int age=scanner.nextInt();

        System.out.println("I am "+age+" years old.");





    }
}
