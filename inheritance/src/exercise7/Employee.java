package exercise7;

public class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public int getEmployeeId(){
        return employeeId;
    }

    @Override
    public String getLastName(){
        return lastName + " (" + jobTitle + ")";
    }

    public static void main(String[] args){
        Employee employee = new Employee();
        employee.firstName = "John";
        employee.lastName = "Smith";
        employee.employeeId = 101;
        employee.jobTitle = "Developer";

        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
