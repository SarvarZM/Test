package methodsInJava;

public class MyMethods {
    //Pass String, Method will check if first and last chars are the same

    public boolean sameCharacters (String word){

        if (word!=null && word.length()>0){
            return word.toLowerCase().charAt(0)==word.toLowerCase().charAt(word.length()-1);
        }
        return false;
    }
    public static void main(String[] args) {

        MyMethods methods = new MyMethods();
        System.out.println(methods.sameCharacters(""));
    }
}
