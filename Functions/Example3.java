package Functions;

import java.util.Scanner;

public class Example3 {

    public static double Cicumference(int r){
        return ( 2 * 3.14 * r);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double cr = Cicumference(n);
        System.out.print("Sum of Odds: "+ cr);
    }
    
}
