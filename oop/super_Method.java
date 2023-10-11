package oop;
class A{

    public A(){
        super();
        System.out.println("IN A:");
    }
    public A(int n){
        super();
        System.out.println("Int in A:"+n);
    
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("In B: ");
    }
    public B(int n){
        super(n);
        System.out.println("int In B: "+ n);

    }
}

public class super_Method {
    public static void main(String [] args){
        B b = new B(3);
    }
}
