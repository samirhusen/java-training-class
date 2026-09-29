//1. Write a Java program to sort a numeric array and a string array.
//    Ex: {23,3,5,2,4} ---> 2,3,4,5,23
//    {"Rama", "Krishna"} ---> Krishna, Rama

import java.util.Arrays;

public class Qno1 {
    public static void main(String[] args) {

        int[] numArr = {23, 3, 5, 2, 4};

        String[] nameArr = {"Rama", "Krishna", "Samir", "Pratik"};

        Arrays.sort(numArr);
        Arrays.sort(nameArr);

        System.out.println("Sorted numbers: " + Arrays.toString(numArr));
        System.out.println("Sorted names: " + Arrays.toString(nameArr));
    }
}
