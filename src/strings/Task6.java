package strings;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password ="5689";

        System.out.println("Enter the Password");

        String input = scanner.next();

        if (input.trim().equals(password)){
            System.out.println("Door is Open");
        }
        else{
            System.out.println("Wrong password, please try again.");
        }
    }
}
