// 5. Write a Java program to test if an array contains a specific value.
import java.util.Scanner;

public class Qno5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a specific number to search in an array: ");

        int search = sc.nextInt();
        System.out.println("Example array : [1, 2, 3, 4, 5, 6]");

        int[] numArr = {1, 2, 3, 4, 5, 6};
        boolean found = false;

        for (int i : numArr) {
            if (i == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The number " + search + " is found in the array.");
        } else {
            System.out.println("The number " + search + " is not found in the array.");
        }
        sc.close();
    }
}
