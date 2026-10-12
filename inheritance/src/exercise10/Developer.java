package exercise10;

public class Developer extends Employee {
    @Override
    public double calculateBonus(){
        return salary * 0.08; // Example bonus: 8% of salary
    }
}
