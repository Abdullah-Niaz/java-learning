package oop;


abstract class A__{
    public abstract void show();
}

public class abstract_anonymous {
    public static void main(String[] args){
        A__ a = new A__(){
            public void show(){
                System.out.println("AnonyMous Functions");
            }
        };

        a.show();
    }
    
}
