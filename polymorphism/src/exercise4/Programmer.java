package exercise4;

public class Programmer extends Employee {
    private final double overtimeHours;
    private final double overtimeRate;

    public Programmer(double baseSalary, double overtimeHours, double overtimeRate){
        super(baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + overtimeHours * overtimeRate;
    }
}
