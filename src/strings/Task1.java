package strings;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aCount = 0;

        System.out.println("Enter a 3 letter word");

        String input = scanner.next();

        for(int i = 0;i < input.length();i++){
            if (input.charAt(i) == 'a'){
                aCount++;
            }
        }
        System.out.println(aCount);
    }
}
