package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
            stamps.add(new Stamp ("Krakow", 10.5, 9.5, true));
            stamps.add(new Stamp ("Cieszyn", 5.5, 6.5, false));
            stamps.add(new Stamp ("Wroclaw", 11.5, 9.5, true));
            stamps.add(new Stamp ("Krakow", 10.5, 9.5, true));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps){
            System.out.println(stamp);
        }
    }
}
