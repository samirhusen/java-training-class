// 8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//    Test Data
//    Input an alphabet: p
//    Expected Output :
//    Input letter is Consonant

import java.util.Scanner;

public class Qno8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = sc.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Please enter a single letter from a-z or A-Z.");
        } else {
            char letter = input.charAt(0);
            boolean isLetter = (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z');

            if (!isLetter) {
                System.out.println("Error: Please enter a single letter from a-z or A-Z.");
            } else if ("aeiouAEIOU".indexOf(letter) >= 0) {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }

        sc.close();
    }
}
