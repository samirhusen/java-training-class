// 11. Write a program to read gender(M/F) and print the corresponding gender using a switch statement
import java.util.Scanner;

public class Qno11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input gender (M/F): ");
        String gender = sc.nextLine();

        switch (gender) {
            case "M":
            case "m":
                System.out.println("Male");
                break;
            case "F":
            case "f":
                System.out.println("Female");
                break;
            default:
                System.out.println("Please enter M or F.");
        }

        sc.close();
    }
}
