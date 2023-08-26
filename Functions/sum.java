package Functions;

import java.util.Scanner;

public class sum {
    public static int SumOfTwo(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String [] name){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = SumOfTwo(a, b);
        System.out.print("Value of Two Numbers Sum is: " + sum);
    }
    
}
