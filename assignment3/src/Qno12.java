import java.util.Scanner;

public class Qno12 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        double first = scanner.nextDouble();

        System.out.print("Input second number: ");
        double second = scanner.nextDouble();

        System.out.print("Input third number: ");
        double third = scanner.nextDouble();

        System.out.println("Average is = " + ((first + second + third) / 3));
        scanner.close();
    }
}
