package homeWork;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a even number between 0 - 100");

        int input= scanner.nextInt();

        if(input > 0 && input < 100){
            if (input % 2 == 0){
                System.out.println("Valid");
            }
            else{
                System.out.println("Not Valid");
            }
        }
        else{
            System.out.println("Not Valid");
        }

    }
}
