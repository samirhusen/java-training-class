// 15. Write a program to create simple calculator using switch Statement
import java.util.Scanner;

public class Qno15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        double firstNumber = sc.nextDouble();

        System.out.print("Input an operator (+, -, *, /): ");
        String operator = sc.next();

        System.out.print("Input second number: ");
        double secondNumber = sc.nextDouble();

        switch (operator) {
            case "+":
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        sc.close();
    }
}
