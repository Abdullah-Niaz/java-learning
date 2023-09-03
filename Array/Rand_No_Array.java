package Array;

import java.util.*;

public class Rand_No_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = (int) (Math.random() * 100);
                System.out.println(num[i][j]);
            }
        }
    }
}