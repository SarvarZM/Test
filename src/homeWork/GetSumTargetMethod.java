package homeWork;

import java.util.ArrayList;
import java.util.List;

public class GetSumTargetMethod {

    public Object [] getSum (int [] nums, int target) {

        List<Integer> uni = new ArrayList<>();
        int uniqueOrLess =0;
        int sum=0;

        for(int i = 0;i< nums.length;i++){
            sum+= nums[i];
            if(nums[i]<= target && !uni.contains(nums[i])){
               uniqueOrLess += nums[i];
               uni.add(nums[i]);
            }
        }

boolean greaterThanTarget = uniqueOrLess < target;
        if(greaterThanTarget){
            return new Object[]{uniqueOrLess,true};
        }else{
            return new Object[]{sum,false};
        }
    }
}
/*

Write a method that has two parameters with array of ints and target int. If any of the integers are less than or equals to the target number, add those numbers to each other, provided they are unique (If the number duplicate, then add only once). Compare this sum to the target number. If this sum is greater than the target number, return an array with the sum of all the unique numbers that were less than or equal to the target number as well as true. Otherwise return the sum of all the numbers in the original array argument, as well as false.
 */