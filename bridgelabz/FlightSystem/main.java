package com.bridgelabz.FlightSystem;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Create Flight instances
        Flight<Integer> flight1 = new Flight<>(101, "New York", "London");
        Flight<Integer> flight2 = new Flight<>(202, "Delhi", "Dubai");

        // Display flight information
        flight1.displayFlightInfo();
        flight2.displayFlightInfo();

        // Create a booking for a passenger
//        Booking flightSystem = new Booking(5001,"sf");  // Create an instance to access inner classes
        Booking<Integer> booking1 = new Booking<>(5001, flight1, "SuperMan");
        Booking<Integer> booking2 = new Booking<>(5002, flight2, "BatMan");


        // Display booking details
        booking1.displayBookingInfo();
        booking2.displayBookingInfo();


        // Flight Manager (bounded generics)
        FlightManager<Integer> flightManager = new FlightManager<>();
        flightManager.addFlight(flight1);
        flightManager.addFlight(flight2);

        // Display all flights
        System.out.println("\nAll Available Flights:");
        flightManager.displayAllFlights();

        // Using Utility Method
        List<Flight<Integer>> flightList = new ArrayList<>();
        flightList.add(flight1);
        flightList.add(flight2);

        System.out.println("\nFlight Details from Utility:");
        FlightUtility.displayFlightDetails(flightList);
    }
}
