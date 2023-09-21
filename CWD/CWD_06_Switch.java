package CWD;

import java.util.Scanner;

public class CWD_06_Switch {
 public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Expression: / , % , + , - , * : ");
    String ch = sc.next();
    System.out.println("Enter the First Value: ");
    int a = sc.nextInt();
    System.out.println("Enter the Second Value: ");
    int b = sc.nextInt();
    switch(ch){
        case "+" :
        System.out.println( a + b);
        break;
    
        case "-" :
        System.out.println( a - b);
        break;
    
        case "/" :
        System.out.println( a / b);
        break;
    
        case "%" :
        System.out.println( a % b);
        break;

        case "*" :
        System.out.println( a * b);
        break;

        default:
        System.out.println("Ivalid Expression");
    }
}   
}
