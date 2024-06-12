package oop.inheritence.vehicles;

public class Bus extends Vehicle {
    public String getInfo(){
        String info = "Model: "+ model +" , Color: "+color+", Make: "+make;
        return info;
    }
}
