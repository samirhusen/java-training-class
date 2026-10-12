package exercise6;

public class Main {
    public static void main(String[] args){
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(5, 4);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
    }
}
