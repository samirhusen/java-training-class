package exercise2;

public class Bicycle extends Vehicle {
    @Override
    public void speedUp(){
        speed += 2;
        System.out.println("Bicycle speed: " + speed + " km/h");
    }
}
