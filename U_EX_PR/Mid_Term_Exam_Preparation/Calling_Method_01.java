package U_EX_PR.Mid_Term_Exam_Preparation;

import java.text.AttributedCharacterIterator.Attribute;

public class Calling_Method {
    // Attributes / Variables / instance Variable
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public void call(){
        System.out.println("Hello World");
    };
    public static void main(String[] args){
        Calling_Method myObj = new Calling_Method();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
        myObj.call();
    }
    
}
