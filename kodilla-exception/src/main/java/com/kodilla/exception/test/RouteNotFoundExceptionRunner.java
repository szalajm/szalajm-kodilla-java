package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {

        Flight testFlight = new Flight("Warszawa", "Gdańsk");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(testFlight);

        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, but this destination is not served");

        }
    }
}
