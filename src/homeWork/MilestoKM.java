package homeWork;

import java.util.Scanner;

public class MilestoKM {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the Miles");

        double miles = scanner.nextDouble();

        System.out.println("Your miles converted to KM is: "+ miles * 1.609344);




    }
}
