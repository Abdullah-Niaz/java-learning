package Strings;

public class char_array_String {
    public static void main(String[] args){
        char c[] = {'a','b','c','d','f','g'};

        for(char x : c){
            if(x == 'c'){
                break;
            }
            System.out.println(x);
        }
    }
}

