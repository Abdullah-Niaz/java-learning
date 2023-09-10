package oop;


class A{
    public A(){
        System.out.println("In Constructor A");
    }
    public void show(){
        System.out.println("Show in A");
    }
}
public class anonymous_object {
    public static void main(String [] args){
        new A().show();
    }
    
}
