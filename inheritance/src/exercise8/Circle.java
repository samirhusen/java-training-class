package exercise8;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    static void main(String[] args){
        Shape shape = new Shape();
        shape.getArea();
        shape.getPerimeter();

        Circle circle = new Circle(2.74);
        System.out.println("The area of circle : " + circle.getArea());
        System.out.println("The perimeter of circle : " + circle.getPerimeter());
    }
}
