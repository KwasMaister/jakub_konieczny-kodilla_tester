package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfProduction;

    public OperatingSystem(int yearOfProduction){
        this.yearOfProduction = yearOfProduction;
        System.out.println("Year of production: " + yearOfProduction);
    }
    public void turnOn(){
        System.out.println("Turn on: Operating System");
    }

    public void turnOff(){
        System.out.println("Turn off: Operating System");
    }

    public int getYearOfProduction(){
       return yearOfProduction;
    }

    public void displayGetYearOfProduction() {
        System.out.println("Class OperatingSystem -> Metoda: getYearOfProduction: " + yearOfProduction);
    }
}
