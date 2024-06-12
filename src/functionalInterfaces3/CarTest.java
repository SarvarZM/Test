package functionalInterfaces3;

import homeWork.AttributeFunction;

import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota",2020,"White","Sedan");

        Car car2 = new Car("Honda",2024,"Red","SUV");

        Car car3 = new Car("Mercedes",2022,"Black","Sedan");

        Car car4 = new Car("BMW",2018,"Silver","SUV");

        Car car5 = new Car("Chevy",2015,"Blue","SUV");

        List<Car> cars= List.of(car1,car2,car3,car4,car5);

        getDataFRomCars(cars,x -> x.getYear()>=2020,z -> z.getModel());
        getDataFRomCars(cars,x->x.getType().equals("SUV"),car -> car.getColor());
        getDataFRomCars(cars, car -> car.getType().equals("Sedan"), car -> String.valueOf(car.getYear()));
        getDataFRomCars(cars,car -> car.getYear()%2 == 0 && car.getType().equals("SUV"),car -> car.getModel().substring(0,3).toUpperCase());

        System.out.println("==========================================");

        System.out.println( getCountOfCars(cars,x -> x.getType().equals("SUV")));

        System.out.println(getCountOfCars(cars, x-> x.getType().equals("Sedan")));



    }
    public static int getCountOfCars(List<Car> cars,CarCondition condition){
        int count=0;
        for(Car c: cars){
            if(condition.apply(c)){
                count++;
            }
        }
        return count;
    }


    public static void getDataFRomCars(List<Car> cars, CarCondition condition, CarAttributeFunction<Object> function){

        for(Car c: cars){
            if(condition.apply(c)){
                System.out.println(function.get(c));
            }
        }

    }
}
