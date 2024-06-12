package strings;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask user to enter any word
        //Ask User to enter a letter
        //Find out if given letter is unique
        //If not print that

        System.out.println("Please type a word");

        String inputWord = scanner.next();

        System.out.println("Type a letter");

        String inputLetter = scanner.next();

        if(inputWord.toLowerCase().contains(inputLetter.toLowerCase())){
            System.out.println(" Not Unique");
        }
        else {
            System.out.println("Unique Letter");
        }

    }
}
