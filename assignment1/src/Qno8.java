import java.util.Scanner;

public class Qno8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = scanner.nextDouble();

        double square = number * number;
        double cube = square * number;
        double fourthPower = square * square;

        // %.2f displays each result with two decimal places
        // %n starts a new line.
        System.out.printf("Square: %.2f%n", square);
        System.out.printf("Cube: %.2f%n", cube);
        System.out.printf("Fourth power: %.2f%n", fourthPower);

        scanner.close();
    }
}
