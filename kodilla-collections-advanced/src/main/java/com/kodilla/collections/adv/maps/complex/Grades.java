package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades(List<Double> grades){ // konstruktor ktory w argumencie przyjmuje dowolna liczbe ocen - Efekt taki uzyskamy, używając listy jako parametru wejściowego konstruktora:
        this.grades = grades;
    }

    /*
    Klasa Arrays pochodzi z pakietu java.util, a jej metoda asList() tworzy listę, która będzie zawierała przekazane
    argumenty wejściowe do metody asList(). Do tej metody możesz przekazać tyle argumentów wejściowych, ile potrzebujesz.
     */

    public double getAverage(){
        double sum = 0.0;
        for (double grade : grades)
            sum += grade;
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Grades: " + grades.toString();
    }
}
