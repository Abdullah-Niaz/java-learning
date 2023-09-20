package OOP;

class A{

    int age;
    public void show (){
        System.out.println("In show Outer Class");
    }

    class B{
        public void show(){
            System.out.println("In show Inner Class");
        }
    }

}

public class innerClass{
    public static void main(String[]args){
        A obj = new A();
        System.out.println(obj.age);
        obj.show();
    }
