import java.util.Arrays;

// 8. Write a Java program to copy an array by iterating the array.
public class Qno8 {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5, 6};

        int[] copyArr = new int[numArr.length];

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }

        System.out.println("Array: " + Arrays.toString(numArr));
        System.out.println("Copied array: " + Arrays.toString(copyArr));
    }
}
