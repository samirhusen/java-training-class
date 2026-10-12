package exercise9;

public class Car extends Vehicle{

    static void main(String[] args) {
        Car car = new Car();

        car.make = "Toyota";
        car.model = "Corolla";
        car.year = 2025;
        car.fuelType = "Petrol";
        car.maxSpeed = 180; // Example value

        double efficiency = car.calculateFuelEfficiency(300, 20);

        System.out.println("Car: " + car.make + " " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Fuel type: " + car.fuelType);
        System.out.println("Fuel efficiency: " + efficiency + " km/L");
        System.out.println("Distance: " + car.calculateDistance(10, efficiency) + " km");
        System.out.println("Maximum speed: " + car.getMaxSpeed() + " km/h");
    }
}
