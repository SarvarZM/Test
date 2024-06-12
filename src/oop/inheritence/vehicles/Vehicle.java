package oop.inheritence.vehicles;

public class Vehicle {

    public String model;
   protected String color;
   String make;
   private int year;


   public String drive(){
       return "Vehicle is driving";
   }
   protected String stop(){
       return "Vehicle is stopping";
   }
   String start(){
       return "Vehicle is Starting";
   }
   private String parking(){
       return "Vehicle is parking";
   }
}
