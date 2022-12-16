package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {


    @Test
    public void testFilterChemistGroupUsernames () {
        List<String> user = UsersManager.filterChemistGroupUsernames();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");

        assertEquals(expectedList, user);
    }

    @Test
    public void firstTestfilterUsersByAge () {
        List<String> user = UsersManager.filterUsersByAge(49);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Mike Ehrmantraut");

        assertEquals(expectedList, user);
    }

    @Test
    public void secondTestfilterUsersByAge () {
        List<String> user = UsersManager.filterUsersByAge(101);
        List<String> expectedList = new ArrayList<>();

        assertEquals(expectedList, user);
    }

    @Test
    public void firstTestfilterUsersByNumberOfPost () {
        List<String> user = UsersManager.filterUsersByNumberOfPost(116);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Tuco Salamanca");

        assertEquals(expectedList, user);
    }

    @Test
    public void secondTestfilterUsersByNumberOfPost () {
        List<String> user = UsersManager.filterUsersByNumberOfPost(1162);
        List<String> expectedList = new ArrayList<>();

        assertEquals(expectedList, user);
    }



}