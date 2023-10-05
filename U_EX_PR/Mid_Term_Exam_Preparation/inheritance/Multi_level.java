package U_EX_PR.Mid_Term_Exam_Preparation.inheritance;

class Grand{
    public void Gsound(){
        System.out.println("Sound of G");
    }
}
class parent extends Grand{
    public void psound(){
        System.out.println("Sound of P");
    }
}
class child extends parent{
    public void csound(){
        System.out.println("Sound of C");
    }
}
public class Multi_level {
    public static void main(String[] args){
        child c = new child();

        c.Gsound();
        c.psound();
        c.csound();
    }    
}
