import java.util.Scanner;

public class Qno2 {
    public static void main(String[] args) {
        // get the input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a value for inch: ");

        // read the input value
        double inches = scanner.nextDouble();

        // convert
        double meters = inches * 0.0254; // formulae to convert

        // Print out the result
        System.out.println(inches + " inch is " + meters + " meters");
        scanner.close();
    }
}
