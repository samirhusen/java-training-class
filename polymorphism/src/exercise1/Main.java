package exercise1;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        Animal bird = new Bird();
        Animal cat = new Cat();

        animal.Sound();
        bird.Sound();
        cat.Sound();
    }
}
