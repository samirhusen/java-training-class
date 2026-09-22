import java.util.Scanner;

public class Qno11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a floating-point value: ");
        double number = scanner.nextDouble();

        // A finite value is neither infinity nor NaN (Not a Number).
        System.out.println(number + (Double.isFinite(number) ? " is finite." : " is not finite."));
        scanner.close();
    }
}
