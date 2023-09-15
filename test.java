
class A{
    public int x;
    public A(){
        this(100);
    }
    public A(int x){
        super();
        this.x = x;
    }
};
class B extends A{
    public int x = 10;
    public int y = 1;
    public B(){

    }
    public B(int y){
        this.y = y + y;
    }
    public B(int x, int y ){
        super(x);
        this.y = this.y + y;
    }
}


public class test{
    public static void main(String[]args){
        B b = new B(299,20);
        System.out.println(b.x);
        System.out.println(b.y);
    }
}