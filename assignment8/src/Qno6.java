// 6. Write a Java program to find the index of an array element.
import java.util.Scanner;

public class Qno6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a specific number to get its index in an array: ");

        int search = sc.nextInt();
        System.out.println("Example array : [1, 2, 3, 4, 5, 6]");

        int[] numArr = {1, 2, 3, 4, 5, 6};
        int index = -1;

        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i] == search){
                index = i;
            }
        }

        if (index>=0){
            System.out.print("The number " + search + " is found at the index " + index + " in the array.");
        } else {
            System.out.print("The given number does not exists inside the array.");
        }
        sc.close();
    }
}
