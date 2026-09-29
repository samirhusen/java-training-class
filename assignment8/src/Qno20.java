// 20. Write a Java program to test the equality of two arrays.

import java.util.Arrays;

public class Qno20 {
    public static void main(String[] args) {
        int[] firstArr = {1, 2, 3, 4};
        int[] secondArr = {1, 2, 3, 4};

        System.out.println("First array: " + Arrays.toString(firstArr));
        System.out.println("Second array: " + Arrays.toString(secondArr));

        // Equal arrays have the same length and the same values in the same order.
        if (Arrays.equals(firstArr, secondArr)) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
