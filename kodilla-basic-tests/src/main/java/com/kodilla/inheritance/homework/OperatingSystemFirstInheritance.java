package com.kodilla.inheritance.homework;

public class OperatingSystemFirstInheritance extends OperatingSystem {
    public OperatingSystemFirstInheritance(int yearOfProduction) {
        super(yearOfProduction);
        System.out.println("OperatingSystemFirstInheritance --> construktor");
    }

    /*
    @Override
    public void turnOn() {
        System.out.println("Turn on: OperatingSystemFirstInheritance");
    }

    public void turnOff(){
        System.out.println("Turn off: OperatingSystemFirstInheritance");
    }

     */
}
