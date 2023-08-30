package Strings;

public class sbustr {
    public static void main(String[] args){
        String a = "Hell3o";
        // String n = a.substring(0,3);

        for(int i = 0; i < a.length(); i++){   
            char character = a.charAt(i);
            if (character == '3') {
            
                System.out.println("Found here: "+i);
            }
            // System.out.println(character);
        }
        // System.out.print(a);

        
    }
}
