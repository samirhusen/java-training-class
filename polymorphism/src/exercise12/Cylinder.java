package exercise12;

public class Cylinder extends Shape {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void draw(){
        // Simple console drawing, not to scale.
        System.out.println("  _____  ");
        System.out.println(" /     \\");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println(" \\_____/");
    }

    @Override
    public double calculateArea(){
        // Total surface area = two circular ends + curved surface.
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}
