package exercise7;

public class Panthera extends Animal {
    @Override
    public void move(){
        System.out.println("The big cat walks and runs on four legs.");
    }

    @Override
    public void makeSound(){
        System.out.println("The big cat growls.");
    }
}
