package exceptionsPractice2;

public class ErrorPractice {
    public static void method (){
        System.out.println("Running Method");
        method();
    }

    public static void main(String[] args) {
        method();
    }

}
