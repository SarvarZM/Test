package firstDay;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lets Calculate the Perimeter and Area");
        System.out.println("Enter one side of your square");
        double side1= scanner.nextDouble();

        System.out.println("Your Area is "+(side1*side1));
        System.out.println("Your perimeter is "+(side1*4));



    }
}
