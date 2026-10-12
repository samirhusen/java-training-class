package exercise9;

public class Motorcycle extends Vehicle{

    static void main(String[] args){
        Motorcycle motorcycle = new Motorcycle();

        motorcycle.make = "Yamaha";
        motorcycle.model = "R1";
        motorcycle.year = 2026;
        motorcycle.fuelType = "Petrol";
        motorcycle.maxSpeed = 240;

        double efficiency = motorcycle.calculateFuelEfficiency(200, 20);

        System.out.println("Motorcycle: " + motorcycle.make + " " + motorcycle.model);
        System.out.println("Year: " + motorcycle.year);
        System.out.println("Fuel type: " + motorcycle.fuelType);
        System.out.println("Fuel efficiency: " + efficiency + " km/L");
        System.out.println("Distance: " + motorcycle.calculateDistance(10, efficiency) + " km");
        System.out.println("Maximum speed: " + motorcycle.getMaxSpeed() + " km/h");
    }
}
