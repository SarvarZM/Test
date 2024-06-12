package homeWork;

import java.util.Arrays;

public class TestHwMethods {
    public static void main(String[] args) {

        GetSumTargetMethod method = new GetSumTargetMethod();
        StringSum sum = new StringSum();

        int[] nums1={5, 2, 1, -5, -7, -14, 4, 3, 3};
        int[] nums2={7, 8, 5, 1, -4, -4, 11, 6, 12, 1, 1, -12, 100};


        System.out.println(Arrays.toString(method.getSum(nums2, 10)));
    //    System.out.println(sum.getSumOfString("a12b2mn10"));
    }
}
