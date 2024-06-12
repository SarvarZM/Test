package firstDay;

import java.util.Scanner;

public class KMtoMiles {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Convert input into Miles");
        System.out.println("Enter a number");
        double kilometers= scanner.nextDouble();

        System.out.println("Converted to miles that is: "+kilometers*0.62137);


    }
}
