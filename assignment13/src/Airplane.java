// 12. Create an Airplane with flight number, destination, and departure time
//     attributes, and methods to check flight status and delay the flight.

import java.time.LocalTime;

public class Airplane {

    private String flightNumber;
    private String destination;
    private LocalTime departureTime;
    private int delayMinutes;

    public Airplane(String flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void delayFlight(int minutes) {
        if (minutes > 0) {
            delayMinutes = delayMinutes + minutes;
            departureTime = departureTime.plusMinutes(minutes);
        } else {
            System.out.println("Enter a positive number of minutes.");
        }
    }

    public void checkFlightStatus() {
        System.out.println("Flight number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure time: " + departureTime);

        if (delayMinutes == 0) {
            System.out.println("Status: On time");
        } else {
            System.out.println("Status: Delayed by " + delayMinutes + " minutes");
        }
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane("AA101", "New York", LocalTime.of(10, 30));

        airplane.checkFlightStatus();

        airplane.delayFlight(45);

        System.out.println("After delaying the flight:");
        airplane.checkFlightStatus();
    }
}
