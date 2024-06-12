package wrapperClasses;

public class ReverseNumber {
    public static void main(String[] args) {

        int number=123;

        //Reverse the number output: 321

        StringBuilder stb = new StringBuilder(number);

        stb.reverse();

        number = Integer.parseInt(stb.toString());


    }
}
