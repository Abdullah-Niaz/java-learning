package oop;

class A_{
    public void show(){
        System.out.println("In A Show");
    }
}
class B_ extends A_{
    public void show(){
        System.out.println("In B show");
    }
}

public class anonymous_inner_class {
    public static void main(String[]args){
        A_ a = new B_(){
            public void show(){
                System.out.println("In New Show");
            }
        };
        a.show();
    }
}
