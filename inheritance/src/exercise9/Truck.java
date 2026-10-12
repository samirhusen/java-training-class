package exercise9;

public class Truck extends Vehicle {

     static void main(String[] args){
        Truck truck = new Truck();

        truck.make = "Volvo";
        truck.model = "FH";
        truck.year = 2025;
        truck.fuelType = "Diesel";
        truck.maxSpeed = 90; // Example value

        double efficiency = truck.calculateFuelEfficiency(300, 100);

        System.out.println("Truck: " + truck.make + " " + truck.model);
        System.out.println("Year: " + truck.year);
        System.out.println("Fuel type: " + truck.fuelType);
        System.out.println("Fuel efficiency: " + efficiency + " km/L");
        System.out.println("Distance: " + truck.calculateDistance(50, efficiency) + " km");
        System.out.println("Maximum speed: " + truck.getMaxSpeed() + " km/h");
    }
}
