package U_EX_PR.Mid_Term_Exam_Preparation.inheritance;

class A___{
    public void print_A(){
        System.out.println("IN Class A");
    }
}

class B extends A___{
    public void print_B(){
        System.out.println("IN Class B");
    }
    
}

class C extends A___{
    public void print_C(){
        System.out.println("IN Class C");
    }
    
}
class D extends A___{
    public void print_D(){
        System.out.println("IN Class D");
    }
    
}
public class Hierachical {
    public static void main (String[] args){
        B b = new B();
        b.print_A();
        b.print_B();
        System.out.println("");
        
        
        C c = new C();
        c.print_A();
        c.print_C();
        
        System.out.println("");
        

        D d = new D();
        d.print_A();
        d.print_D();
    }
}
