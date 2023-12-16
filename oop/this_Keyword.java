package oop;
class main{
    private int n;

    public void setN(int n){
        // instance variable = local variable 
        // in order to differentiate we have to use the this keyword
        //  otherwise compiler will get confused what to do.
        this.n = n;
    }
    public int getN(){
        return n;
    }

}

public class this_Keyword {
public static void main(String[] args){
    main m = new main();
    m.setN(20);
    System.out.println(m.getN());
}   
}
