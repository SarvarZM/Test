package functionalInterfaces2;

public class LambdaPractice3 {
    public static void main(String[] args) {

        Condition<String> condition = (x)-> x.contains("a");

        System.out.println(condition.execute("app"));

        Condition<Integer> isEven = x -> x%2 ==0;

        Condition<Character> isLowercase = x -> Character.isLowerCase(x);


    }
}
