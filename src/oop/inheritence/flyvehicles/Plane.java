package oop.inheritence.flyvehicles;

import oop.inheritence.vehicles.Vehicle;

public class Plane extends Vehicle {

    public String getInfo(){
        return "Model: "+model+", Color: "+color;
    }
}
