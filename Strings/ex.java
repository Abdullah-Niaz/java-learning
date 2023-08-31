package Strings;
public class ex {
    public static void main(String[] args){
        String n = "Hello,I am a student of smester 3";
        StringBuilder modifiedString = new StringBuilder();
        
        for(int i = 0 ; i < n.length(); i++){
            char chara = n.charAt(i);
            if(chara != '3') {
                modifiedString.append(chara);
            }
            else{
                System.out.print("int found at index: "+i);
            }
            System.out.println();

        }
        System.out.print("Modified String: " + modifiedString);
    };

}
