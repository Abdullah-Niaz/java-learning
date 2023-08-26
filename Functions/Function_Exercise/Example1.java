package Functions.Function_Exercise;

import java.util.Scanner;

public class Example1 {
    public static int AverageOfThree(int a,int b, int c){
        return (a +  b + c )/3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int av = AverageOfThree(a,b,c);
        System.out.print("Average of Three Numbers is: "+av);
    }
    
}
