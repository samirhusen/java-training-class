//3. Write a Java program to create a class called Shape with a method called getArea().
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
public class Rectangle extends Shape {
    private final int length;
    private final int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea(){
        // Area = length * Width
        return length * width;
    }

    public static void main(String[] args){
        Shape shape = new Shape();
        System.out.println("Shape area: " + shape.getArea());

        Rectangle rectangle = new Rectangle(100,20);
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}
