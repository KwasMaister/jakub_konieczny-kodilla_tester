package com.kodilla.optional.homework;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    public void testGdyNauczycielJestNullem () {
        List<Student> students = new ArrayList<>();
        Teacher teacher1 = new Teacher(null);
        students.add(new Student("Ada", null));


        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            if (optionalTeacher.isEmpty())
            teacher1 = optionalTeacher.orElse(new Teacher("<undefined>"));
        }

        assertEquals("<undefined>", teacher1.getName());
    }

    @Test
    public void testGdyNauczycielNieJestNullem () {
        List<Student> students = new ArrayList<>();
        Teacher teacher1 = new Teacher(null);
        students.add(new Student("Ada", new Teacher("Andrzej")));


        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            if (!optionalTeacher.isEmpty())
                teacher1 = optionalTeacher.orElse(new Teacher("<undefined>"));
        }

        assertEquals("Andrzej", teacher1.getName());
    }
    }