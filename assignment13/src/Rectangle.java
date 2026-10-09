// 3. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

public class Rectangle {

    double width;
    double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        // Area = Width × Height
        return width * height;
    }

    public double getPerimeter() {
        // Perimeter = 2 × (Width + Height)
        return 2 * (width + height);
    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(5);
        rectangle.setHeight(10);

        System.out.println("The area of the rectangle is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
    }
}
