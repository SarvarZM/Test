package methodsInJava;

import java.util.Arrays;

public class Methods2 {
    //Method



    //Accepts Array or Int and One Int, Sum of int[] + Int ==6
    public int [] findTarget(int[] nums, int target){
        int[]indexes= new int[3];
        for(int i= 0; i<nums.length; i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    indexes[0]=i;
                    indexes[1]=j;
                }
            }
            if(indexes[0]==0 && indexes[1]==0){
                return null;
            }
        }
        return indexes;
    }
public static void main (String [] args){
        int[] nums= {2,5,6,1};
        Methods2 methods2= new Methods2();
    System.out.println(Arrays.toString(methods2.findTarget(nums,12)));
}


}
