package oop;

class addition {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

}

public class Method_overlaoding {
    public static void main(String[] args) {
        addition obj1 = new addition();

        int addi1 = obj1.add(1, 3);
        int addi2 = obj1.add(2, 3, 4);
        double addf1 = obj1.add(1.1, 1.2);
        double addf2 = obj1.add(1.1, 1.3, 1.4);

        System.out.println(addi1);
        System.out.println(addi2);
        System.out.println(addf1);
        System.out.println(addf2);
    }

}
