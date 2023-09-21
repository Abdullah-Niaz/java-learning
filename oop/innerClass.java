package oop;

class A_Ounter{

    int age = 20;
    public void show (){
        System.out.println("In show Outer Class");
    }

    static class B_Inner{
        public void Configshow(){
            System.out.println("In show Inner Class");
        }
    }

}


public class innerClass {
        public static void main(String[]args){
        A_Ounter obj = new A_Ounter();
        obj.show();

        // Calling the inner Class
        // A_Ounter.B_Inner obj1 = obj.new B_Inner();
        // obj1.Configshow();


        // if you wanna you the static, do also 
        A_Ounter.B_Inner obj1 = new A_Ounter.B_Inner();
        obj1.Configshow();
    }
}
