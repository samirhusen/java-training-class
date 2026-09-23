import java.util.Scanner;

public class Qno5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // first number
        System.out.print("Input first number: ");
        int first = sc.nextInt();

        // second number
        System.out.print("Input second number: ");
        int second = sc.nextInt();

        // multiplication
        System.out.println(first + " x " + second + " = " + (first * second));
        sc.close();
    }
}
