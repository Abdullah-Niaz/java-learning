package Functions;

import java.util.Scanner;

public class Example2 {

    public static int SumOfOdds(int n){
        int sum = 0;
        for(int i = 1; i <= n ;i++){
            if(i % 2!=0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int s = SumOfOdds(n);
        System.out.print("Sum of Odds: "+ s);
    }
    
}
