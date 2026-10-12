package exercise10;

public class Manager extends Employee {
    @Override
    public double calculateBonus(){
        return salary * 0.10; // Example bonus: 10% of salary
    }
}
