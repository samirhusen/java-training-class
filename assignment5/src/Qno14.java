// 14. Write a program to Find the number of days in a month using a switch statement
import java.time.Year;
import java.util.Scanner;

public class Qno14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a month number: ");
        int month = sc.nextInt();

        System.out.print("Input a year: ");
        int year = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month has 30 days.");
                break;
            case 2:
                int days = Year.isLeap(year) ? 29 : 28;
                System.out.println("The month has " + days + " days.");
                break;
            default:
                System.out.println("Please enter a month number between 1 and 12.");
        }

        sc.close();
    }
}
