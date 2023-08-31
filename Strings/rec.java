package Strings;
import org.w3c.dom.Text;
class test{
    int n;
    test(){
        n = 0;
    }
    test(int a){
        n = a;
    }
    test(test p){
        this.n = p.n;
    }
}
public class rec {
    public static void main(String[] args){
        test t = new test();
        test g = new test(20);
        g.n = 100;
        System.out.println("Value of n Before is: "+t.n);
        System.out.println("Value of n Before is: "+g.n);
        
        System.out.println("Copying Constructor Method");
        test obj1 = new test(50);
        test obj2 = new test(obj1);
        System.out.println("Value of n Before is: "+obj1.n);
        System.out.println("Value of n Before is: "+obj2.n);
        
        
    }
}
