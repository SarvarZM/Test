package homeWork;

import java.util.Scanner;
//Finish Later
public class MaxandMin {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int max;
        int min;


        System.out.println("Enter first number!");
        int input1= scanner.nextInt();
        max=input1;
        min=input1;

        System.out.println("Enter a second number!");
        int input2= scanner.nextInt();

        if (input2 > max){
            max=input2;
        }
        else {
            max = input1;
        }
        System.out.println("Enter third number!");
        int input3= scanner.nextInt();
        if(input3 > max){
            max = input3;
        }
        else{
            max = input2;
        }
        if (input2 < min ){
            min=input2;
            if (min > input3){
                min=input3;
            }
            else {
                min=input2;
            }
        }
        else{
            min=input1;
        }
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
    }
}
