import java.util.Scanner;

public class Qno12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int first = scanner.nextInt();

        System.out.print("Input 2nd integer: ");
        int second = scanner.nextInt();

        int signedComparison = Integer.compare(first, second);
        int unsignedComparison = Integer.compareUnsigned(first, second);

        // -1 means first is smaller, 0 means equal, 1 means first is larger
        System.out.println("Signed comparison: " + signedComparison);
        System.out.println("Unsigned comparison: " + unsignedComparison);

        scanner.close();
    }
}
