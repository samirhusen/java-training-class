// 4. Write a Java program to create a class called "Circle" with a radius attribute.
//    You can access and modify this attribute. Calculate the area and circumference of the circle.

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        // Area = pi × radius × radius
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        // Circumference = 2 × pi × radius
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);

        System.out.println("The radius of the circle is " + circle.getRadius());
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());

        circle.setRadius(10);

        System.out.println("After updating the radius:");
        System.out.println("The radius of the circle is " + circle.getRadius());
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());
    }
}
