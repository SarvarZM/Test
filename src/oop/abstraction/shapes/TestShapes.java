package oop.abstraction.shapes;

public class TestShapes {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.length=4;
        triangle.length2=6;
        triangle.width=5;

        Circle circle = new Circle();
        circle.radius =8;

        Square square = new Square();
        square.width=5;
        square.length=5;


        System.out.println();
    }
}
