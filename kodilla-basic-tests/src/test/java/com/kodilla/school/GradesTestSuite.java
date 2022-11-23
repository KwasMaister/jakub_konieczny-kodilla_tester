package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Dla każdej klasy robic najlepiej osobny test tak ? W osobnym pakiecie
 */
public class GradesTestSuite {
    @Test
    public void shouldHaveZeroLength() {  //kazde testy maja poczatek "public void nazwaTestu(){}" ???
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(2, values[1]);
    }

    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01); //wartosc oczekiwania, wartosc obliczona, delta
    }

    /*
    Po każdym tescie wartości są zerowane ? Czyli:
    1. Piszemy test, przypisujemy wartosci
    2. Test się wykonuje. Zwrotka czy sie test udal czy nie
    3. Koniec testy. Kolejny test wykonuje się z pustymi wartosci.
    Chodzi mi o to ze poszczegolne testy nie dziedzicza jakis wartosci zmiennych czy tam zawartosci tablicy
     */
    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() { //tutaj wykonujemy test jak dla getaverage nie przekazujemy zadnych wartosci ?
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.0001);
    }

    @Test
    public void shouldCalculateAveragesIfValuesAreOutsideRange() {
        Student student = new Student("Martin");
        student.addGeographyGrade(-2);
        student.addGeographyGrade(4);
        student.addGeographyGrade(8);

        student.addMathGrade(0);

        student.addPhysicsGrade(19);
        student.addPhysicsGrade(3);
        student.addPhysicsGrade(3);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(4, geographyAverage, 0.01);
        assertEquals(0, historyAverage, 0.01);
        assertEquals(0, mathsAverage, 0.01);
        assertEquals(3, physicsAverage, 0.01);
    }
}
