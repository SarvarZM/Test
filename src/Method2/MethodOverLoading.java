package Method2;

public class MethodOverLoading {

    public int getSum(int num1, int num2){

        return num1+num2;
    }
    public int getSum(int [] nums){
        int sum =0;
        for(int num: nums){
            sum +=num;
        }
        return sum;
    }
    public double getSum(double num1, double num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        MethodOverLoading methods = new MethodOverLoading();

        System.out.println(methods.getSum(5,10));
    }
}
