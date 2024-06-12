package oop.inheritence.flyvehicles;

import oop.inheritence.vehicles.Bus;
import oop.inheritence.vehicles.Vehicle;

public class TestVehicles {
    public static void main(String[] args) {

        Bus bus = new Bus();
        System.out.println(bus.getInfo());

        Plane plane = new Plane();
        System.out.println(plane.getInfo());

        Vehicle vehicle = new Vehicle();
        
    }
}
