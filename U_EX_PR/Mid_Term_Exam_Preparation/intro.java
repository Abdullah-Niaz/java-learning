//! OOP: Object is a object oriented programming language.
//  OOP is faster and easier to execute
//  OOP has a clear Structure
//  OOP helps to make the DRY Code
//  OOP helps to create the components of the code which can be used later


//? Class
//  Class is a blue of the object

//**Object
//  Object is the instance variable of the class 

package U_EX_PR.Mid_Term_Exam_Preparation;




class A{
    A(){
        System.out.println("In A");
    }
}

class B{
    B(){
        System.out.println("In B");
    }
}
public class intro {

    static int add(int a , int b){
        return a + b;
    }
    public static void main(String [] args){
        int add = add(2,3);
        System.out.println("Value of a: " + add);

        // Calling the Class: 
        A a = new A();
        B b = new B();
    }
}
