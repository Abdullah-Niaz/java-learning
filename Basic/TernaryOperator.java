package Basic;

public class TernaryOperator {
    public static void main(String [] args){
        int n = 10;
        // TernaryOperator:
            // ? Before, if the condtion is true.
            // : After, if the condtion is false.
        int result = n % 2 == 0 ? 10 : 30;
        System.out.println(result);
    }    
}
