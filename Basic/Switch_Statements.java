package Basic;

import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value to Check the respective day: ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Firday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input value, which doesn't exist");

                break;
        }
    }

}
