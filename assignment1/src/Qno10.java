import java.util.Scanner;

public class Qno10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        String number = scanner.next();

        // Read one digit at a time, starting at position 0
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            System.out.print(digit + " ");
        }
        System.out.println();

        scanner.close();
    }
}
