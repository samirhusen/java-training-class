// 9. Write a Java program that takes a year from the user and prints whether it is a leap year or not.
//  Test Data
//  Input the year: 2016
//  Expected Output :
//  2016 is a leap year

import java.time.Year;
import java.util.Scanner;

public class Qno9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = sc.nextInt();

        if (Year.isLeap(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
