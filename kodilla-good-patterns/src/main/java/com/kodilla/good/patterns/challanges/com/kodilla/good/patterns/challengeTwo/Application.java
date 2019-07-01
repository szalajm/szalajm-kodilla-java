package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeTwo;

import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String args[]) {

        ArrayList<Flight> WarszawaWroclawSchedule = new ArrayList<>();

        Flight f120 = new Flight(120, "Wroclaw", "Warszawa");
        Flight f121 = new Flight(121, "Warszawa", "Wroclaw");
        Flight f122 = new Flight(122, "Warszawa", "Wroclaw");
        Flight f123 = new Flight(123, "Wroclaw", "Warszawa");
        Flight f124 = new Flight(124, "Wrocłąw", "Lodz");
        Flight f125 = new Flight(125, "Lodz", "Warszawa");
        Flight f130 = new Flight(130, "Wroclaw", "Lodz");


        WarszawaWroclawSchedule.add(f120);
        WarszawaWroclawSchedule.add(f121);
        WarszawaWroclawSchedule.add(f122);
        WarszawaWroclawSchedule.add(f123);
        WarszawaWroclawSchedule.add(f124);
        WarszawaWroclawSchedule.add(f125);
        WarszawaWroclawSchedule.add(f130);


        ScheduleOperator schedule = new ScheduleOperator(WarszawaWroclawSchedule);

        schedule.getFlights("Warszawa", "Wroclaw");
        schedule.getFlights("Wroclaw", "Warszawa");

        schedule.getIndirectFlights("Warszawa", "Wroclaw");
        schedule.getIndirectFlights("Wroclaw", "Warszawa");

    }
}
