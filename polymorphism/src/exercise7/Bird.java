package exercise7;

public class Bird extends Animal {
    @Override
    public void move(){
        System.out.println("The bird flies through the sky.");
    }

    @Override
    public void makeSound(){
        System.out.println("The bird chirps.");
    }
}
