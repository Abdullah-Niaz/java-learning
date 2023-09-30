package oop.Principles.Inheritance.Real_Examples;


class A{
    protected static int n;
    public A(){
        System.out.println("In A Default");
    }
    static{
        n = 0;
        n++;
        System.out.println("Static Execuation Started: " + n);
    }
    public A(int n){
        A.n = n;
        System.out.println("In A Parameterized");
    }


    public void show(){
        System.out.println("Value of N: "+n);
    }
}

class B extends A{
    protected static int m;
    public B(){
        System.out.println("In B Default");
    }
    static{
        m = 0;
        m++;
        System.out.println("Static Execuation Started" + m);
    }
    public B(int n, int m){
        super(n);
        B.m = m;
        System.out.println("In B Parameterized");
    }

    public void show(){
        System.out.println("Value of m "+m);
    }
}
public class flaws {
    public static void main(String[] args){
        B b1 = new B();
        B b2  = new B(5 , 6);
        A a1  = new A();
        a1.show();
        b1.show();

    }

}
