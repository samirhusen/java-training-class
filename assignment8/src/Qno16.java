// 16. Write a Java program to remove duplicate elements from an array.

import java.util.Arrays;

public class Qno16 {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 1, 4};
        int[] tempArr = new int[numArr.length];
        int count = 0;

        for (int i = 0; i < numArr.length; i++) {
            boolean alreadyAdded = false;

            // Check only the values already stored in tempArr.
            for (int j = 0; j < count; j++) {
                if (numArr[i] == tempArr[j]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (alreadyAdded) {
                continue;
            }

            tempArr[count] = numArr[i];
            count++;
        }

        // Create an array with exactly enough space for the unique values.
        int[] newArr = new int[count];
        for (int i = 0; i < count; i++) {
            newArr[i] = tempArr[i];
        }

        System.out.println("Original array: " + Arrays.toString(numArr));
        System.out.println("Array without duplicates: " + Arrays.toString(newArr));
    }
}
