// 13. Write a Java program to find the duplicate values of an array of string values.

public class Qno13 {
    public static void main(String[] args){
        String[] names = {"Sam", "Alex", "John", "Sam", "Alexx", "Rock"};
        System.out.println("Example array : [Sam, Alex, John, Sam, Alexx]");

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) { // function to check the string comparison
                    System.out.println("Duplicate values: " + names[i]);
                }
            }
        }

    }
}
