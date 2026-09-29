// 17. Write a Java program to find the second largest element in an array.

import java.util.Arrays;

public class Qno17 {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 5, 62, 81, 3, 10, 13, 18};

        Arrays.sort(numArr); // Arrange values from smallest to largest.

        // Move backward until we find a value smaller than the largest.
        for (int i = numArr.length - 2; i >= 0; i--) {
            if (numArr[i] < numArr[numArr.length - 1]) {
                System.out.println("Second largest value: " + numArr[i]);
                return;
            }
        }

        System.out.println("No second largest value exists.");
    }
}
