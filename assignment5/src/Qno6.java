// 6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
//
//        Test Data
//        Input floating-point number: 25.586
//        Input floating-point another number: 25.589
//        Expected Output :
//        They are different

import java.util.Scanner;

public class Qno6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double firstNumber = sc.nextDouble();

        System.out.print("Input floating-point another number: ");
        double secondNumber = sc.nextDouble();

        // Compare whole thousandths after rounding each number.
        long firstRounded = Math.round(firstNumber * 1000);
        long secondRounded = Math.round(secondNumber * 1000);

        if (firstRounded == secondRounded) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }

        sc.close();
    }
}
