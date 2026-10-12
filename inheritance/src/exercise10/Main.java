package exercise10;

public class Main {
    public static void main(String[] args){
        Manager manager = new Manager();
        manager.name = "John";
        manager.address = "10 Main Street";
        manager.salary = 80000;
        manager.jobTitle = "Manager";

        manager.generatePerformanceReport("Led the team successfully.");
        System.out.println("Bonus: $" + manager.calculateBonus());
        manager.manageProject("Customer Portal");

        System.out.println();

        Developer developer = new Developer();
        developer.name = "Sarah";
        developer.address = "20 Oak Street";
        developer.salary = 70000;
        developer.jobTitle = "Developer";

        developer.generatePerformanceReport("Delivered the application on time.");
        System.out.println("Bonus: $" + developer.calculateBonus());
        developer.manageProject("Mobile Application");

        System.out.println();

        Programmer programmer = new Programmer();
        programmer.name = "Alex";
        programmer.address = "30 Park Street";
        programmer.salary = 60000;
        programmer.jobTitle = "Programmer";

        programmer.generatePerformanceReport("Completed coding tasks successfully.");
        System.out.println("Bonus: $" + programmer.calculateBonus());
        programmer.manageProject("Inventory Tool");
    }
}
