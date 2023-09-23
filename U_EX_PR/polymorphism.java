package U_EX_PR;

class person {
    protected String surname;
    protected String firstname;
    public person(String surename, String firstname){
        this.surname = surename;
        this.firstname = firstname;
    }
    public void getName() {
        System.out.println(surname +" "+ firstname);
    }

    public void cookDinner() {
        System.out.println("Microwave Dinner");
    }
}



class HoueWife extends person{
    public  HoueWife(String surname , String firstname){
        super(surname,firstname);

    }
    
    public void cookDinner(){
        System.out.println("Roat Chicken With Potatos");
    }
    public void cleanKitchen(){
        System.out.println("Cleaning Kitchen Right Now........");
    }
}


class pizzaChef extends person{

    public pizzaChef(String surename, String firstname) {
        super(surename, firstname);
    }

    public void cookDinner(){
        System.out.println("Cooking Pizza......");
    }

}

class KFCPerson extends person{

    public KFCPerson(String surename, String firstname) {
        super(surename, firstname);
    }
    public void cookDinner(){
        System.out.println("KFC Chicken");
    }

}

public class polymorphism {
    public static void main(String[] args) {

        // person 
        System.out.println("\n\n==========Person============");
        person p = new person("Choudhary", "Smith");
        p.getName();
        p.cookDinner();


        System.out.println("\n\n==========HouseWife============");
        
        // House Wife
        person h = new HoueWife("Theras", "Thomson");
        h.getName();
        h.cookDinner();
        
        System.out.println("\n\n==========Pizza Checf============");
        // pizza Chef
        person ps = new pizzaChef("Michel", "Hiel");
        ps.getName();
        ps.cookDinner();

        System.out.println("\n\n==========KFC Person============");
        person kfc = new KFCPerson("Peter","Wong");
        kfc.getName();
        kfc.cookDinner();
    }
}