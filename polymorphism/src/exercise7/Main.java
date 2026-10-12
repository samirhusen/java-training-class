package exercise7;

public class Main {
    public static void main(String[] args){
        Animal bird = new Bird();
        Animal panthera = new Panthera();

        bird.move();
        bird.makeSound();
        panthera.move();
        panthera.makeSound();
    }
}
