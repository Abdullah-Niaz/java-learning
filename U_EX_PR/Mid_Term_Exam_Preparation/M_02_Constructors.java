// ? Constructor:
    //  It's a special method which is used to inilizte the object or an object is created when a constuctor is called

    //* TUDO: There are three types of constuctor:
        // Default or Non-Parameterized Constuctor
        // Parameterized Constructor
        // Copy Constructor

package U_EX_PR.Mid_Term_Exam_Preparation;

import java.lang.reflect.Parameter;

//! Default Constructor
class A_{
    int x_;
    A_(){
        x_ = 30;
    }
}
//! Parameterized Constructor
class A__{
    int x_;
    A__(int x ){
        x_= x;
        // or we can use the this keyword to specify
        this.x_= x;
    }
}

// Copy Constructor
class Copy{
    int a;
    Copy(A__ val){
        this.a = val.x_;
    }
}


public class M_02_Constructors {
    public static void main(String[] args){
        // Default constructor
        A_ a = new A_();
        System.out.println(a.x_);


        // Parameterized constuctor
        A__ b = new A__(20);
        System.out.println(b.x_);

        // Copy Constructor
        Copy co = new Copy(b);
        System.out.println(co.a);
    }
}
