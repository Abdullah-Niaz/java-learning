package U_EX_PR.Mid_Term_Exam_Preparation.inheritance;

interface one{
    public void print_geek();
}
interface two{
    public void for_geek();
}
interface three extends one, two{
    public void print_geek();
}

class child implements three{
    public void print_geek(){
        System.out.println("Geeks");
    }
    public void for_geek(){
        System.out.println("For Geeks");
    }
}
public class Multiple {
    public static void main(String[]args){
        child c = new child();
        c.print_geek();
        c.for_geek();
    }
    
}
