package condition;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Mini Calculator");
        System.out.print("Enter the Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter the Operator: +, -, *, /: ");
        char operator = sc.next().charAt(0);
        int result;

        switch (operator) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                if (b == 0) {
                    System.out.print("Divisor Must be Greater than Zero Exception Error: Not Divisible By Zero");
                    return;
                } else {
                    result = a / b;
                }
                break;

            default:
                System.out.print("Invalid Operator");
                return;
        }
        
        System.out.println("Result is: " + result);
    }
}
