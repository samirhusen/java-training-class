import java.util.Scanner;

public class Qno7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        float distanceMeters = scanner.nextFloat();

        System.out.print("Input hour: ");
        int hours = scanner.nextInt();

        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        // Convert the hours, minutes, and seconds into total seconds
        float totalSeconds = hours * 3600.0f + minutes * 60.0f + seconds;

        if (distanceMeters < 0 || hours < 0 || minutes < 0 || seconds < 0) {
            System.out.println("Distance and time must be a valid number or greater than zero.");
        } else if (totalSeconds == 0) {
            System.out.println("Time taken must be greater than zero.");
        } else {
            // Speed = distance / time, using the units required for each result.
            float metersPerSecond = distanceMeters / totalSeconds;
            float totalHours = totalSeconds / 3600.0f; // 60 sec * 60 min = 3600 secs
            float kilometersPerHour = (distanceMeters / 1000.0f) / totalHours; // 1 kilometer = 1000 meters

            // 1 mile = 1609 meters = 1.609 kilometers.
            float milesPerHour = kilometersPerHour / 1.609f;

            System.out.println("Your speed in meters/second is " + metersPerSecond);
            System.out.println("Your speed in km/h is " + kilometersPerHour);
            System.out.println("Your speed in miles/h is " + milesPerHour);
        }

        scanner.close();
    }
}
