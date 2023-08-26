
package Functions;

import java.util.Scanner;

public class factorial {
    public static int FactorialOfN(int n){
        int fact = 1;
        for(int i = 1 ; i <= n; i++){
            fact = fact * i ;
        }
        return fact;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = FactorialOfN(n);
        System.out.print("Factorial of " + n + " is: "+ f);
    }
}
