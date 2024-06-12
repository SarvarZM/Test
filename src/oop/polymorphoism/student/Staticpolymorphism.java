package oop.polymorphoism.student;

public class Staticpolymorphism {
    public static int getSum(int num1, int num2){
        return num1+num2;
    }
    public static int getSum(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static void main(String[] args) {

        System.out.println(getSum(3,4,6));

    }
    public static String getSchool(OnlineStudent student){
        return student.SCHOOL;
    }
}
