import java.util.Scanner;

public class Qno6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Input height in inches: ");
        double heightInches = scanner.nextDouble();

        if (weightPounds <= 0) {
            System.out.println("Please enter a valid weight.");
        } else if (heightInches <= 0) {
            System.out.println("Please enter a valid height.");
        }
        else {
            // Convert pounds to kilograms
            double weightKilograms = weightPounds * 0.45359237;
            // Convert each height factor from inches to meters
            double heightSquared = heightInches * 0.0254 * heightInches * 0.0254;
            // BMI = weight in kilograms / (height in meters squared)
            double bmi = weightKilograms / heightSquared;

            System.out.println("Body Mass Index is " + bmi);
        }

        scanner.close();
    }
}
