package exercise8;

public class Main {
    public static void main(String[] args){
        Shape circle = new Circle(3);
        Shape square = new Square(4);
        Shape triangle = new Triangle(5, 3);

        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());
        square.draw();
        System.out.println("Square area: " + square.calculateArea());
        triangle.draw();
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
