package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {





    @Test
    public void firstStream (){

        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        for (User nameUsers : users){
          //  nameUsers = User.
        }

    }



}