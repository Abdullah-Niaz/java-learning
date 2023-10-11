package U_EX_PR.Mid_Term_Exam_Preparation.inheritance;


class Address{
    String country;
    String state;
    String city;
    public Address(String country, String state,String city){
        this.country = country;
        this.state = state;
        this.city  = city;
    }
    public void showAddress() {
        System.out.println("Country: " + country +" City : " + city + " State is: " + state);
    }
}

class person {
    String name;
    String job;
    Address address ;
    public person(String name, String job,Address address){
        this.name = name;
        this.job = job;
        this.address = address;
    }

    public void showDetails(){
        System.out.println("Name of the Person: " + this.name + "\n Job Title is "+ this.job);
        address.showAddress();
    }
}


public class test2 {
    public static void main(String[] args){
        Address ad = new Address("Pakistan", "PUnjab", "Multan");

        person p = new person("Abdullah", "Developer", ad);
        p.showDetails();
        
    }
}
