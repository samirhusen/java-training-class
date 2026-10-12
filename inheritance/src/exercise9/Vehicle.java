package exercise9;

// 9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
//    Each subclass should have properties such as make, model, year, and fuel type.
//    Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;
    protected double maxSpeed;

    public double calculateFuelEfficiency(double distance, double fuelUsed){
        return distance / fuelUsed; // kilometers per liter
    }

    public double calculateDistance(double fuel, double fuelEfficiency){
        return fuel * fuelEfficiency; // kilometers
    }

    public double getMaxSpeed(){
        return maxSpeed; // kilometers per hour
    }
}
