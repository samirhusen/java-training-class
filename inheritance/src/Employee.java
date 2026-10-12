// 4. Write a Java program to create a class called Employee with methods called work() and getSalary().
//    Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
public class Employee {
    private final double salary;

    public Employee(double salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println("This is the work() method from parent class!");
    }

    public double getSalary(){
        return salary;
    }
}
