// 3. Write a Java program that takes three numbers from the user and prints the greatest number.
import java.util.Scanner;

public class Qno3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Input the 2nd number: ");
        int secondNumber = sc.nextInt();

        System.out.print("Input the 3rd number: ");
        int thirdNumber = sc.nextInt();
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("The greatest number is: " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("The greatest number is: " + secondNumber);
        } else {
            System.out.println("The greatest number is: " + thirdNumber);
        }

        sc.close();
    }
}
