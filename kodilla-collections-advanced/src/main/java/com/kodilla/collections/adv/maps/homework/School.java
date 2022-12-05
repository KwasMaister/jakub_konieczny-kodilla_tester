package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List <Integer> students = new ArrayList<>();
    private String nameSchool;

    public School(List<Integer> students, String nameSchool){
        this.students = students;
        this.nameSchool = nameSchool;
    }

    public  String getNameSchool() {
        return nameSchool;
    }

    public int getsum(){
        int sum = 0;
        for (int student : students)
            sum += student;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
