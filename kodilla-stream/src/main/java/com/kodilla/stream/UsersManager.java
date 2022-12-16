package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<String> usersOlderBy = filterUsersByAge(49);
        System.out.println(usersOlderBy);

        List<String> usersNumberOfPost = filterUsersByNumberOfPost(116);
        System.out.println(filterUsersByNumberOfPost(116));
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))  // użytkownicy, którzy spełniają ten warunek są przepuszczani dalej (Warunek: getGroup().equals("Chemists")))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static List <String> filterUsersByAge(int age){
       List<String> usernames = UsersRepository.getUsersList()
               .stream()
               .filter(userAge -> userAge.getAge() > age)
               .map(UsersManager::getUserName)
               .collect(Collectors.toList());

        return usernames;
    }

    public static List <String> filterUsersByNumberOfPost (int numberOfPost){
        List <String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(userNumber -> userNumber.getNumberOfPost() == numberOfPost)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }


    public static String getUserName(User user) {
        return user.getUsername();
    }



}