package exercise10;

public class Tiger extends Animal {
    @Override
    public void eat(){
        System.out.println("The tiger eats meat, such as deer.");
    }

    @Override
    public void sound(){
        System.out.println("The tiger growls.");
    }
}
