package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public Car(int wheels, int seats){   //konstruktor
        this.wheels = wheels;
        this.seats = seats;
        System.out.println("Car constructor");
    }
    public void turnOnLights() { //metoda
        System.out.println("Lights were turned on");
    }

    public void openDoors(){  //metoda
        System.out.println("Opening 4 doors");
    }

    public int getWheels(){  //gettery -  getter to metoda, która jedynie zwraca wartość, nic nie modyfikuje
        return wheels;
    }

    public int getSeats(){  //gettery
       return seats;
    }

    public void displayNumberOfSeats(){   //metoda
        System.out.println("Number of seats: " + seats);
    }
}
