package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println("Average over 40: " + averageNumberOfPostOver40(UsersRepository.getUsersList()));
        System.out.println("Average under 40: " + averageNumberOfPostUnder40(UsersRepository.getUsersList()));
    }

    public static double averageNumberOfPostOver40 (List<User> users){
        double average = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return average;

    }

    public static double averageNumberOfPostUnder40 (List<User> users) {
        double average = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return average;


    }
}
