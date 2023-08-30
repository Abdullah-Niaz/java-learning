package Strings;

public class RemoveCharacterExample {
    public static void main(String[] args) {
        String a = "Hello, i am a student of smester 3";
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char character = a.charAt(i);
            if (character != '3') {
                modifiedString.append(character);
            }
            else{
                System.out.println("int was found here and removed: " +i);
            }
        }

        System.out.println("Original String: " + a);
        System.out.println("Modified String: " + modifiedString.toString());
    }
}
