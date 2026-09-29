// 18. Write a Java program to find the second smallest element in an array.
import java.util.Arrays;

public class Qno18 {
    public static void main(String[] args){
        int[] numArr = {2, 3, 1, 62, 81, 3, 10, 13, 18};

        Arrays.sort(numArr); // Arrange values from smallest to largest.

        // Find the first value greater than the smallest value.
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > numArr[0]) {
                System.out.println("Second smallest value: " + numArr[i]);
                return;
            }
        }

        System.out.println("No second smallest value exists.");
    }
}
