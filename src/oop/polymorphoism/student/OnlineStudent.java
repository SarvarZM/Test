package oop.polymorphoism.student;

public class OnlineStudent implements Student {


    @Override
    public String study() {
        return "Online Student is studying from home.";
    }
    public String doHomework(){
        return "Online Student is doing homework";
    }

}
