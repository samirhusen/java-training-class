import java.util.Scanner;

public class Qno5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        long offset = scanner.nextLong();

        // Get the seconds, minutes, and hours since January 1, 1970, GMT.
        long totalSeconds = System.currentTimeMillis() / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        // Apply the offset in hours and keep the hour between 0 and 23.
        // floorMod also handles negative offsets correctly.
        long currentHour = Math.floorMod(totalHours + offset % 24, 24);

        System.out.printf("Current time is %02d:%02d:%02d%n", currentHour, currentMinute, currentSecond);

        scanner.close();
    }
}
