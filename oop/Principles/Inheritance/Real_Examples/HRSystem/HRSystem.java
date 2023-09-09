package oop.Principles.Inheritance.Real_Examples.HRSystem;
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculatePay() {
        // Placeholder for calculating employee pay
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        // Manager's pay includes salary and bonus
        return super.calculatePay() + bonus;
    }
}

class Engineer extends Employee {
    private int skillLevel;

    public Engineer(String name, double salary, int skillLevel) {
        super(name, salary);
        this.skillLevel = skillLevel;
    }

    @Override
    public double calculatePay() {
        // Engineer's pay may be based on skill level, bonuses, etc.
        return super.calculatePay() + (skillLevel * 1000);
    }
}

class SalesPerson extends Employee {
    private boolean salesTargetsMet;

    public SalesPerson(String name, double salary, boolean salesTargetsMet) {
        super(name, salary);
        this.salesTargetsMet = salesTargetsMet;
    }

    @Override
    public double calculatePay() {
        // Salesperson's pay may be based on sales performance
        if (salesTargetsMet) {
            return super.calculatePay() + 500;
        } else {
            return super.calculatePay();
        }
    }
}

public class HRSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 60000, 10000);
        Engineer engineer = new Engineer("Alice Smith", 55000, 3);
        SalesPerson salesperson = new SalesPerson("Bob Johnson", 50000, true);

        System.out.println("Manager's pay: " + manager.calculatePay());  // Output: 70000.0 (salary + bonus)
        System.out.println("Engineer's pay: " + engineer.calculatePay());  // Output: 85000.0 (salary + skillLevel * 1000)
        System.out.println("Salesperson's pay: " + salesperson.calculatePay());  // Output: 50500.0 (salary + 500 bonus for meeting sales targets)
    }
}

