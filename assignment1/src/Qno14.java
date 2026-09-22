import java.math.BigInteger;
import java.util.Scanner;

public class Qno14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a BigInteger value: ");
        BigInteger number = scanner.nextBigInteger();

        // check the primitive types
        byte byteValue = number.byteValue();
        short shortValue = number.shortValue();
        int intValue = number.intValue();
        long longValue = number.longValue();
        float floatValue = number.floatValue();
        double doubleValue = number.doubleValue();

        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);

        scanner.close();
    }
}
