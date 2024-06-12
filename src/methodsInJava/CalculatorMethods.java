package methodsInJava;

public class CalculatorMethods {
//Access modifier, return data type, method name, Parameters
    public int getSum(int num1, int num2){
        int sum= num1 + num2;
        return sum;//Return Statement
    }

    public static void main(String[] args) {
        //Create an object just like we do for Scanner
        CalculatorMethods methods = new CalculatorMethods();

        System.out.println(methods.getSum(2,9));
        System.out.println(methods.multiply(3,50));
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }

}
