package oop;

import java.lang.reflect.Constructor;

class cons{
    static int roll;
    static String name;

    // default Constructor
    public cons(){
        roll = 20;
        name = "Hamza";
    }
    // Paramterized constructor
    public cons(int roll, String name){
        this.name = name;
        this.roll = roll;
    }

    // Copying Constructor
    public cons(cons objCons){
        this.name = objCons.name;
        this.roll = objCons.roll;
    }

    public static int getRoll() {
        return roll;
    }

    public static void setRoll(int roll) {
        cons.roll = roll;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        cons.name = name;
    }

    public static void getData(){
        System.out.println(cons.name);
        System.out.println(cons.roll);
    }
}

public class constructors {
    public static void main(String[]args){
        cons obj = new cons(20,"Talha");
        System.out.println(obj.roll);
        System.out.println(obj.name);
        
        cons obj1 = new cons(220,"Ali");
        cons copyobj = new cons(obj1);
        cons.getData();

    }
    
}
