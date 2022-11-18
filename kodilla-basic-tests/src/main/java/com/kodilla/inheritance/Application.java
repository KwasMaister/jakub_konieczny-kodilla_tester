package com.kodilla.inheritance;

public class Application {

    public static void main (String [] args){
        Car car = new Car(4,5); // obiekt car
        car.turnOnLights(); //użycie metody turnOnLights

        Convertible convertible = new Convertible(4,2); //obiekt convertible
        convertible.displayNumberOfSeats();
        //System.out.println(convertible.getSeats());
    }
}
