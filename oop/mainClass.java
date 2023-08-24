package oop;


public class mainClass {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.w = 5;
        rect.h = 3;

        int area = rect.area();
        int perimeter = rect.perimeter();

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
