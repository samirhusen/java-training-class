// 16. Write a program to print remark according to the grade obtained using switch statement
import java.util.Scanner;

public class Qno16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the grade to get the remarks: ");
        String grade = sc.nextLine();

        switch (grade){
            case"A":
            case"a":
                System.out.print("Excellent");
                break;
            case"B":
            case"b":
                System.out.print("Very good");
                break;
            case"C":
            case"c":
                System.out.print("Good");
                break;
            case"D":
            case"d":
                System.out.print("Satisfactory");
                break;
            case"E":
            case"e":
                System.out.print("Needs improvement");
                break;
            case"F":
            case"f":
                System.out.print("Fail");
                break;
            default:
                System.out.print("Please enter a valid grade!");
                break;
        }
        sc.close();
    }
}
