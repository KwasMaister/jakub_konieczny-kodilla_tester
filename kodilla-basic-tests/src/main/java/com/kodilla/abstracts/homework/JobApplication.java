package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Person andrzej = new Person("Andrzej ", 20, new CarMechanick()); //wywolanie obiektu CarMechanick
        andrzej.show();
        andrzej.responsibilities();
        andrzej.salary();

        Person mikolaj = new Person("Mikolaj ", 30, new Doctor());
        mikolaj.show();
        mikolaj.responsibilities();
        mikolaj.salary();

        Person basia = new Person("Basia ", 40, new Journalist());
        basia.show();
        basia.responsibilities();
        basia.salary();

    }
}
