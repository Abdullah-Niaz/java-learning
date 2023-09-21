package oop;
import Static.static_Method;

abstract class Shape {
    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Abstract method (no implementation)
    abstract void draw();

    // Regular method with implementation
    void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}

class Circle extends Shape {
    int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    // Implementation of the abstract method
    void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }
}


public class imple_abstract {
    public static void main(String [] args){
        Circle circle = new Circle(20, 39, 25);
        circle.draw();
    }
}
