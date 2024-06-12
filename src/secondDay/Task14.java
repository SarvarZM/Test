package secondDay;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter 3 Numbers to see the count");
        int positiveCount= 0;
        int negativeCount= 0;

        int input = scanner.nextInt();

        if(input > 0){
            positiveCount++;
        }
        else{
            negativeCount++;
        }
        input = scanner.nextInt();

        if(input > 0){
            positiveCount++;
        }
        else{
            negativeCount++;
        }
        input = scanner.nextInt();

        if(input > 0){
            positiveCount++;
        }
        else{
            negativeCount++;
        }
        System.out.println("Negative Count is: "+negativeCount);
        System.out.println("Positive"+positiveCount);

    }
}
