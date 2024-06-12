package oop.inheritence.methods;

public class testMethods {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(Child.staticMethod());
        System.out.println(child.finalMethod());
        System.out.println(child.regularMethod());

    }
}
