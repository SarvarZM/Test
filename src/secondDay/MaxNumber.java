package secondDay;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 Numbers");
        int max;

        int num1 = scanner.nextInt();

        max=num1;

        int num2 = scanner.nextInt();
        if(max<num2){
            max=num2;
        }
        else{
            max=num1;
        }
        int num3 = scanner.nextInt();

        if (max<num3){
            max=num3;
        }
        else{
            max=max;
        }
        System.out.println("Your Max Number is "+ max);
    }

}
