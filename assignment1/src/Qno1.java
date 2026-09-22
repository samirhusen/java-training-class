import java.util.Scanner;

public class Qno1 {
    public static void main(String[] args) {
        // get the input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");

        // read the input value
        double fahrenheit = scanner.nextDouble();

        // convert
        double celsius = (fahrenheit - 32) * 5.0 / 9.0; // formulae to convert

        // Print out the result
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        scanner.close();
    }
}
