package Functions;

import java.util.Scanner;

// Functions 
    // - Function is a block of code which is executed when it is called.
    // Types of Functions:
        // - Returning 
        // - Non Returning
public class demo {
    public static void name(String name){
        System.out.print("Your Name is "+name);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name(name);
    }
}
