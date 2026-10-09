// 2. Write a Java program to create a class called "Dog" with a name and breed attribute.
//    Create two instances of the "Dog" class, set their attributes using the constructor and
//    modify the attributes using the setter methods and print the updated values.

public class Dog {

    String name;
    String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public static void main(String[] args){
        Dog dog1 = new Dog("Max", "German Shepfherd");
        Dog dog2 = new Dog("Rock", "Poodle");

        System.out.println("The name of the 1st dog is " + dog1.name + " and the dog breed is " + dog1.breed);
        System.out.println("The name of the 2nd dog is " + dog2.name + " and the dog breed is " + dog2.breed);

        // updating dog 1 using set methods
        dog1.setName("May");
        dog1.setBreed("Bulldog");

        // updating dog 2 using set methods
        dog2.setName("Hood");
        dog2.setBreed("Rottweiler");

        System.out.println(">>>>> Updating the name and bread using setter methods..........");
        System.out.println("The name of the 1st dog after update is " + dog1.name + " and the dog breed is " + dog1.breed);
        System.out.println("The name of the 2nd dog after update is " + dog2.name + " and the dog breed is " + dog2.breed);
    }
}
