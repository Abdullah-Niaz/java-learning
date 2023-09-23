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


        A_ a = new A_();
        a.show();
        System.out.println("=======Anonymous===============");
        
        B_ b = new B_();
        b.show();
        System.out.println("=======Anonymous===============");
        A_ c = new B_(){
            public void show(){
                System.out.println("In New Show");
            }
        };
        System.out.println("=======Anonymous===============");
        c.show();
    }
}
