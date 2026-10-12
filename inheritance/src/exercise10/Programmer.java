package exercise10;

public class Programmer extends Employee {
    @Override
    public double calculateBonus(){
        return salary * 0.05; // Example bonus: 5% of salary
    }
}
