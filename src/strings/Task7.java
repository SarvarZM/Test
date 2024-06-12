package strings;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String emailDB = "user@gmail.com";
        String passwordDB = "user1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Email");
        String inputE = scanner.nextLine();
        System.out.println("Enter Password");
        String inputP = scanner.next();

        if (inputE.equals(emailDB) && inputP.equals(passwordDB)) {
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong Creds");
        }
    }
}
