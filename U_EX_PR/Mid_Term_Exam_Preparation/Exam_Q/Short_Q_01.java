package U_EX_PR.Mid_Term_Exam_Preparation.Exam_Q;

class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    // Constructor
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double claculateBonus() {
        // apply your Bonus Methods here
        return 0.0;
    }

    public String generatePerfromance() {
        return "Performance Report";
    }
}

class Manager extends Employee {
    private int nOfEmployee;

    public Manager(String name, String address, double salary, String jobTitle, int nOfEmployee) {
        super(name, address, salary, jobTitle);
        this.nOfEmployee = nOfEmployee;
    }

    public void manage() {
        System.out.println("Managing Projects");
    }

    @Override
    public double claculateBonus() {
        return salary * 0.20;
    }

    @Override
    public String generatePerfromance() {
        return "Performance Report";
    }

}

class Developer extends Employee {
    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    public void developerSoftware(){
        System.out.println("Developer is Developing Software");
    }
    @Override
    public double claculateBonus() {
        return salary * 0.20;
    }

    @Override
    public String generatePerfromance() {
        return "Performance Report";
    }

}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public double claculateBonus() {
        return salary * 0.20;
    }

    @Override
    public String generatePerfromance() {
        return "Performance Report";
    }

}

public class Short_Q_01 {
    public static void main(String[] args) {

        Manager m = new Manager("Omer", "Lahore", 60000, "Manager", 20);
        Developer d = new Developer("Ali","Karachi",5000,"Developer");
        Programmer p = new Programmer("Hamza", "Lodhran", 40000, "Programmer");

        // Calculating Bonus
        System.out.println("Manager Bonus: " + m.claculateBonus());
        System.out.println("Developer Bonus: "+d.claculateBonus());
        System.out.println("Programmer Bonus: "+d.claculateBonus()); 

        // manageing projects 
        System.out.println("Manager:");
        m.manage();

        System.out.println("Developer");
        d.developerSoftware();



        // Perfromance Reports
        System.out.println("Manager Performance: "+m.generatePerfromance());
        System.out.println("Developer Performance: "+d.generatePerfromance());
        System.out.println("Programmer Performance: "+p.generatePerfromance());
    }
}
