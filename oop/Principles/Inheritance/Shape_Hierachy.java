package oop.Principles.Inheritance;

import javax.print.DocFlavor.STRING;

class Shape{
    protected String  color;

    public Shape(String color){
        this.color = color;
    }

        // Common method to calculate area (to be overridden by subclasses)
    public double calculateArea() {
        return 0.0;
    }
    
    // Common method to draw (to be overridden by subclasses)
    public void draw() {
        System.out.println("Drawing a " + color + " shape.");
    }
}

class Circle extends Shape{
    private double radius;
    
    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }
    
    @Override
    public void draw(){
    System.out.println("Drawing a " + color + " shape with Radius: "+ radius);
    
    }
}



class Rectangle extends Shape{
     private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle with length " + length + " and width " + width);
    }
}


class Triangle extends Shape{
    private double base;
    private double height;
    
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " triangle with base " + base + " and height " + height);
    }

}





public class Shape_Hierachy{
    public static void main(String [] args){
        Shape shp = new Shape("Green");
        System.out.println("Default Class shape:");
        shp.calculateArea();
        shp.draw();
        System.out.println(shp.color);
        
        System.out.println("\n\nCirlce Child of Shape Class:");
        
        Circle cr = new Circle("Blue", 20);
        cr.calculateArea();
        cr.draw();
        System.out.println(cr.color);
        
        
        System.out.println("\n\nRectangle Child of Shape Class:");
        Rectangle rec = new Rectangle("Red",10, 20);
        rec.calculateArea();
        rec.draw();
        System.out.println(rec.color);
        
        
        System.out.println("\n\nTriangle Child of Shape Class:");
        Triangle tr = new Triangle("yellow",20, 30);
        tr.calculateArea();
        tr.draw();
        System.out.println(tr.color);




    }
} 