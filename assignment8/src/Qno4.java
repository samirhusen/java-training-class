// 4. Write a Java program to calculate the average value of array elements.
public class Qno4 {
    public static void main(String[] args){
        int[] numArr = {23, 3, 5, 2, 4, 34, 21, 56};
        int sumArr = 0;

        for(int i=0; i<numArr.length; i++) sumArr += numArr[i];

        // total sum divided by array length
        double average = (double) sumArr / numArr.length;
        System.out.print("Average: " + average);

    }
}
