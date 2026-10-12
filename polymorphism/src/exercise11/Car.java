package exercise11;

public class Car extends Vehicle {
    @Override
    public void startEngine(){
        System.out.println("Car: press the start button to start the engine.");
    }

    @Override
    public void stopEngine(){
        System.out.println("Car: press the stop button to stop the engine.");
    }
}
