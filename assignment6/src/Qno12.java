// 12. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

import java.util.Scanner;

public class Qno12 {
    public static void main(String[] args){
        System.out.print("Input the 5 numbers: ");

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        int fourthNumber = sc.nextInt();
        int fifthNumber = sc.nextInt();

        System.out.println("The sum of 5 no is : " + (firstNumber+secondNumber+thirdNumber+fourthNumber+fifthNumber));
        System.out.println("The Average is : " + (double) (firstNumber+secondNumber+thirdNumber+fourthNumber+fifthNumber)/2);
    }
}
