package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {

    // static Map<String, List<Flight>> flightFinder = new HashMap<>();

    public  List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsFrom = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                flightsFrom.add(flight);
            }
        }
        return flightsFrom;

        //return flightFinder.getOrDefault(departure, Collections.emptyList());
        //return Collections.emptyList();
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> FlightsTo = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                FlightsTo.add(flight);
            }
        }
        return FlightsTo;
    }
}
