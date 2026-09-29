// 12. Write a Java program to find the duplicate values of an array of integer values.

public class Qno12 {
    public static void main(String[] args){
        int[] numArr = {-1, 0, 1, 29, 3, 40, 5, 62, 3, 29, 44};

        System.out.println("Example array : [-1, 0, 1, 29, 3, 40, 5, 62, 3, 29, 44]");

        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if(numArr[i] == numArr[j]){
                    System.out.println("Duplicate values: " + numArr[i]);
                }
            }
        }

    }
}
