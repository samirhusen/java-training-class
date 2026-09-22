import java.util.Scanner;

public class Qno4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        long minutes = scanner.nextLong();

        if (minutes < 0) {
            System.out.println("Please enter a valid number of minutes.");
        } else {
            // Day = 60 * 24 minutes
            long totalDays = minutes / (60 * 24);

            // 1 year = 365 days
            long years = totalDays / 365;
            long days = totalDays % 365; // days mod numbers in a year

            System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
        }

        scanner.close();
    }
}
