import java.util.Locale;

public class Qno13 {
    public static void main (String[] args) {
        double width = 5.6;
        double height = 8.5;

        System.out.printf(Locale.US, "Area is %.1f * %.1f = %.2f%n", width, height, width * height);
        System.out.printf(Locale.US, "Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, 2 * (width + height));
    }
}
