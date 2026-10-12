package exercise10;

public class Panther extends Animal {
    @Override
    public void eat(){
        System.out.println("The panther eats meat, such as wild boar.");
    }

    @Override
    public void sound(){
        System.out.println("The panther snarls.");
    }
}
