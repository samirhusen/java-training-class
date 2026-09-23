import java.util.Scanner;

public class Qno2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // first number
        System.out.print("Input first number: ");
        int firstNumber = sc.nextInt();

        // second number
        System.out.print("Input second number: ");
        int secondNumber = sc.nextInt();

        // addition
        int result = firstNumber + secondNumber;

        System.out.print(result);
        sc.close();
    }
}
