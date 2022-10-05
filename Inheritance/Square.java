package Inheritance;

public class Square extends Shape {

    int side;

    public Square(int x) {
        this.side = x;
    }

    
    public int getArea() {
        return this.side * this.side;
    }
}