package oop.rectangle;

public class mainClass {
    public static void main(String[] args) {
        area a = new area();
        perameter per = new perameter();
        // For Area width and height is: 
        a.h = 20;
        a.w = 30;
        // For perameter width and height is: 
        per.h = 40;
        per.w = 50;
        int area = a.area();
        int perimeter = per.perimeter();

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
