package homeWork;

import java.util.Arrays;

public class FindTargetMethod {

    public int[] findTargetNumber(int[] nums, int target) {
        int[] index = new int[nums.length];
        
        if (nums.length >= 3) {

            for (int i = 0; i < nums.length; i++){
                if (target -nums[i]>= 0){
                    target -=nums[i];
                    index[i] = nums[i];
                }
            }
/*
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length;j++) {
                    if (nums[i] + nums[j] == target) {
                        index[i] = nums[i];
                        break;
                    }
                }
            }
*/
        }
        else{
            return null;
        }
        return index;
    }

    public static void main(String[] args) {
        FindTargetMethod method = new FindTargetMethod();
        int [] numbers ={8,4,6,8};

        System.out.println(Arrays.toString(method.findTargetNumber(numbers, 22)));

    }
}
