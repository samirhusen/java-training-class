public class Qno15 {
    public static void main (String[] args) {
        int first = 12;
        int second = 26;
        System.out.println("Before swap: first = " + first + ", second = " + second);

        int temporary = first;
        first = second;
        second = temporary;
        System.out.println("After swap: first = " + first + ", second = " + second);
    }
}
