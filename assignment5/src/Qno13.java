// 13. Write a program to Check whether the number is even or odd using switch statement
import java.util.Scanner;

public class Qno13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");

        int number = sc.nextInt();

        switch (number % 2) {
            case 0:
                System.out.println("The number is even.");
                break;
            default:
                System.out.println("The number is odd.");
        }

        sc.close();
    }
}
