package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeTwo;

import java.util.Objects;

public class Flight {

    private final Integer flightNumber;
    private final String startingAirport;
    private final String destinationAirport;


    public Flight(final Integer flightNumber, final String startingAirport, final String destinationAirport) {
        this.flightNumber = flightNumber;
        this.startingAirport = startingAirport;
        this.destinationAirport = destinationAirport;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public String getStartingAirport() {
        return startingAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightNumber, flight.flightNumber) &&
                Objects.equals(startingAirport, flight.startingAirport) &&
                Objects.equals(destinationAirport, flight.destinationAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, startingAirport, destinationAirport);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", startingAirport='" + startingAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                '}';
    }
}
