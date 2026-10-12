package exercise2;

public class Vehicle {
    protected int speed = 0;

    public void speedUp(){
        speed += 5;
        System.out.println("Vehicle speed: " + speed + " km/h");
    }
}
