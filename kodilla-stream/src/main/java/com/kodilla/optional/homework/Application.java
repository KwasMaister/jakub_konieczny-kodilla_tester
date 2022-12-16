package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kuba", new Teacher("Czeslaw")));
        students.add(new Student("Lukasz", new Teacher("Adam")));
        students.add(new Student("Pawel", new Teacher("Adam")));
        students.add(new Student("Ada", null));
        students.add(new Student("Ania", null));

        for (Student student : students) {
            String teacherName = getNameTeacher(student);
            System.out.println("Student: " + student.getName() + ", Teacher: " + teacherName);
        }
    }

    public static String getNameTeacher (Student student){

        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();

        return teacherName;
    }

}
