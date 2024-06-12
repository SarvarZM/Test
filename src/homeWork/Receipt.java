package homeWork;

public class Receipt {
    public static void main(String[] args) {
        String iphone = "Iphone 13";
        String airPods = "AirPods";

        int iphonePrice =999;
        int airPodsPrice =179;

        System.out.println("   Apple Store Receipt   ");
        System.out.println("         *****           ");
        System.out.println(iphone+": "+iphonePrice+" dollars");
        System.out.println(airPods+": "+airPodsPrice+" dollars");
        System.out.println("================");
        System.out.println("Total: "+(iphonePrice+airPodsPrice));
    }

}
