abstract class car{
    String name ;
    String model;
    int price;

    public void CarDec(String name,String model,int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public abstract void drive();
    public void display(){
        System.out.println("You're Moving with V........");
    }

}


class Toyata extends car{
    public void drive(){

    }
}

public class abstract_keyword {
    public static void main(String [] args){
        car obj = new Toyata();
        obj.CarDec("BMW", "2023", 7500);
        System.out.println(obj.name+" : "+obj.model+" : "+obj.price);
    }
}
