package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    public void testAverageNumberOfPostOver40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        users.add(new User("Kuba", 40, 100, "Security"));
        users.add(new User("Marcin", 39, 1000, "Security"));

        double average = ForumStats.averageNumberOfPostOver40(users);

        assertEquals(21.8, average);

    }

    @Test
    public void testAverageNumberOfPostUnder40 () {
        List<User> users = new ArrayList<>();
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Tuco Salamanca", 39, 2, "Manager"));
        users.add(new User("Kuba", 40, 150, "Manager"));
        users.add(new User("Marcin", 45, 500, "Manager"));

        double average = ForumStats.averageNumberOfPostUnder40(users);

        assertEquals(1588.6666666666667, average);
    }






}