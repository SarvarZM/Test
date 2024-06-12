package oop.abstraction.flyobjects;

public class Bird  implements Flyable,Noise{

    @Override
    public String fly() {
        return "Bird Is Flying...";
    }

    @Override
    public String makeNoise() {
        return "Chik Chirik";
    }
}
