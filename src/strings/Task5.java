package strings;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 4 letter word");

        String word = "";

        String input = scanner.next();

        if (input.trim().length() == 4){

            for (int i = input.length();i > 0;i--){

                word = word + input.charAt(i-1);
            }
            System.out.println(word);
        }
        else {
            System.out.println("Invalid Word");
        }
    }
}
