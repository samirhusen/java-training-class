package exercise4;

public class Manager extends Employee {
    private final double bonus;

    public Manager(double baseSalary, double bonus){
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + bonus; // Example rule: base salary plus bonus
    }
}
