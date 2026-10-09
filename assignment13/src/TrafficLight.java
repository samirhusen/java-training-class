// 8. Create a TrafficLight with color and duration attributes, and methods
//    to change the color and check for red or green.

public class TrafficLight {

    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public boolean isRed() {
        return "red".equalsIgnoreCase(color);
    }

    public boolean isGreen() {
        return "green".equalsIgnoreCase(color);
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);

        System.out.println("Color: " + light.getColor());
        System.out.println("Duration: " + light.getDuration() + " seconds");
        System.out.println("Is red? " + light.isRed());
        System.out.println("Is green? " + light.isGreen());

        light.changeColor("Green");

        System.out.println("After changing the color:");
        System.out.println("Color: " + light.getColor());
        System.out.println("Is red? " + light.isRed());
        System.out.println("Is green? " + light.isGreen());
    }
}
