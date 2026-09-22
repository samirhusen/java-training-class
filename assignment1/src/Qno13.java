import java.util.Scanner;

public class Qno13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Input divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            // Floor division rounds the quotient down to an integer
            int floorDivision = Math.floorDiv(dividend, divisor);

            // Floor modulus is the remainder after floor division
            int floorModulus = Math.floorMod(dividend, divisor);

            System.out.println("Floor division: " + floorDivision);
            System.out.println("Floor modulus: " + floorModulus);
        }

        scanner.close();
    }
}
