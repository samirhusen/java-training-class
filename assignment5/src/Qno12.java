// 12. Write a program to Check whether a character is a vowel or consonant using switch statement
import java.util.Scanner;

public class Qno12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a character: ");
        String input = sc.nextLine();

        if (input.length() != 1) {
            System.out.println("Please enter a single letter from a-z or A-Z.");
        } else {
            char letter = input.charAt(0);
            boolean isLetter = (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z');

            if (!isLetter) {
                System.out.println("Please enter a single letter from a-z or A-Z.");
            } else {
                switch (Character.toLowerCase(letter)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("Vowel");
                        break;
                    default:
                        System.out.println("Consonant");
                }
            }
        }

        sc.close();
    }
}
