import java.util.Scanner;

public class Qno6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int first = scanner.nextInt();

        System.out.print("Input second number: ");
        int second = scanner.nextInt();

        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " x " + second + " = " + (first * second));

        if (second == 0) {
            System.out.println("Division and remainder are undefined when the second number is zero.");
        } else {
            System.out.println(first + " / " + second + " = " + (first / second));
            System.out.println(first + " mod " + second + " = " + (first % second));
        }

    }
}
