import java.util.Scanner;

public class Qno15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a floating-point number: ");
        double number = scanner.nextDouble();

        // Move one step toward positive infinity
        double nextHigher = Math.nextUp(number);

        // Move one step toward negative infinity
        double nextLower = Math.nextDown(number);

        System.out.println("Next value toward positive infinity: " + nextHigher);
        System.out.println("Next value toward negative infinity: " + nextLower);

        scanner.close();
    }
}
