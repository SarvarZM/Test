package functionalInterfaces2;

import java.sql.SQLOutput;

public class LambdaPractice {
    public static void main(String[] args) {

        StringManipulation strMan = (str) -> str.toUpperCase();

        System.out.println(strMan.execute("java"));

        StringManipulation strMan2= (x)-> ""+x.charAt(0)+ x.charAt(x.length()-1);

        System.out.println(strMan2.execute("java"));

        StringManipulation strMan3 = (z) -> {
            if(z.length()>=5){
                return z.toUpperCase();
            }else{
                return z.toLowerCase();
            }
        };
        System.out.println(strMan3.execute("Sarvar"));
    }
}
