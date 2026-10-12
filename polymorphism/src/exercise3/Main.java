package exercise3;

public class Main {
    public static void main(String[] args){
        Shape shape = new Shape();
        System.out.println("The area of the base shape is : " + shape.calculateArea());
        System.out.println("---------");

        Shape circle = new Circle(2.74);
        Shape rectangle = new Rectangle(5, 4);
        Shape triangle = new Triangle(5, 3);

        System.out.println("The area of the circle is : " + circle.calculateArea());
        System.out.println("The area of the rectangle is : " + rectangle.calculateArea());
        System.out.println("The area of the triangle is : " + triangle.calculateArea());
    }
}
