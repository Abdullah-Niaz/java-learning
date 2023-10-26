package Exceptions;
import java.util.*;
public class CArithmeticException {
    private static final Exception ArithmeticException = null;

    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values a,b Respectively: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
        try{
            result = a / b;
            System.out.println("Value of Addition : " + result);
        }
        // catch(ArithmeticException e){
        //     System.out.println("Error Occured due to the divsion of Number by Zero");
        // }
        catch(Exception e){
            if(e == ArithmeticException){
                System.out.println(e);
            }
            else{
                System.out.println(e);
            }
        }
    }
}
