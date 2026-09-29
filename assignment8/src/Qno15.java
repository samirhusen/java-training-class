// 15. Write a Java program to find the common elements between two arrays of integers.

public class Qno15 {
    public static void main(String[] args){
        int[] firstArr = {1,2,1,4};
        System.out.println("Example array : [1,2,1,4]");

        int[] secondArr = {1,4,2,2,3,3};
        System.out.println("Example array : [1,4,2,2,3,3]");

        for (int i = 0; i < firstArr.length; i++) {
            boolean alreadyChecked = false;

            // Check earlier positions in the first array
            // skip the number if I have seen this before
            for (int j = 0; j < i; j++) {
                if(firstArr[i] == firstArr[j]){
                    alreadyChecked = true;
                    break;
                }
            }

            if(alreadyChecked){
                continue; // Skip this value and move to the next i.
            }

            for (int k = 0; k < secondArr.length; k++) {
                if (firstArr[i] == secondArr[k]) {
                    System.out.println("Common value: " + firstArr[i]);
                    break;
                }
            }
        }

    }
}
