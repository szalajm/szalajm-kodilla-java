package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightMap = new HashMap<>();

        Flight destination1 = new Flight("Warszawa", "Kraków");
        Flight destination2 = new Flight("Poznań", "Radom");
        Flight destination3 = new Flight("Olsztyn", "Wrocław");

        flightMap.put(destination1.getArrivalAirport(), Boolean.TRUE);
        flightMap.put(destination2.getArrivalAirport(), Boolean.FALSE);
        flightMap.put(destination3.getArrivalAirport(), Boolean.TRUE);

        if(flightMap.containsKey(flight.getDepartureAirport())){
            System.out.println("Destination available");
        } else {
            throw new RouteNotFoundException("Destination not found");
        }









    }
}
