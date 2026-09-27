// 19. Write a program to find the Maximum of Two Numbers using switch statement
import java.util.Scanner;

public class Qno19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        int result = (firstNumber > secondNumber) ? 1 : 0;

        if (firstNumber == secondNumber){
            System.out.print("Both number are equal.");
        }
        switch (result) {
            case 1:
                System.out.print("The first number is greater than the second number.");
                break;
            case 0:
                System.out.print("The second number is greater than the first number.");
                break;
        }
        sc.close();
    }
}
