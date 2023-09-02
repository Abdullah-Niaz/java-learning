package Basic;

public class CondtitionOperators {
    public static void main(String[] args){
        int a = 20,b = 30,c = 40;
        if(a > b && a > c){
            System.out.print("Value of a is Greater: "+a);
        }

        else if(b > c){
            System.out.print("Value of b is Greater: "+b);
        }
        else{
            System.out.print("Value of Z is Greater: "+c);
        
        }
    }
    
}
