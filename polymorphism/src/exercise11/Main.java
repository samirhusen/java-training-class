package exercise11;

public class Main {
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.startEngine();
        car.stopEngine();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
