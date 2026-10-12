package exercise10;

public class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public double calculateBonus(){
        return 0;
    }

    public void generatePerformanceReport(String performance){
        System.out.println("Employee: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Performance: " + performance);
    }

    public void manageProject(String projectName){
        System.out.println(name + " is managing project: " + projectName);
    }
}
