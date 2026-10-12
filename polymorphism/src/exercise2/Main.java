package exercise2;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        vehicle.speedUp();
        car.speedUp();
        bicycle.speedUp();

        System.out.println("--------------");

        vehicle.speedUp();
        car.speedUp();
        bicycle.speedUp();
    }
}
