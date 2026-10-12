package exercise12;

public class Main {
    public static void main(String[] args){
        Shape circle = new Circle(3);
        Shape cylinder = new Cylinder(3, 5);

        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());

        cylinder.draw();
        System.out.println("Cylinder total surface area: " + cylinder.calculateArea());
    }
}
