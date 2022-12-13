package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }



    /*
    public static List <String> usersOlderThanX(){
        List<String> usernamesAge = UsersRepository.getUsersList()
                .stream()
                .map(user -> user.getAge())
                .map(UsersManager::gateUsersOlderThanX)

                return usernamesAge;
    }

     */
/*
    public static String gateUsersOlderThanX (User user){
        int age = 40;
        if (age > user.getAge()){
            return user.getUsername();
    } else return null;
    }

 */
}