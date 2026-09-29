// 9. Write a Java program to insert an element (specific position) into an array.

import java.util.Arrays;
import java.util.Scanner;

public class Qno9 {
    public static void main(String[] args){
        int[] numArr = {1, 2, 3, 4, 5, 6};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to insert it in an existing [1, 2, 3, 4, 5, 6] array: ");
        int number = sc.nextInt();

        System.out.println("Enter the index/position where you want to insert the " + number + " at:");
        int position = sc.nextInt();

        if(position < 0 || position > numArr.length){
            System.out.print("Invalid position/index!");
            return;
        }

        int[] newArr = new int[numArr.length + 1]; // new array with 1 extra space for new value

        for (int i = 0; i < position; i++) {
            // copy the values in new array if it has any before the index/position where the new element is to be inserted
            newArr[i] = numArr[i];
        }

        newArr[position] = number; // insert the element in the provided index/position

        for (int i = position; i <= numArr.length-1; i++) {
            // after the position/index where the new value is inserted start inserting the remaining values
            newArr[i + 1] = numArr[i];
        }

        System.out.println("Original array: " + Arrays.toString(numArr));
        System.out.println("New array: " + Arrays.toString(newArr));
    }
}
