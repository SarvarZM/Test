package constructors;

public class AmazonApp {
    public static void main(String[] args) {

        Product product1 =new Product("Apple Mouse",5,89.99);
        Product product2 =new Product("Adjustable Table",4,499.99);


        System.out.println(product1.name);
        System.out.println(product1);


    }
}
