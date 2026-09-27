// 2. Write a Java program to solve quadratic equations (use if, else if and else).
import java.util.Scanner;

public class Qno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = sc.nextDouble();

        System.out.print("Input b: ");
        double b = sc.nextDouble();

        System.out.print("Input c: ");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
        } else if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are equal: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }

        sc.close();
    }
}
