package strings;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");

        String input = scanner.next();

        if(input.charAt(0) == input.charAt(input.length()-1)){

            System.out.println("Words starts and ends with same letter.");

        }
        else{
            System.out.println("Words starts and ends with different");
        }
    }
}
