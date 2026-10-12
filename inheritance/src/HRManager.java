// 4. Write a Java program to create a class called Employee with methods called work() and getSalary().
//    Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
public class HRManager extends Employee{
    public HRManager(double salary){
        super(salary);
    }

    @Override
    public void work()
    {
        System.out.println("This is the work() method from child class HRManager!");
    }

    public void addEmployee()
    {
        System.out.println("This is the new addEmployee() method from child class HRManager!");
    }

    public static void main(String[] args){
        Employee employee = new Employee(50000);
        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());

        HRManager hrManager = new HRManager(70000);
        hrManager.work();
        System.out.println("HRManager salary: " + hrManager.getSalary());
        hrManager.addEmployee();
    }
}
