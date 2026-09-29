// 11. Display n terms of natural numbers and their sum.
import java.util.Scanner;

public class Qno11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();

        long sum = 0;
        System.out.println("The first " + n + " natural numbers are:");
        for (long i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Numbers up to " + n + " terms: " + sum);
        sc.close();
    }
}
