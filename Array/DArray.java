package Array;
import java.util.*;

public class DArray {
    public static void main(String[] arr){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows & Cols: ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] aray = new int[row][cols];
        System.out.print("Enter the Array Elements: ");
        for(int i = 0 ; i < row; i++){
            for(int j = 0; j < cols; j++){  // Fix the condition here
                aray[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Displaying Array Elements:");
        for(int i = 0 ; i < row; i++){
            for(int j = 0; j < cols; j++){  // Fix the condition here
                System.out.print(aray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
