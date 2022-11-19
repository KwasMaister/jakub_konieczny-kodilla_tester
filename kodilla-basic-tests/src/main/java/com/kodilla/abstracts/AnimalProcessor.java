package com.kodilla.abstracts;

public class AnimalProcessor {
    public void process(Animal animal){ // w argumencie przyjmuje abstrakcyjny typ "Animal". "animal" ogolny typ dziedziczy kazdy obiekt po klasie Animal

        System.out.println("Animal has " + animal.getNumberOfLegs() + " legs");
        animal.giveVoice();
    }
}
