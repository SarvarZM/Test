package strings;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder word = new StringBuilder();

        System.out.println("Enter a 5 letter word please!");

        String input = scanner.next();

        if (input.trim().length() == 5){
            for(int i = 0;i < input.length();i++){
                if (input.charAt(i) == 'a' ||input.charAt(i) == 'e' ||  input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){
                    word.append(input.charAt(i));
                }
            }
        }
        else{
            System.out.println("Invalid Number");
        }
        if (word.length()<1){
            System.out.println("No Vowels");
        }
        System.out.println(word);
    }
}
