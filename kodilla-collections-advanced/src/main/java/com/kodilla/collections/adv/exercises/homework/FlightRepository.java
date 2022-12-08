package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {


    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Krakow"));
        flights.add(new Flight("Warszawa", "Londyn"));
        flights.add(new Flight("Krakow", "Warszawa"));
        flights.add(new Flight("Warszawa", "Radom"));
        flights.add(new Flight("Radom", "Dortmund"));
        flights.add(new Flight("Gdansk", "Dortmund"));
        return flights;
    }

   /*
    public static Map<String, Integer> getFlightsTable(){
        Map<String, Integer> flightRepository = new HashMap<>();
        flightRepository.put("Katowice", 10);
        flightRepository.put("Krakow", 20);
        flightRepository.put("Warszawa", 30);
        return flightRepository;
    }

    */





}
