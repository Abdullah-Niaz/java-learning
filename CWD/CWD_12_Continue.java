package CWD;

import loops.forloop;

public class CWD_12_Continue {
    public static void main(String [] args){
        for(int i = 0; i <= 30;i++ ){
            if(i% 2 == 0){
                System.out.println(i);
                if(i == 20){
                    continue;
                }
            }
        }
    }
    
}
