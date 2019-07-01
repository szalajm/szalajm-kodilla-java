package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ScheduleOperator {
    private final List<Flight> schedule;

    public ScheduleOperator(final ArrayList<Flight> schedule) {
        this.schedule = schedule;
    }

    public List<Flight> getFlights(String startingAirport, String destinationAirport) {
        List<Flight> resultList =
                schedule.stream()
                        .filter(e -> e.getStartingAirport().equals(startingAirport) && e.getDestinationAirport().equals(destinationAirport))
                        .collect(Collectors.toList());

        System.out.println("We have identified a list of " + resultList.size() + " suitable flights");
        resultList.stream()
                .forEach(System.out::println);

        return resultList;

    }


    public List<Flight> getIndirectFlights(String startingAirport, String destinationAirport) {
        List<Flight> resultListStart =
                schedule.stream()
                        .filter(e -> e.getStartingAirport().equals(startingAirport))
                        .collect(Collectors.toList());


        List<Flight> resultListDestination =
                schedule.stream()
                        .filter(e -> e.getDestinationAirport().equals(destinationAirport))
                        .collect(Collectors.toList());

        List<Flight> flightList = new ArrayList<Flight>();

        for (Flight flight : resultListStart) {
            for (Flight flightB : resultListDestination) {
                if (flight.getDestinationAirport().equals(flightB.getStartingAirport())) {
                    flightList.add(flight);
                    flightList.add(flightB);
                }

            }

            System.out.println("We have identified:" + flightList.size() + "Suitable flight");
            flightList.stream()
                    .forEach(System.out::println);

        }

        return flightList;

    }
}

