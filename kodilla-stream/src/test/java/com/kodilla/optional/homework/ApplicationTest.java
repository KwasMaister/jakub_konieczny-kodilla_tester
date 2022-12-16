package com.kodilla.optional.homework;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    public void testGdyNauczycielJestNullem () {
        Student student = new Student("Kuba", null);
        Application.getNameTeacher(student);

        assertEquals("<undefined>", Application.getNameTeacher(student));

    }

    @Test
    public void testGdyNauczycielNieJestNullem () {
        Teacher teacher = new Teacher("Pawel");
        Student student = new Student("Adam", teacher);
        Application.getNameTeacher(student);

        assertEquals("Pawel", Application.getNameTeacher(student));
    }
}