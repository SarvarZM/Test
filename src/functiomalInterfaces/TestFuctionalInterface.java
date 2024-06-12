package functiomalInterfaces;

public class TestFuctionalInterface {

    public static void main(String[] args) {
        Printer p = (str)-> System.out.println("Printing: "+str);
        p.print("Message");

        Calculator addition = (a,b)-> a+b;

        Calculator multiplication = (a, b)-> a*b;

        Calculator division = (a,b) -> a/b;

        Calculator subtraction =(a,b)-> a-b;


    }
}
//Lambda Expression