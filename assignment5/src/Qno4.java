// 4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
// Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

import java.util.Scanner;

public class Qno4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");

        double number = sc.nextDouble();

        if (number == 0) {
            System.out.print("zero");
        } else if (number > 0) {
            System.out.print("positive");
        } else {
            System.out.print("negative");
        }
        if (number != 0) {
            double absoluteValue = Math.abs(number);

            if (absoluteValue < 1) {
                System.out.print(" small");
            } else if (absoluteValue > 1_000_000) {
                System.out.print(" large");
            }
        }

        System.out.println();
        sc.close();
    }
}
