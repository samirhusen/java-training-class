// 1.  Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;

public class Qno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number:");

        double number = sc.nextInt();

        System.out.print((number > 0) ? "Number is positive" : "Number is negative");
        sc.close();
    }
}
