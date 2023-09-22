package oop;


// Developer have to work, does not matter it's desktop or computer
class computer{
    public void code(){

    }
}

class laptop extends computer{
    public void code(){
        System.out.println("Code, Run, Compile with Normal Speed");
    }
}

class desktop extends computer{
    public void code(){
        System.out.println("Code, Run, Compile with High Speed");
    }
}

class Developer{
    public void devApp(computer com){
        com.code();
    }
}


public class needOfInterface{
    public static void main(String [] args){
        computer lap = new laptop();
        computer desk = new desktop();
        
        Developer dev = new Developer();


        dev.devApp(lap);
        dev.devApp(desk);

    }
}