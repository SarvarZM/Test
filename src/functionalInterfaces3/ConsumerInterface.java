package functionalInterfaces3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<Car> printCarModel = x-> System.out.println(x.getModel());
        Car car = new Car("Lambo",2025,"Blue","Sedan");

        printCarModel.accept(car);

        BiConsumer<String, Integer> concat =(x,y)-> System.out.println(x+y);

        concat.accept("Java",8);
    }
}
