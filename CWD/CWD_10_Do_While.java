package CWD;

public class CWD_10_Do_While {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println("I : " + i);
            }
            i++;
        } while (i < 100);
    }
}
