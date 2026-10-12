package exercise11;

public class Motorcycle extends Vehicle {
    @Override
    public void startEngine(){
        System.out.println("Motorcycle: use the kick starter to start the engine.");
    }

    @Override
    public void stopEngine(){
        System.out.println("Motorcycle: use the engine stop switch to stop the engine.");
    }
}
