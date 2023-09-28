package CWD;

public class CWD_09_While_Loop {
    public static void main(String[] args){
        int i = 0;
        while(i < 100){
            if (i % 2 == 0){
                System.out.println("I is increasing: " + i);
            }
            i+=3;
        }
    }
}
