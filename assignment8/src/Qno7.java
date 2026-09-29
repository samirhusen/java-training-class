// 7. Write a Java program to remove a specific element from an array.
import java.util.Arrays;
import java.util.Scanner;

public class Qno7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a specific number to remove it from an array: ");

        int search = sc.nextInt();
        System.out.println("Example array : [1, 2, 3, 4, 5, 6]");

        int[] numArr = {1, 2, 3, 4, 5, 6};
        int index = -1;

        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i] == search){
                index = i;
                break;
            }
        }

        if (index>=0){
            int[] removedArr = new int[numArr.length - 1];
            int j = 0;

            for (int i = 0; i < numArr.length; i++) {
                // Skip the element to remove and copy the others.
                if (i != index) {
                    removedArr[j] = numArr[i];
                    j++;
                }
            }

            System.out.println("Array after removal: " + Arrays.toString(removedArr));
        } else {
            System.out.println("The given number does not exist inside the array.");
            System.out.println("Array unchanged: " + Arrays.toString(numArr));
        }
        sc.close();

    }
}
