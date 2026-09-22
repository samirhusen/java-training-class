import java.util.Scanner;

public class Qno9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 1st integer: "); // 1st input
        int first = scanner.nextInt();

        System.out.print("Input 2nd integer: "); // 2nd input
        int second = scanner.nextInt();

        // Convert to long before calculating to avoid overflow with large number
        long sum = (long) first + second;
        long difference = (long) first - second;
        long product = (long) first * second;

        double average = sum / 2.0; // keep decimal 2.0 to save fractional value
        long distance = Math.abs(difference);
        int maximum = Math.max(first, second); //max
        int minimum = Math.min(first, second); //min

        // Print all values
        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + difference);
        System.out.println("Product of two integers: " + product);
        System.out.printf("Average of two integers: %.2f%n", average);
        System.out.println("Distance of two integers: " + distance);
        System.out.println("Max integer: " + maximum);
        System.out.println("Min integer: " + minimum);

        scanner.close();
    }
}
