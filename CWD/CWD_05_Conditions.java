package CWD;

public class CWD_04_Conditions {

    public static void main(String [] args){
        int a = 20 ;
        int b = 30;
        int c = 40;
        if( a > b && a > c){
            System.out.println("A is Greater with having Value " + a);
        }
        
        else if (b > c){
            System.out.println("B is Greater with having Value " + b);
            
        }
        else{
            System.out.println("C is Greater with having Value " + c);

        }
    }
    
}
