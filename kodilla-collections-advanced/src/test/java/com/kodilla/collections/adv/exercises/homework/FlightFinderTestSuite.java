package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

        @Test
        public void testFindFlightsFrom(){
            FlightFinder flightFinder = new FlightFinder();
            List<Flight> result = flightFinder.findFlightsFrom("Warszawa");

            List<Flight> expectedList = new ArrayList<>();
            expectedList.add(new Flight("Warszawa", "Krakow"));
            expectedList.add(new Flight("Warszawa", "Londyn"));
            expectedList.add(new Flight("Warszawa", "Radom"));

            assertEquals(expectedList, result);
        }

        @Test
    public void testFindFlightsTo (){
            FlightFinder flightFinder = new FlightFinder();
            List<Flight> result = flightFinder.findFlightsTo("Dortmund");
            List<Flight> expectedList = new ArrayList<>();
            expectedList.add(new Flight("Radom", "Dortmund"));
            expectedList.add(new Flight("Gdansk", "Dortmund"));

            assertEquals(expectedList, result);

        }
}