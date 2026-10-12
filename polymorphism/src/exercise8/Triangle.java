package exercise8;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(){
        // Simple console drawing, not to scale.
        System.out.println("   *   ");
        System.out.println("  * *  ");
        System.out.println(" *   * ");
        System.out.println("*******");
    }

    @Override
    public double calculateArea(){
        return 0.5 * base * height;
    }
}
