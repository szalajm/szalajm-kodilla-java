package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeTwo;

import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main (String args[]) {

        ArrayList<Flight> WarszawaWroclawSchedule = new ArrayList<>();

        Flight f120 = new Flight(120, "Wroclaw", "Warszawa", "NONE");
        Flight f121 = new Flight (121, "Warszawa", "Wroclaw","NONE");
        Flight f122 = new Flight (122, "Warszawa", "Wroclaw", "Krakow");
        Flight f123 = new Flight (123, "Wroclaw", "Warszawa", "Poznan");

        WarszawaWroclawSchedule.add(f120);
        WarszawaWroclawSchedule.add(f121);
        WarszawaWroclawSchedule.add(f122);
        WarszawaWroclawSchedule.add(f123);

        ScheduleOperator schedule = new ScheduleOperator(WarszawaWroclawSchedule);
        schedule.getDirectFlights("Warszawa", "Wroclaw");
        schedule.getIndirectFlights("Wroclaw", "Warszawa");

    }
}
