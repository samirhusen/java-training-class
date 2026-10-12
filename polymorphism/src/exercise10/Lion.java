package exercise10;

public class Lion extends Animal {
    @Override
    public void eat(){
        System.out.println("The lion eats meat, such as zebra.");
    }

    @Override
    public void sound(){
        System.out.println("The lion roars.");
    }
}
