// 18. Write a program to check whether a person is eligible to vote or Not using switch statement
import java.util.Scanner;

public class Qno18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Please enter a valid age.");
        } else {
            switch (age >= 18 ? 1 : 0) {
                case 1:
                    System.out.print("You are eligible to vote.");
                    break;
                case 0:
                    System.out.print("You are not eligible to vote.");
                    break;
            }
        }
        sc.close();
    }
}
