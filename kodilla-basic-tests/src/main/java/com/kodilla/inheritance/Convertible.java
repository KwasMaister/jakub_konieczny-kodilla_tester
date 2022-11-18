package com.kodilla.inheritance;

public class Convertible extends Car {  //oznaczenie klasy jako dziedziczaca

    public Convertible(int wheels, int seats){//konstruktor
        super(wheels, seats); //instrukcja wywolujaca polecenie wywołania konstruktora z nadklasy nieprzyjmującego żadnych argumentów. Czyli wywolujemy konstruktor z klasy car
        System.out.println("Convertible construktor");
    }

    public void openRoof(){
        System.out.println("Opening roof ...");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }
        /*
        nadpisane metody openDoors z klasy Car
        Nadpisanie to nic innego jak dodanie tej samej metody ale z inną implementacja
         */
    public void openDoors() {
        System.out.println("Opening 2 doors");
        }
}
