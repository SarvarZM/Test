package methodsInJava;

public class HelpfulMethods {
    //Take the Temp and convert from F to C
    public double tempConverter(int f){
        return (double)(f -32) * 5/9;
    }

    public static void main(String[] args) {

        HelpfulMethods methods = new HelpfulMethods();

        System.out.println(methods.tempConverter(80));
        System.out.println(methods.returnLastTwo("g"));
        System.out.println(methods.lastLetter("Ball"));
        System.out.println(methods.canDivide(4,2));
        System.out.println(methods.sameCharacters("java"));
    }
    //Return last two characters in a String
    public String returnLastTwo(String word){
        if(word.length()>=2) {
            int index = word.length() - 2;
            return word.substring(index);
        }else
            return "Word is too short";
    }
    public String lastLetter(String word){
        return word.substring(word.length()-1);
    }
    public boolean canDivide(int num1, int num2){
      return num1%num2==0;
    }
    //Pass String, Method will check if first and last chars are the same

    public boolean sameCharacters (String word){
        return word.substring(0)==word.substring(word.length()-1);
    }


}
