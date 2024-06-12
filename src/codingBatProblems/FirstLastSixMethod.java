package codingBatProblems;

public class FirstLastSixMethod {

    public boolean firstLast6(int[] nums) {

        for(int num:nums){
            if(nums[0] == 6 || nums[nums.length-1]== 6){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FirstLastSixMethod method = new FirstLastSixMethod();
        int [] nums ={6,6,1};
        System.out.println(method.firstLast6(nums));

    }

}
