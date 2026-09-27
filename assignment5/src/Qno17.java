// 17. Write a program to Menu driven program using switch statement
// ( Find addition, subtraction, multiplication and division of to integer numbers )

import java.util.Scanner;

public class Qno17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1, 2, 3 or 4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case 4:
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + ((double) firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("Please enter a choice between 1 and 4.");
        }
        sc.close();
    }
}
