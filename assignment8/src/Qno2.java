// 2. Write a Java program to sum values of an array.

public class Qno2 {
    public static void main(String[] args){
        int[] numArr = {23, 3, 5, 2, 4, 34, 21, 56};
        int sumArr = 0;

        for(int i=0; i<numArr.length; i++) sumArr += numArr[i];

        System.out.print(sumArr);
    }
}
