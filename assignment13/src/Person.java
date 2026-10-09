// 1. Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Sam", 27);
        Person person2 = new Person("Alex", 25);

        System.out.println(person1.name + " is " + person1.age + " years old.");
        System.out.println(person2.name + " is " + person2.age + " years old.");
    }
}