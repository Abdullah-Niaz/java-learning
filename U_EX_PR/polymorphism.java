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

class TakeAwayChef extends person{

    public TakeAwayChef(String surename, String firstname) {
        super(surename, firstname);
    }

    public void cookDinner(){
        System.out.println("Fried Rice`");
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



        System.out.println("\n\n==========TakeAwayChef============");
        person TAC = new TakeAwayChef("kevin", "Chin");
        TAC.getName();
        TAC.cookDinner();

        
        
        
        person[] PList = new person[5];
        PList[0] =  new person("Choudhary", "Smith");
        PList[1] = new HoueWife("Theras", "Thomson");
        PList[2] = new pizzaChef("Michel", "Hiel");
        PList[3] = new KFCPerson("Peter","Wong");
        PList[4] = new TakeAwayChef("kevin", "Chin");


        System.out.println("\n\n==========Array============");
        for(int i = 0 ; i <PList.length;i++){
            PList[i].getName();
            PList[i].cookDinner();
            System.out.print("\n");
        }
    }
}