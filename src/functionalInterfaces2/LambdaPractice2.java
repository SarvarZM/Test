package functionalInterfaces2;

public class LambdaPractice2 {

    public static void main(String[] args) {
        BiStringManipulation condition = (x,y)-> x.length() == y.length();

        System.out.println(condition.execute("java","lava"));

        BiStringManipulation isRevered = (x,y)-> x.equalsIgnoreCase(new StringBuilder(y).reverse().toString());

        System.out.println(isRevered.execute("java","jvaj"));

    }
}
