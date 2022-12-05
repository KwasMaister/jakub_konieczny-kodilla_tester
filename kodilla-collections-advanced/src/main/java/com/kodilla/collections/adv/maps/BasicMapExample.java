package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        /*
        Map<K, V> myVar;
        Map<K, V> to typ zmiennej,
        myVar to nazwa zmiennej.
        K i V są typami odpowiednio: klucza i wartości.
         */

        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", 5.0);
        grades.put("Physics", 4.5);
        grades.put("Philosophy", 4.0);

        double grade = grades.get("Mathematics");
        System.out.println(grade);

        /*
        aby dostac sie do definicji mapy trzeba skorzystac z zapisu Map.Entry (Klasa Entry jest wbudowana w interfejs Map)
        grades.entrySet() --> metoda zwraca zbior wszystkich elementow mapy
         */
        for (Map.Entry<String, Double> note: grades.entrySet()){
            System.out.println("Grade of " + note.getKey() + " is equal to " + note.getValue());
        }
    }
}
