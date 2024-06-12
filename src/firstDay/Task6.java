package firstDay;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lets see if you are ready to drive!");

        System.out.println("Did you pass your test? Enter true or false");

        boolean passed= scanner.hasNextBoolean();
        if (passed){
                System.out.println("How old are you?");
            int age = scanner.nextInt();
            if (age>18){
                System.out.println("Congratulations");
            }else{
                System.out.println("Your not down enough");
            }

         }
        else{
            System.out.println("Please go and study");
        }
    }
}