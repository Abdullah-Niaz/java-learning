package oop;


class Access{
    private int a ;
    protected int b;
    public int c;
    
    public Access(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c =c ;
    }
    private void showPrivate(){
        System.out.println("Private Modifers Who Value is: " + a);
    }
    protected void showProtected(){
        System.out.println("Protected Modifers Who Value is: " + b);
    }
    public void showPublic(){
        System.out.println("Public Modifers Who Value is: " + c);
    }

}
public class Access_Modifiers {
    public static void main(String [] args){
        Access a = new Access(2,3,4);
        a.showProtected();
        a.showPublic();
    }
    
}
