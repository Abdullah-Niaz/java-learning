package CWD;

public class CWD_11_Break_Continue {
    public static void main(String []args){
        for(int i =0; i < 100; i++){
            if (i % 2 ==0){
                System.out.println("i: "+i);
                if(i == 40) {
                    break;
                }
            }
        }
    }
}
