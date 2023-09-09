package oop.Principles;

import java.lang.reflect.ParameterizedType;

import loops.dowhile;

// Inheritance is one of the fundamental concepts in object-oriented programming (OOP), and it plays a crucial role in the Java programming language. Inheritance allows you to create a new class (the subclass or derived class) that inherits attributes and behaviors (fields and methods) from an existing class (the superclass or base class). This promotes code reuse and helps you build a hierarchical structure of classes.
class animal{
    String name;

    // Parameterized Constructor
    public animal(String name ){
        this.name = name;
    }
    public void speak(){
        System.out.println(name +" Speaks");
    }
};

class Dog extends animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void speak(){
        System.out.println(name + " Barks");
    }
};

public class inheritance {
    public static void main(String [] args){
        // animal an = new animal("Cow");
        Dog d = new Dog("German Shafit");
        System.out.println(d.name);
        d.speak();
    }    
}
