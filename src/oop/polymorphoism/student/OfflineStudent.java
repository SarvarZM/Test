package oop.polymorphoism.student;

public class OfflineStudent implements Student {

    @Override
    public String study() {
        return "Offline Student is studying in class.";
    }
}
