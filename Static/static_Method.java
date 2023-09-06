package Static;
class main{
    int n;
    static int m;
    public void show(){
        System.out.println("Value of n: "+n);
    }
    public static void show1(){
        m += 1;
        System.out.println("Value of n: "+m);
    }
}

public class static_Method {
    public static void main(String[] args){
        main obj1 = new main();
        main obj2 = new main();
        obj1.n = 20;
        main.m = 30;
        obj1.show(); 
        main.show1(); // 31
        main.show1(); // 32
        main.show1(); // 33
        main.show1(); // 34
        main.show1(); // 35
    }
    
}