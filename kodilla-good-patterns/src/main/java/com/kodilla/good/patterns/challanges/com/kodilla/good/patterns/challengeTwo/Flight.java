package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeTwo;

import java.util.Objects;

public class Flight {

    private final Integer flightNumber;
    private final String startingAirport;
    private final String destinationAirport;
    private final String transferAirport;

    public Flight(final Integer flightNumber, final String startingAirport, final String destinationAirport, final String transferAirport) {
        this.flightNumber = flightNumber;
        this.startingAirport = startingAirport;
        this.destinationAirport = destinationAirport;
        this.transferAirport = transferAirport;
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

    public String getTransferAirport() {
        return transferAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightNumber, flight.flightNumber) &&
                Objects.equals(startingAirport, flight.startingAirport) &&
                Objects.equals(destinationAirport, flight.destinationAirport) &&
                Objects.equals(transferAirport, flight.transferAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, startingAirport, destinationAirport, transferAirport);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", startingAirport='" + startingAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", transferAirport='" + transferAirport + '\'' +
                '}';
    }
}
