package Method2;

public class StaticMethods2 {
    public static int getGreater(int num1, int num2){
     return num1>num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        System.out.println(getGreater(5,2));
    }
}
