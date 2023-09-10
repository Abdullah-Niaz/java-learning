// Multilevel Inheritance

class A{
    protected int n ;
    protected int m = 20;
    public A(){
        System.out.println("Constructor of A:");
    }
    public A(int n ){
        System.out.println("Parametrized Constructor of A: " + n);
    }
};
class B extends A{
    public B(){
        System.out.println("Constructor of B:");
    }
    public B(int n){
        super(n);
        System.out.println("Parametrized Constructor of B: "+ n);
    }
    public void show(){
        System.out.println(super.m);
    }
};
class C extends B{
    public C(){
        System.out.println("Constructor of C:");
    }
    public C(int n){
        super(n);
        System.out.println("Parametrized Constructor of C: "+ n);
    }
};

public class this_super_method {
    public static void main(String[] args){
        // B b = new B(2);
        C c = new C(20);
        c.show();
    }  
}
