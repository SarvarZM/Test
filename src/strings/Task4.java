package strings;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Initials Creator
        Scanner scanner = new Scanner(System.in);
        StringBuilder initials = new StringBuilder();

        System.out.println("Please Enter Your First Name");

        String input = scanner.next();
        initials.append(input.trim().charAt(0));

        System.out.println("Please Enter Your Last Name");

        input = scanner.next();
        initials.append(input.trim().charAt(0));

        System.out.println(initials);





    }
}
