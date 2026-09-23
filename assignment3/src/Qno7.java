import java.util.Scanner;

public class Qno7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // loop for multiplication
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}