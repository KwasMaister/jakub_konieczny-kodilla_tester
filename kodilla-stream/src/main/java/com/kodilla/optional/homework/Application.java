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
        students.add(new Student("Ada", null)); // dlaczego po prostu null a nie "new Teacher (null)"
        students.add(new Student("Ania", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacher = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Student: " + student.getName() + ", Teacher: " + teacher.getName());
        }
    }
}
