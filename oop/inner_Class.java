package oop;

class outer{
    public void Show(){
        System.out.println("Outer Show");
    }

    static class inner{
        public void Show(){
            System.out.println("Inner Show");
        }
    }
}
public class inner_Class {
    public static void main(String[] args){
        
        outer obj = new outer();
        obj.Show();
        
        // outer.inner in = obj.new inner();
        // in.Show();


        // static Method

        outer.inner sc = new outer.inner();
        sc.Show();
    }
}
