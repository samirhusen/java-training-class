package exercise12;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void draw(){
        // Simple console drawing, not to scale.
        System.out.println("  ***  ");
        System.out.println(" *   * ");
        System.out.println("*     *");
        System.out.println(" *   * ");
        System.out.println("  ***  ");
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
