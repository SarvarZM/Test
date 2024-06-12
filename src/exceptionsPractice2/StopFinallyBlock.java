package exceptionsPractice2;

public class StopFinallyBlock {
    public static void main(String[] args) {

        try{
            int num =5/1;
            System.out.println(num);
            System.exit(0); // Will not allow finally to be ran.
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("In finally block");
        }

        System.out.println("After try/ catch/ Finally");
    }
}
