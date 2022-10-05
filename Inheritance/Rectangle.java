package Inheritance;

public class Rectangle {

    int length;
    int breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getArea() {
        return this.length * this.breadth;
    }
}
