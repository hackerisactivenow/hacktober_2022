package Inheritance;

public class Example {

    public static void main() {

        /**
         * As you can see with one blueprint of Shape class
         * We could extend and inherit its get area method implementation to Square and
         * Rectangle classes
         * 
         */

        Square square = new Square(3);
        System.out.println("Area of the square is: " + square.getArea());

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("Area of the rectangle is: " + rectangle.getArea());
    }

}
