// 6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
//    and methods to calculate and update salary.
// 9. Add a hire date and a method to calculate years of service.

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    String name;
    String jobTitle;

    int hoursWorked;
    int hourlyWages;
    private double salary;
    private LocalDate hireDate;

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary() {
        salary = (double) hourlyWages * hoursWorked;
    }

    public void updateSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public int calculateYearsOfService() {
        // Count completed years from the hire date to today.
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        // 1st person
        Employee employee1 = new Employee();
        employee1.setName("Samir Husen");
        employee1.setJobTitle("Software Developer");
        employee1.setHoursWorked(57);
        employee1.setHourlyWages(60);
        employee1.calculateSalary();
        employee1.setHireDate(LocalDate.of(2020, 6, 15));

        // 2nd person
        Employee employee2 = new Employee();
        employee2.setName("Pratik Thapa");
        employee2.setJobTitle("Data Analyst");
        employee2.setHoursWorked(46);
        employee2.setHourlyWages(65);
        employee2.calculateSalary();
        employee2.setHireDate(LocalDate.of(2023, 3, 1));

        System.out.println("The salary of " + employee1.name + " working as " + employee1.jobTitle + " is $" + employee1.getSalary());
        System.out.println("The salary of " + employee2.name + " working as " + employee2.jobTitle + " is $" + employee2.getSalary());

        // Set a new salary directly after calculating and printing the original salary.
        employee1.updateSalary(4010);
        System.out.println("The updated salary of " + employee1.name + " is $" + employee1.getSalary());

        System.out.println(employee1.name + " was hired on " + employee1.getHireDate()
                + " and has " + employee1.calculateYearsOfService() + " years of service.");
        System.out.println(employee2.name + " was hired on " + employee2.getHireDate()
                + " and has " + employee2.calculateYearsOfService() + " years of service.");
    }
}
