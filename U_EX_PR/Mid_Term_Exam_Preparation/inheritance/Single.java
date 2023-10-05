package U_EX_PR.Mid_Term_Exam_Preparation.inheritance;


class A{
    public void geeksfor(){
    System.out.println("GeekFor");
    }
}
class B extends A{
    public void geeks(){
    System.out.println("Geeks");
    }
}
public class Single {
    public static void main(String[] args){
        B b = new B();
        b.geeksfor();
        b.geeks();
    }    
}
