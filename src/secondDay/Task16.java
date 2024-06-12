package secondDay;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a Citizen?  1 -> Yes , 2 -> No");
        int input = scanner.nextInt();


        System.out.println("Are you a Green Card Holder?  1 -> Yes , 2 -> No");
        int input2 = scanner.nextInt();

        System.out.println("Are you a H1B Visa Holder?  1 -> Yes , 2 -> No");
        int input3 = scanner.nextInt();

        if(input == 1 || input2 == 1 || input3 == 1){
            System.out.println("You're allowed to work here");
        }
        else {
            System.out.println("Please get one of the following you're not allowed to work");
        }
            }
        }