package exercise8;

public class Square extends Shape {
    private final double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public void draw(){
        // Simple console drawing, not to scale.
        System.out.println("* * * *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("* * * *");
    }

    @Override
    public double calculateArea(){
        return side * side;
    }
}
