// 10. Write a Java program to find the maximum and minimum value of an array.

public class Qno10 {
    public static void main(String[] args){
        int[] numArr = {-1, 0, 1, 29, 3, 40, 5, 62};

        int min = numArr[0];
        int max = numArr[0];

        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }

            if (numArr[i] < min) {
                min = numArr[i];
            }
        }

        System.out.println("Example array : [-1, 0, 1, 29, 3, 40, 5, 62]");
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
