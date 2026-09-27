// 5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
//
//        Test Data
//        Input number: 3
//        Expected Output :
//        Wednesday

import java.util.Scanner;

public class Qno5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = sc.nextInt();

        String[] weekdays = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        if (number >= 1 && number <= weekdays.length) {
            System.out.println(weekdays[number - 1]);
        } else {
            System.out.println("Please enter a number between 1 and 7.");
        }
        sc.close();
    }
}
