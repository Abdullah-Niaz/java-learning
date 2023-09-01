package oop;

class Point {
    private int x;
    private int y;

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copying constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter method for x
    public int getX() {
        return x;
    }

    // Getter method for y
    public int getY() {
        return y;
    }
};

public class copyingConstructorType {
    public static void main(String[] args) {
        // Create a Point object using the parameterized constructor
        Point originalPoint = new Point(5, 10);
        
        // Create a new Point object by copying values from the originalPoint
        Point copyingp = new Point(15, 25);
        Point copiedPoint = new Point(copyingp);

        // Display the original and copied points
        System.out.println("Original Point: (" + originalPoint.getX() + ", " + originalPoint.getY() + ")");
        System.out.println("Copied Point: (" + copiedPoint.getX() + ", " + copiedPoint.getY() + ")");
    }
}

