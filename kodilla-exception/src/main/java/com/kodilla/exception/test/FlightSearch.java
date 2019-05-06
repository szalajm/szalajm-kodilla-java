package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightMap = new HashMap<>();

        Flight destination1 = new Flight("Warszawa", "Kraków");
        Flight destination2 = new Flight("Poznań", "Radom");
        Flight destination3 = new Flight("Olsztyn", "Wrocław");

        flightMap.put(destination1.getDepartureAirport(), Boolean.FALSE);
        flightMap.put(destination2.getDepartureAirport(), Boolean.FALSE);
        flightMap.put(destination3.getDepartureAirport(), Boolean.TRUE);



        if(flightMap.containsKey(flight.getDepartureAirport())&& flightMap.get(flight.getDepartureAirport())){
            System.out.println("Destination available");
        } else {
            throw new RouteNotFoundException("Destination not found");
        }









    }
}
