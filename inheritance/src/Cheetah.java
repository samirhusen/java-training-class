// 6. Write a Java program to create a class called Animal with a method named move().
//   Create a subclass called Cheetah that overrides the move() method to run.
public class Cheetah extends Animal {
    @Override
    public void move(){
        System.out.println("Cheetah Run !!");
    }

    static void main(String[] args){
        Animal animal = new Animal();
        animal.makeSound();

        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
