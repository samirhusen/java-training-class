// 14. Write a Java program to find the common elements between two arrays (string values).

import java.util.Arrays;

public class Qno14 {
    public static void main(String[] args) {
        String[] firstArr = {"Sam", "Alex", "Sam", "John"};
        String[] secondArr = {"John", "Sam", "Sam", "Mary"};

        System.out.println("First array: " + Arrays.toString(firstArr));
        System.out.println("Second array: " + Arrays.toString(secondArr));

        for (int i = 0; i < firstArr.length; i++) {
            boolean alreadyChecked = false;

            // Skip a name if it appeared earlier in the first array.
            for (int j = 0; j < i; j++) {
                if (firstArr[i].equals(firstArr[j])) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            // Look for the name in the second array.
            for (int k = 0; k < secondArr.length; k++) {
                if (firstArr[i].equals(secondArr[k])) {
                    System.out.println("Common value: " + firstArr[i]);
                    break;
                }
            }
        }
    }
}
