/*
Na podstawie klasy abstrakcyjnej nie mozna utworzyć obiektu
 */

package com.kodilla.abstracts;

public abstract class Animal {
    private int numberOfLegs;

    public Animal (int numberOfLegs){   //konstruktor
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs(){   //getter
        return numberOfLegs;
    }
    /*
        Teraz definiujemy metode abstrakcyjna
        Dlaczego jest to metoda abstrakcyjna? Wymuszamy w ten sposób, aby każda klasa dziedzicząca po Animal
        dodawała własną implementację – każdy rodzaj zwierzęcia w inny sposób wydaje dźwięki.
        Dla metody abstrkcyjnej nie daje sie nawiasow klamrowych ! { }
     */
    public abstract void giveVoice(); // metoda abstrakcyjna - czytaj wyzej

    };

