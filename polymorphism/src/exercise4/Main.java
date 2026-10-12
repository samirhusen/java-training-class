package exercise4;

public class Main {
    public static void main(String[] args){
        // Example monthly salary rules: manager bonus and programmer overtime.
        Employee manager = new Manager(5000, 1000);
        Employee programmer = new Programmer(4000, 10, 30);

        System.out.println("Manager salary: " + manager.calculateSalary());
        System.out.println("Programmer salary: " + programmer.calculateSalary());
    }
}
