package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> school = new HashMap<>();

        School school1 = new School(Arrays.asList(20, 25, 30), "Szkola nr 1");
        School school2 = new School(Arrays.asList(50, 100, 150), "Szkola nr 2");
        School school3 = new School(Arrays.asList(200, 250, 300), "Szkola nr 3");

        Principal principal1 = new Principal("Jan", "Kowalski");
        Principal principal2 = new Principal("Adam", "Blaszczyk");
        Principal principal3 = new Principal("Kasia", "Nowak");

        school.put(school1, principal1);
        school.put(school2, principal2);
        school.put(school3, principal3);

        for (Map.Entry<School, Principal> schoolDirector : school.entrySet()) {
            System.out.println("Liczba uczniow: " + schoolDirector.getKey().getsum() + ", Dyrektor: " + schoolDirector.getValue().getFirstName() + " " + schoolDirector.getValue().getSurname() + ", Szkola: " + schoolDirector.getKey().getNameSchool());
        }
    }
}
