package oop;

public class rectangle {
    int w, h;

    int area() {
        return w * h;
    }

    int perimeter() {
        return 2 * (h + w); // Changed 2 + ( h + w) to 2 * (h + w)
    }
}
