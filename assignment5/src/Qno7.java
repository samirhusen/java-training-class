//7. Write a Java program to find the number of days in a month.
//        Test Data
//        Input a month number: 2
//        Input a year: 2016
//        Expected Output :
//        February 2016 has 29 days

import java.time.Year;
import java.util.Scanner;

public class Qno7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a month number: ");
        int month = sc.nextInt();
        System.out.print("Input a year: ");
        int year = sc.nextInt();

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        daysInMonth[1] = Year.isLeap(year) ? 29 : 28;

        if (month < 1 || month > 12) {
            System.out.println("Please enter a month number between 1 and 12.");
        } else if (year < 1) {
            System.out.println("Please enter a positive year.");
        } else {
            int days = daysInMonth[month - 1];
            System.out.println(months[month - 1] + " " + year + " has " + days + " days");
        }

        sc.close();
    }
}
