// 11. Write a Java program to reverse an array of integer values.
import java.util.Arrays;

public class Qno11 {
    public static void main(String[] args){
        int[] numArr = {-1, 0, 1, 29, 3, 40, 5, 62};
        int[] reverseArr = new int[numArr.length];

        int index = 0;
        for (int i = numArr.length-1; i >= 0; i--) {
            reverseArr[index] = numArr[i];
            index++;
        }

        System.out.println("Original array: " + Arrays.toString(numArr));
        System.out.println("Reversed array: " + Arrays.toString(reverseArr));
    }
}
