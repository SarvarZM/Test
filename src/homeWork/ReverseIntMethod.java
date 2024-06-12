package homeWork;


public class ReverseIntMethod {

    public int reverseInt(int input){
        int temp =0;

        while(input != 0){
            temp = temp *10 + input %10;
            input =input /10;
        }
        return temp;
    }

    public static void main(String[] args) {
        ReverseIntMethod method = new ReverseIntMethod();

        System.out.println(method.reverseInt(3458));


    }


}
