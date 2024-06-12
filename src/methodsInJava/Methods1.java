package methodsInJava;

import java.util.Arrays;

public class Methods1 {
    public boolean inTheBunch(int[] nums, int number) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Methods1 method = new Methods1();
        int[] array1 = {1, 4, 8};
        int[] array2 = {1, 8, 3,5};
        int[] nums = {0, 4, 6, 7};
        System.out.println(method.inTheBunch(nums, 5));
        System.out.println(method.sameArray(array1, array2));


    }

    //Accepts two Arrays if both arrays contain the same elements
    public boolean sameArray(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    }



