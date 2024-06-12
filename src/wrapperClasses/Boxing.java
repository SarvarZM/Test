package wrapperClasses;

public class Boxing {
    public static void main(String[] args) {

        int num=5;
        // Converting Primative Into Wrapper Data Type

        //AutoBoxing--> Converting primitive type to Wrapper type
        Integer numWrapper=num;

        //Unboxing
        Integer number = new Integer(10);
        int numPrimative= number;

        String str ="54890";
        //String -> int

        int strNum = Integer.parseInt(str);

        System.out.println(strNum+5);

        String value ="123";

        int strValue = Integer.parseInt(value);



    }
}
