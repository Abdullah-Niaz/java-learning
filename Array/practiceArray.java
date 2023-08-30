package Array;

import java.util.Scanner;

import javax.swing.text.html.parser.Element;

public class practiceArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows & cols: ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int [][]s = new int[row][cols];
        
        System.out.print("Enter the Array Elements of " + row+ "*" + cols +" : ");
        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < cols ; j++){
                s[i][j] = sc.nextInt();
            }
        }
        
        
        // Displaying Array Elements 
        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
